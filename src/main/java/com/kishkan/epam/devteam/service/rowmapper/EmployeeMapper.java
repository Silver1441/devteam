package com.kishkan.epam.devteam.service.rowmapper;

import com.kishkan.epam.devteam.dto.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("staff_id"));
        employee.setName(resultSet.getString("name"));
        employee.setPatronymic(resultSet.getString("patronymic"));
        employee.setSurname(resultSet.getString("surname"));
        employee.setLogin(resultSet.getString("login"));
        employee.setAppointment(resultSet.getString("appointment"));
        employee.setCompetenceGrade(resultSet.getString("competence_grade_rank"));

        return employee;
    }
}
