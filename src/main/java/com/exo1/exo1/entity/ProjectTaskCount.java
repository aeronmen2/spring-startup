package com.exo1.exo1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project_task_count")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectTaskCount {
    @Id
    private Long projectId;
    private String projectName;
    private Long taskCount;
}
