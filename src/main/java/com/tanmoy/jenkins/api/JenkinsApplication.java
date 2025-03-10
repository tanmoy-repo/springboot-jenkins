package com.tanmoy.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JenkinsApplication {
	
	
	@PostConstruct
	public void init() {
		log.info("Application Started...");
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		log.info("Application executed...");
	}

}
