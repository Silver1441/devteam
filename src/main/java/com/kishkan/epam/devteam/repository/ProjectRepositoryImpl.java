package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Project;
import com.kishkan.epam.devteam.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ProjectMapper projectMapper;

    private String sql;

    @Override
    public void addProject (Project project) {
        sql = "INSERT INTO project (`name`, `description`, `manager`, `project_status`, `date_start`) " +
                "VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, project.getName(), project.getProjectDescription(), project.getManager().getId(),
                project.getProjectStatus(), project.getStartDate());
    }
}
