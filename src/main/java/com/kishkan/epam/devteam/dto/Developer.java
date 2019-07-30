package com.kishkan.epam.devteam.dto;

import com.kishkan.epam.devteam.support.enums.DeveloperGrade;

public class Developer {
    private int id;
    private String name;
    private String surName;
    private String patronymic;
    private DeveloperGrade developerGrade;

    public Developer(int id, String name, String surName, String patronymic, DeveloperGrade developerGrade) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.developerGrade = developerGrade;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public DeveloperGrade getDeveloperGrade() {
        return developerGrade;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setDeveloperGrade(DeveloperGrade developerGrade) {
        this.developerGrade = developerGrade;
    }
}
