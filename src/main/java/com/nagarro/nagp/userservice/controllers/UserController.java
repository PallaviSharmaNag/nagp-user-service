package com.nagarro.nagp.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.userservice.model.User;
import com.nagarro.nagp.userservice.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	//User user = new User("pallavi.sharma01@nagarro.com","Pallavi Sharma",25);
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping(value = "/{id}")
	public Object getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping("/all")
	public List<User> getAllNotes() {
	    return userRepository.findAll();
	}
	
}
