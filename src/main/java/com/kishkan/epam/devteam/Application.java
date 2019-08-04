package com.kishkan.epam.devteam;

import com.kishkan.epam.devteam.dto.Task;
import com.kishkan.epam.devteam.repository.StaffRepository;
import com.kishkan.epam.devteam.service.TaskBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Task testTask1 = context
				.getBean(TaskBuilder.class)
				.buildTask("Make test1", context.getBean(StaffRepository.class).getById(101));
		Task testTask2 = context
				.getBean(TaskBuilder.class)
				.buildTask("Make test2", context.getBean(StaffRepository.class).getById(102));

		System.out.println("\nWorkers list:           " + context.getBean(StaffRepository.class).getList());
		System.out.println("Get worker by ID(102):  " + context.getBean(StaffRepository.class).getById(102));
		System.out.println(testTask1);
		System.out.println(testTask2);
	}
}
