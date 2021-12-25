package com.example.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class DemoApplication {
	

	public static  Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public void init() {
		log.info("Spring Boot Application Started.......");

	}


	public static void main(String[] args) {

		log.info("Application Executed .......");
		SpringApplication.run(DemoApplication.class, args);


	}

}
