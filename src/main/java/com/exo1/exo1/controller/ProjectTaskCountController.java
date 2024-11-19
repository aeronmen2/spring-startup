package com.exo1.exo1.controller;

import com.exo1.exo1.entity.ProjectTaskCount;
import com.exo1.exo1.service.ProjectTaskCountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProjectTaskCountController {

    private final ProjectTaskCountService projectTaskCountService;

    @GetMapping("/project-task-counts")
    public List<ProjectTaskCount> getAllTaskCounts() {
        return projectTaskCountService.getAllProjectTaskCounts();
    }

    @GetMapping("/project-task-counts/search")
    public List<ProjectTaskCount> searchById(String id) {
        return projectTaskCountService.searchById(id);
    }
}
