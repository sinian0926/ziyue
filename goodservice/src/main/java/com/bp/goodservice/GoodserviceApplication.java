package com.bp.goodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GoodserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodserviceApplication.class, args);
	}
}
