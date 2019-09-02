package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Project;

import java.util.List;

public interface ProjectRepository {
    void addProject (Project project);
    Project getProjectById(int id);
    List<Project> getAllProjects();
    List<Project> getProjectsByEmployeeId(int id);
}
