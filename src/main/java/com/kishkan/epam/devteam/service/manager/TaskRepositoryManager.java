package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Task;

public interface TaskRepositoryManager {
    void addTask (Task task);
    void updateStatus (int id, String status);
    Task getTaskById(int id);
}
