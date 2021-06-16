package com.mall.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
@EnableEurekaClient
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class,args);
	}
}
