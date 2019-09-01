package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Employee;

public interface EmployeeRepositoryManager {
    void addEmployee (Employee employee);
    Employee getEmployeeById (int id);
}
