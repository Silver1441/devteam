package com.kishkan.epam.devteam.service;

import com.kishkan.epam.devteam.dto.StaffMember;
import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.support.enums.TaskStatus;

public interface TaskBuilder {
    Task buildTask(String taskDescription, StaffMember executor);
}
