package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.service.manager.TaskRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DemoGetTasks {

    @Autowired
    private TaskRepositoryManager taskRepositoryManager;

    public void getTaskById(int id) {
        System.out.println(taskRepositoryManager.getTaskById(id));
    }

    public void getAllTasks() {
        System.out.println(taskRepositoryManager.getAllTasks());
    }

    public void getTasksByEmployeeId(int id) {
        System.out.println(taskRepositoryManager.getTasksByEmployeeId(id));
    }

    public void getTasksByStartDate(LocalDate date) {
        System.out.println(taskRepositoryManager.getTasksByStartDate(date));
    }

    public void getTasksByEndDate(LocalDate date) {
        System.out.println(taskRepositoryManager.getTasksByEndDate(date));
    }
}
