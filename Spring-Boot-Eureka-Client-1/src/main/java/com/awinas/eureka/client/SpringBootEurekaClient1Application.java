package com.awinas.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringBootEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClient1Application.class, args);
	}

	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application 1";
	}
}
