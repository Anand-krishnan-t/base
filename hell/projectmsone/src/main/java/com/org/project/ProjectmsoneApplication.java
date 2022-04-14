package com.org.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableSwagger2
public class ProjectmsoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectmsoneApplication.class, args);
	}
	
	


}
