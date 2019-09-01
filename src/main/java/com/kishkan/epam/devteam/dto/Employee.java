package com.kishkan.epam.devteam.dto;


public class Employee {
    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private String login;
    private int password;
    private String appointment;
    private String competenceGrade;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getCompetenceGrade() {
        return competenceGrade;
    }
    public String getAppointment() {
        return appointment;
    }
    public String getLogin() {
        return login;
    }
    public int getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setCompetenceGrade(String competenceGrade) {
        this.competenceGrade = competenceGrade;
    }
    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id=" + id + ", " + name + " " + patronymic + " " + surname + ", " + competenceGrade +
                " " + appointment;
    }
}
