package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Task;

public interface TaskRepositoryManager {
    void addTask (Task task);
    Task getTaskById(int id);
}
