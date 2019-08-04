package com.kishkan.epam.devteam.dto;

import com.kishkan.epam.devteam.support.enums.TaskStatus;

import java.util.List;

public class Task {
    private int id;
    private String taskDescription;
    private StaffMember executor;
    private TaskStatus taskStatus;

    public Task(int id, String taskDescription, StaffMember executor, TaskStatus taskStatus) {
        this.id = id;
        this.taskDescription = taskDescription;
        this.executor = executor;
        this.taskStatus = taskStatus;
    }

    public int getId() {
        return id;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public StaffMember getExecutor() {
        return executor;
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
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    //Temporal toString for DEMO
    @Override
    public String toString() {
        return "Task number:" +
                " " + id +
                ", \"" + taskDescription + "\"" +
                ", executor: " + executor.getName() + " " + executor.getPatronymic() + " " + executor.getSurName()
                + ", current status: " + taskStatus + ".";
    }
}
