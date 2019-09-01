package com.kishkan.epam.devteam.service.builder;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.service.StringCipher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeBuilderImpl implements EmployeeBuilder {

    @Autowired
    private StringCipher stringCipher;

    @Override
    public Employee buildEmployee(String name, String patronymic, String surname, String login, String password,
                              String appointment, String competenceGrade){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setPatronymic(patronymic);
        employee.setSurname(surname);
        employee.setLogin(login);
        employee.setPassword(stringCipher.getHash(password));
        employee.setAppointment(appointment);
        employee.setCompetenceGrade(competenceGrade);

        return employee;
    }
}
