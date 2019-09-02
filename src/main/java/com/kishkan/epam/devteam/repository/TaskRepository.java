package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Task;

import java.util.List;

public interface TaskRepository {
    void addTask (Task task);
    void updateStatus (int id, String status);
    Task getTaskById(int id);
    List<Task> getAllTasks();
    List<Task> getTasksByEmployeeId(int id);
}
