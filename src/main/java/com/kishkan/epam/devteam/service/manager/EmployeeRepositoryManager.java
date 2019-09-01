package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Employee;

import java.util.List;

public interface EmployeeRepositoryManager {
    void addEmployee (Employee employee);
    Employee getEmployeeById (int id);
    List<Employee> getEmployeesByAppointment(String appointment);
}
