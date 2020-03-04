package com.cts.demo.rest;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.model.User;
import com.cts.demo.service.UserService;

@RestController
	public class UserController {

		private UserService userService;

		public UserController(UserService userService) {
			super();
			this.userService = userService;
		}

		@RequestMapping("/users")
		@ResponseBody
		@LoadBalanced
		public Iterable<User> getAllUsers() {
			return userService.getAllUsers();
		}
}
