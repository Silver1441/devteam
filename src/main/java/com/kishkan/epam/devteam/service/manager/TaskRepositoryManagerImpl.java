package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskRepositoryManagerImpl implements TaskRepositoryManager {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void addTask (Task task){
        taskRepository.addTask(task);
    }

    @Override
    public void updateStatus (int id, String status) {
        taskRepository.updateStatus(id, status);
    }

    @Override
    public Task getTaskById(int id) {
        return taskRepository.getTaskById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    @Override
    public List<Task> getTasksByEmployeeId(int id) {
        return taskRepository.getTasksByEmployeeId(id);
    }

    @Override
    public List<Task> getTasksByStartDate(LocalDate date) {
        return taskRepository.getTasksByStartDate(date);
    }

    @Override
    public List<Task> getTasksByEndDate(LocalDate date) {
        return taskRepository.getTasksByEndDate(date);
    }
}
