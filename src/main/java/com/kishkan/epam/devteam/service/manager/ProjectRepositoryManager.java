package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Project;

import java.util.List;

public interface ProjectRepositoryManager {
    void addProject (Project project);
    Project getProjectById(int id);
    List<Project> getAllProjects();
    List<Project> getProjectsByEmployeeId(int id);
}
