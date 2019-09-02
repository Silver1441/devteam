package com.kishkan.epam.devteam.repository;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TaskMapper taskMapper;

    private String sql;

    @Override
    public void addTask (Task task) {
        sql = "INSERT INTO task (`name`, `description`, `executor`, `task_status`, `date_start`) " +
                "VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, task.getName(), task.getTaskDescription(), task.getExecutor().getId(),
                task.getTaskStatus(), task.getStartDate());
    }

    @Override
    public void updateStatus (int id, String status) {
        sql = "UPDATE task SET task_status = ? WHERE task_id = ?";
        jdbcTemplate.update(sql, status, id);
    }

    @Override
    public Task getTaskById(int id) {
        sql = "SELECT * FROM task WHERE task_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, taskMapper);
    }

    @Override
    public List<Task> getAllTasks() {
        sql = "SELECT * FROM task";
        return jdbcTemplate.query(sql, taskMapper);
    }

    @Override
    public List<Task> getTasksByEmployeeId(int id) {
        sql = "SELECT * FROM task WHERE executor = ?";
        return jdbcTemplate.query(sql, taskMapper, id);
    }
}
