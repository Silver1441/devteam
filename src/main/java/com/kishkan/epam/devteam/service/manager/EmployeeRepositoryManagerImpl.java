package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRepositoryManagerImpl implements EmployeeRepositoryManager {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void addEmployee (Employee employee) {
        employeeRepository.addEmployee(employee);
    }
}
