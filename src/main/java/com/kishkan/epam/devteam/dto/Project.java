package com.kishkan.epam.devteam.dto;

import java.time.LocalDate;

public class Project {
    private int id;
    private String name;
    private String projectDescription;
    private Employee manager;
    private String projectStatus;
    private LocalDate startDate;
    private LocalDate endDate;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getProjectDescription() {
        return projectDescription;
    }
    public Employee getManager() {
        return manager;
    }
    public String getProjectStatus() {
        return projectStatus;
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
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    public void setManager(Employee manager) {
        this.manager = manager;
    }
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
