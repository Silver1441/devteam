package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Task;

public interface TaskRepository {
    void addTask (Task task);
    Task getTaskById(int id);
}
