package com.kishkan.epam.devteam.service.manager;

import com.kishkan.epam.devteam.dto.Employee;
import com.kishkan.epam.devteam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRepositoryManagerImpl implements EmployeeRepositoryManager {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void addEmployee (Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public Employee getEmployeeById (int id) {
        return employeeRepository.getEmployeeById(id);
    }

    @Override
    public List<Employee> getEmployeesByAppointment(String appointment){
        return employeeRepository.getEmployeesByAppointment(appointment);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
