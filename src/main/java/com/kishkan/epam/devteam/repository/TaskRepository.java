package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Task;

public interface TaskRepository {
    void addTask (Task task);
    void updateStatus (int id, String status);
    Task getTaskById(int id);
}
