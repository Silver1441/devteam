package com.kishkan.epam.devteam.support.enums;

public enum StaffCompetenceGrade {
    D1(1),
    D2(2),
    D3(3),
    D4(4),
    D5(5);

    int grade;
    StaffCompetenceGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
