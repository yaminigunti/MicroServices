package com.cts.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.cts.demo.dao.UserDAO;
import com.cts.demo.model.User;

@SpringBootApplication
@EnableEurekaClient
public class Stage1UserServiceApplication {

	
		@Autowired
		private UserDAO userDAO;

		public static void main(String[] args) {
			SpringApplication.run(Stage1UserServiceApplication.class, args);
		}

		public void run(String... args) throws Exception {

			userDAO.save(new User("Doe", "John", "john@luv2code.com"));
			userDAO.save(new User("Smith", "Dave", "dave@luv2code.com"));

		}
	

}
