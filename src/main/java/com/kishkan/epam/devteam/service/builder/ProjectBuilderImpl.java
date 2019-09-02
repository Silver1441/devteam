package com.kishkan.epam.devteam.service.builder;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.dto.Project;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProjectBuilderImpl implements ProjectBuilder {

    @Override
    public Project buildProject(String name, String projectDescription, Employee manager) {
        Project project = new Project();
        project.setName(name);
        project.setProjectDescription(projectDescription);
        project.setManager(manager);
        project.setProjectStatus("ONGOING");
        project.setStartDate(LocalDate.now());

        return project;
    }
}
