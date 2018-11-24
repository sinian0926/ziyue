package com.bp.mainserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MainserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainserverApplication.class, args);
	}
}
