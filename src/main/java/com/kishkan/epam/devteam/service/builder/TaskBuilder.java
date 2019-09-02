package com.kishkan.epam.devteam.service.builder;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.dto.Task;

public interface TaskBuilder {
    Task buildTask(String name, String taskDescription, Employee executor);
}
