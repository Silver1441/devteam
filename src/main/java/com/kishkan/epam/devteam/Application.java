package com.kishkan.epam.devteam;

import com.kishkan.epam.devteam.config.StaffMockProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		StaffMockProperties staffMockProperties = context.getBean(StaffMockProperties.class);

		System.out.println("LOG: app start");
		System.out.println(staffMockProperties);
	}
}
