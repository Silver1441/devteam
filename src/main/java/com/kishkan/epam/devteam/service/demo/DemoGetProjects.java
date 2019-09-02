package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.service.manager.ProjectRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoGetProjects {

    @Autowired
    private ProjectRepositoryManager projectRepositoryManager;

    public void getProjectById(int id) {
        System.out.println(projectRepositoryManager.getProjectById(id));
    }

    public void getAllProjects() {
        System.out.println(projectRepositoryManager.getAllProjects());
    }

    public void getProjectsByEmployeeId(int id) {
        System.out.println(projectRepositoryManager.getProjectsByEmployeeId(id));
    }
}
