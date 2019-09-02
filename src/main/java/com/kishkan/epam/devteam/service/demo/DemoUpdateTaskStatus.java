package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.service.manager.TaskRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoUpdateTaskStatus {

    @Autowired
    TaskRepositoryManager taskRepositoryManager;

    public void updateStatus(int id, String status) {
        taskRepositoryManager.updateStatus(id, status);
        System.out.println(taskRepositoryManager.getTaskById(id).getName() + ": " +
                taskRepositoryManager.getTaskById(id).getTaskStatus());
    }
}
