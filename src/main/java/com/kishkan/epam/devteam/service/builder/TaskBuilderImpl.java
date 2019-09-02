package com.kishkan.epam.devteam.service.builder;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.dto.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TaskBuilderImpl implements TaskBuilder {

    @Override
    public Task buildTask(String name, String taskDescription, Employee executor){
        Task task = new Task();
        task.setName(name);
        task.setTaskDescription(taskDescription);
        task.setExecutor(executor);
        task.setTaskStatus("ISSUED");
        task.setStartDate(LocalDate.now());

        return task;
    }
}
