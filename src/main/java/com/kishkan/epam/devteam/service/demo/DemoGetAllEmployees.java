package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.service.manager.EmployeeRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoGetAllEmployees {

    @Autowired
    EmployeeRepositoryManager employeeRepositoryManager;

    public void getAllEmployees() {
        List<Employee> list = employeeRepositoryManager.getAllEmployees();
        for (Employee employee:list) {
            System.out.println("Сотрудник: " + employee);
        }
    }
}
