package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.service.builder.EmployeeBuilder;
import com.kishkan.epam.devteam.service.manager.EmployeeRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoAddEmployee {

    @Autowired
    EmployeeRepositoryManager employeeRepositoryManager;

    @Autowired
    EmployeeBuilder employeeBuilder;

    public void addEmployee() {
        Employee employee = employeeBuilder.buildEmployee("Оксана", "Федоровна", "Кулакова",
                "Oksik", "Oksik", "tester", "D1");

        employeeRepositoryManager.addEmployee(employee);
        System.out.println(employee.getName() + " is added");
    }
}
