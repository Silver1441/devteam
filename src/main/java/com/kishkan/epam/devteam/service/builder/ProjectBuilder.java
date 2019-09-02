package com.kishkan.epam.devteam.service.builder;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.dto.Project;

public interface ProjectBuilder {
    Project buildProject(String name, String projectDescription, Employee manager);
}
