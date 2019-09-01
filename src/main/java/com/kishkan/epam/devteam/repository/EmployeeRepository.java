package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Employee;

import java.util.List;

public interface EmployeeRepository {
    void addEmployee (Employee employee);
    Employee getEmployeeById (int id);
    List<Employee> getEmployeesByAppointment(String appointment);
}
