package com.cts.demo.service;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.model.User;

public interface UserService {

	public Iterable<User> getAllUsers();
		
		
	}


