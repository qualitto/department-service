package com.techhmr.departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TechhmrDepartmentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechhmrDepartmentserviceApplication.class, args);
	}

}
