package com.nagarro.nagp.userservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.userservice.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	User user = new User("pallavi.sharma01@nagarro.com","Pallavi Sharma",25);
	
	@GetMapping(value = "/{id}")
	public Object getUser(@PathVariable String id) {
		return user;
	}
	
}
