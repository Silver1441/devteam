package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.service.builder.TaskBuilder;
import com.kishkan.epam.devteam.service.manager.EmployeeRepositoryManager;
import com.kishkan.epam.devteam.service.manager.TaskRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoAddTask {

    @Autowired
    TaskRepositoryManager taskRepositoryManager;

    @Autowired
    EmployeeRepositoryManager employeeRepositoryManager;

    @Autowired
    TaskBuilder taskBuilder;

    public void addTask() {
        Task task = taskBuilder.buildTask("test_name1", "test_description1",
                employeeRepositoryManager.getEmployeeById(1001));

        taskRepositoryManager.addTask(task);
        System.out.println(task.getName() + " is added");
    }
}
