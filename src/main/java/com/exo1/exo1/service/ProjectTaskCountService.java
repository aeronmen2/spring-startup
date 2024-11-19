package com.exo1.exo1.service;

import com.exo1.exo1.entity.ProjectTaskCount;
import com.exo1.exo1.repository.ProjectTaskCountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectTaskCountService {

    private final ProjectTaskCountRepository projectTaskCountRepository;

    public List<ProjectTaskCount> getAllProjectTaskCounts() {
        return projectTaskCountRepository.findAll();
    }

    public List<ProjectTaskCount> searchById(String id) {
        return projectTaskCountRepository.findByProjectId(Long.parseLong(id));
    }
}
