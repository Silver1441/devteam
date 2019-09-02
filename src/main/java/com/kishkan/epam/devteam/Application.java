package com.kishkan.epam.devteam;

import com.kishkan.epam.devteam.service.demo.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		//context.getBean(DemoAddEmployee.class).addEmployee();
		//context.getBean(DemoGetEmployeeById.class).getEmployeeById(1003);
		//context.getBean(DemoGetEmployeesByAppointment.class).getEmployeesByAppointment("designer");
		//context.getBean(DemoGetAllEmployees.class).getAllEmployees();
		context.getBean(DemoGetTasks.class).getTaskById(1);
	}
}
