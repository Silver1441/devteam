package com.kishkan.epam.devteam.service.demo;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.repository.StaffRepository;
import com.kishkan.epam.devteam.service.TaskBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    TaskBuilder taskBuilder;

    @Autowired
    StaffRepository staffRepository;

    public void makeTest() {
        Task testTask1 = taskBuilder.buildTask("Make test1", staffRepository.getById(101));
        Task testTask2 = taskBuilder.buildTask("Make test2", staffRepository.getById(102));

        System.out.println("\nWorkers list:           " + staffRepository.getList());
        System.out.println("Get worker by ID(102):  " + staffRepository.getById(102));
        System.out.println(testTask1);
        System.out.println(testTask2);
    }
}
