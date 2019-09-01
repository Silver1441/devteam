package com.kishkan.epam.devteam;

import com.kishkan.epam.devteam.service.demo.DemoAddEmployee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		//context.getBean(DemoAddEmployee.class).addEmployee();
	}
}
