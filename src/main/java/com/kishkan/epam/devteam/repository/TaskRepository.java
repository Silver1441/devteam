package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Task;

public interface TaskRepository {
    Task getTaskById(int id);
}
