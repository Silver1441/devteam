package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.service.manager.EmployeeRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoGetEmployeeById {

    @Autowired
    EmployeeRepositoryManager employeeRepositoryManager;

    public void getEmployeeById(int id) {
        System.out.println(employeeRepositoryManager.getEmployeeById(id).toString());
    }
}
