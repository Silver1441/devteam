package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.service.rowmapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EmployeeMapper employeeMapper;

    private String sql;

    @Override
    public void addEmployee (Employee employee) {
        sql = "INSERT INTO employee (`name`, `patronymic`, `surname`, `login`, `password`, " +
                "`appointment`, `competence_grade_rank`) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, employee.getName(), employee.getPatronymic(), employee.getSurname(),
                employee.getLogin(), employee.getPassword(), employee.getAppointment(), employee.getCompetenceGrade());
        sql = null;
    }

}
