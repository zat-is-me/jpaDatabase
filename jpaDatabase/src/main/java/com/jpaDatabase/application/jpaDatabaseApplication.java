package com.jpaDatabase.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jpaDatabase.application.manager.PersonJpaRepository;

@SpringBootApplication
//Will scan other recourses for the application
@ComponentScan
public class jpaDatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

  	@Autowired 
	PersonJpaRepository repository;	
  	
	public static void main(String[] args) {
		SpringApplication.run(jpaDatabaseApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("\n All users -> {}", repository.findById(10001));
	}
}
