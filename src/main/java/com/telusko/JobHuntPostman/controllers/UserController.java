package com.telusko.JobHuntPostman.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.JobHuntPostman.model.User;
import com.telusko.JobHuntPostman.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("register")
	public User registerUser(@RequestBody User user)
	{
		userService.saveUser(user);
		return user;
	}

}
