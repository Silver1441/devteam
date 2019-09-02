package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.service.manager.TaskRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoGetTasks {

    @Autowired
    TaskRepositoryManager taskRepositoryManager;

    public void getTaskById(int id) {
        System.out.println(taskRepositoryManager.getTaskById(id));
    }
}
