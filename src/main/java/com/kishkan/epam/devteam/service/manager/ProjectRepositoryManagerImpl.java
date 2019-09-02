package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Project;
import com.kishkan.epam.devteam.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectRepositoryManagerImpl implements ProjectRepositoryManager {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void addProject (Project project) {
        projectRepository.addProject(project);

    }
}
