package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Project;
import com.kishkan.epam.devteam.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectRepositoryManagerImpl implements ProjectRepositoryManager {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void addProject (Project project) {
        projectRepository.addProject(project);
    }

    @Override
    public Project getProjectById(int id) {
        return projectRepository.getProjectById(id);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.getAllProjects();
    }

    @Override
    public List<Project> getProjectsByEmployeeId(int id) {
        return projectRepository.getProjectsByEmployeeId(id);
    }
}
