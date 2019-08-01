package com.kishkan.epam.devteam.dto;

import com.kishkan.epam.devteam.support.enums.StaffAppointment;
import com.kishkan.epam.devteam.support.enums.StaffCompetenceGrade;

public class StaffMember {
    private int id;
    private String name;
    private String surName;
    private String patronymic;
    private StaffCompetenceGrade staffCompetenceGrade;
    private StaffAppointment staffAppointment;

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
    public StaffCompetenceGrade getStaffCompetenceGrade() {
        return staffCompetenceGrade;
    }
    public StaffAppointment getStaffAppointment() {
        return staffAppointment;
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
    public void setStaffCompetenceGrade(StaffCompetenceGrade staffCompetenceGrade) {
        this.staffCompetenceGrade = staffCompetenceGrade;
    }
    public void setStaffAppointment(StaffAppointment staffAppointment) {
        this.staffAppointment = staffAppointment;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", " + name + " " + patronymic + " " + surName + ", " + staffCompetenceGrade +
                " " + staffAppointment +'}';
    }
}
