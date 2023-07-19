package com.sai.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.sai.springboot.controller", "com.sai.springboot.service"})
@EntityScan("com.sai.springboot.entity")
@EnableJpaRepositories("com.sai.springboot.repo")
@EnableEurekaClient
public class InstructorMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstructorMicroserviceApplication.class, args);
	}

}
