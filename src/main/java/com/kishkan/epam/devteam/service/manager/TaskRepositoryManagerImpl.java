package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskRepositoryManagerImpl implements TaskRepositoryManager {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task getTaskById(int id) {
        return taskRepository.getTaskById(id);
    }
}
