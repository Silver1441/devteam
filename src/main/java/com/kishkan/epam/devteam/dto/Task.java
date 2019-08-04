package com.kishkan.epam.devteam.dto;

import com.kishkan.epam.devteam.support.enums.TaskStatus;

import java.util.List;

public class Task {
    private int id;
    private String taskDescription;
    private StaffMember executor;
    private StaffMember taskManager;
    private TaskStatus taskStatus;

    public int getId() {
        return id;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public StaffMember getExecutor() {
        return executor;
    }
    public StaffMember getTaskManager() {
        return taskManager;
    }
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public void setExecutor(StaffMember executor) {
        this.executor = executor;
    }
    public void setTaskManager(StaffMember taskManager) {
        this.taskManager = taskManager;
    }
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
