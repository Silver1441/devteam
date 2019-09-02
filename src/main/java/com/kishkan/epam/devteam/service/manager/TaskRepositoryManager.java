package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Task;

public interface TaskRepositoryManager {
    Task getTaskById(int id);
}
