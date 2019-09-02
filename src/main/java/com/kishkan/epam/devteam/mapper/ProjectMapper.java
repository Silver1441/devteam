package com.kishkan.epam.devteam.mapper;

import com.kishkan.epam.devteam.dto.Project;
import com.kishkan.epam.devteam.service.manager.EmployeeRepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

@Component
public class ProjectMapper implements RowMapper<Project> {

    @Autowired
    private EmployeeRepositoryManager employeeRepositoryManager;

    @Override
    public Project mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Project project = new Project();
        project.setId(resultSet.getInt("target_id"));
        project.setName(resultSet.getString("name"));
        project.setProjectDescription(resultSet.getString("description"));
        project.setManager(employeeRepositoryManager.getEmployeeById(resultSet.getInt("manager")));
        project.setProjectStatus(resultSet.getString("project_status"));
        project.setStartDate(LocalDate.parse(resultSet.getString("date_start")));
        if(resultSet.getString("date_end") != null){
            project.setEndDate(LocalDate.parse(resultSet.getString("date_end")));
        }

        return project;
    }
}
