package com.exo1.exo1.repository;

import com.exo1.exo1.entity.ProjectTaskCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTaskCountRepository extends JpaRepository<ProjectTaskCount, Long> {
    List<ProjectTaskCount> findByProjectId(Long projectId);
}
