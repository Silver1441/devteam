package com.kishkan.epam.devteam.service;

import com.kishkan.epam.devteam.dto.StaffMember;
import com.kishkan.epam.devteam.dto.Task;
import org.springframework.stereotype.Service;

import static com.kishkan.epam.devteam.support.enums.TaskStatus.ISSUED;

@Service
public class TaskBuilderImpl implements TaskBuilder {
    private int TemporalTaskIdCounter = 0; //This is temporal ID counter, it will be removed later

    public Task buildTask(String taskDescription, StaffMember executor) {
        TemporalTaskIdCounter +=1;
        return new Task(TemporalTaskIdCounter, taskDescription, executor, ISSUED);
    }
}
