package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @EntityGraph(attributePaths = {"project", "assignedUser"})
    Optional<Task> findById(Long id);

    @Query("SELECT t FROM Task t LEFT JOIN FETCH t.projet WHERE t.status = :status")
    Page<Task> findByStatus(String status, Pageable pageable);
}
