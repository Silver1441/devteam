package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.dto.Project;
import com.kishkan.epam.devteam.service.builder.ProjectBuilder;
import com.kishkan.epam.devteam.service.manager.EmployeeRepositoryManager;
import com.kishkan.epam.devteam.service.manager.ProjectRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoAddProject {

    @Autowired
    ProjectRepositoryManager projectRepositoryManager;

    @Autowired
    EmployeeRepositoryManager employeeRepositoryManager;

    @Autowired
    ProjectBuilder projectBuilder;

    public void addProject() {
        Project project = projectBuilder.buildProject("test_project", "test_project1",
                employeeRepositoryManager.getEmployeeById(1001));

        projectRepositoryManager.addProject(project);
        System.out.println(project.getName() + " is added");
    }
}
