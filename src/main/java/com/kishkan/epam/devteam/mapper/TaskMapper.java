package com.kishkan.epam.devteam.mapper;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.service.manager.EmployeeRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

@Component
public class TaskMapper implements RowMapper<Task> {

    @Autowired
    EmployeeRepositoryManager employeeRepositoryManager;

    @Override
    public Task mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Task task = new Task();
        task.setId(resultSet.getInt("task_id"));
        task.setName(resultSet.getString("name"));
        task.setTaskDescription(resultSet.getString("description"));
        task.setExecutor(employeeRepositoryManager.getEmployeeById(resultSet.getInt("executor")));
        task.setTaskStatus(resultSet.getString("task_status"));
        task.setStartDate(LocalDate.parse(resultSet.getString("date_start")));
        task.setEndDate(LocalDate.parse(resultSet.getString("date_end")));

        return task;
    }
}
