package com.kishkan.epam.devteam.dto;

import java.time.LocalDate;


public class Task {
    private int id;
    private String name;
    private String taskDescription;
    private Employee executor;
    private String taskStatus;
    private LocalDate startDate;
    private LocalDate endDate;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public Employee getExecutor() {
        return executor;
    }
    public String getTaskStatus() {
        return taskStatus;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public void setExecutor(Employee executor) {
        this.executor = executor;
    }
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    //Temporal toString for DEMO
    @Override
    public String toString() {
        return "Task number:" +
                " " + id +
                ", \"" + name + "\"" +
                ", \"" + taskDescription + "\"" +
                ", executor: " + executor.getName() + " " + executor.getPatronymic() + " " + executor.getSurname()
                + ", current status: " + taskStatus + ", started: " + startDate + ", finished(?): " + endDate + ".";
    }
}
