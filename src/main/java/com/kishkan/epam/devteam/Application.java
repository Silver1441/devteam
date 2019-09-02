package com.kishkan.epam.devteam;

import com.kishkan.epam.devteam.service.demo.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		//context.getBean(DemoAddEmployee.class).addEmployee();
		//context.getBean(DemoGetEmployeeById.class).getEmployeeById(1003);
		//context.getBean(DemoGetEmployeesByAppointment.class).getEmployeesByAppointment("designer");
		//context.getBean(DemoGetAllEmployees.class).getAllEmployees();
		//context.getBean(DemoGetTasks.class).getTaskById(3);
		//context.getBean(DemoGetTasks.class).getAllTasks();
		//context.getBean(DemoGetTasks.class).getTasksByEmployeeId(1001);
		//context.getBean(DemoGetTasks.class).getTasksByStartDate(LocalDate.parse("2019-09-02"));
		//context.getBean(DemoGetTasks.class).getTasksByEndDate(LocalDate.parse("2019-08-20"));
		//context.getBean(DemoAddTask.class).addTask();
		//context.getBean(DemoUpdateTaskStatus.class).updateStatus(3, "RETURNED");
	}
}
