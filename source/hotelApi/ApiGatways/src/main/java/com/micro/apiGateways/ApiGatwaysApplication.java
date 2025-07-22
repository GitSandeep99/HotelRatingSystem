package com.micro.apiGateways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatwaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatwaysApplication.class, args);
	}

}
