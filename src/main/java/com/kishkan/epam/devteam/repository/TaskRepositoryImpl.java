package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TaskMapper taskMapper;

    private String sql;

    @Override
    public Task getTaskById(int id) {
        sql = "SELECT * FROM task WHERE task_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, taskMapper);
    }
}
