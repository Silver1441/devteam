package com.kishkan.epam.devteam;

import com.kishkan.epam.devteam.config.DevelopersMockProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

	@Autowired
	private DevelopersMockProperties developersMockProperties;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		DevelopersMockProperties developersMockProperties = context.getBean(DevelopersMockProperties.class);

		System.out.println("LOG: app start");
		System.out.println(developersMockProperties.getDevelopers());
	}
}
