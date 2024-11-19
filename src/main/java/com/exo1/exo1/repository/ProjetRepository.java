package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @EntityGraph(attributePaths = {"users", "tasks"})
    Optional<Projet> findWithUsersAndTasksById(Long id);

    @EntityGraph(attributePaths = {"tasks"})
    Page<Projet> findAll(Pageable pageable);
}
