package com.kishkan.epam.devteam.service.builder;

import com.kishkan.epam.devteam.dto.Employee;

public interface EmployeeBuilder {
    Employee buildEmployee(String name, String patronymic, String surname, String login, String password,
                           String appointment, String competenceGrade);
}
