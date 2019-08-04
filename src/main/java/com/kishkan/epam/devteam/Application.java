package com.kishkan.epam.devteam;

import com.kishkan.epam.devteam.repository.StaffRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		System.out.println("Workers list: " + context.getBean(StaffRepository.class).getList());
		System.out.println(context.getBean(StaffRepository.class).getById(102));
	}
}
