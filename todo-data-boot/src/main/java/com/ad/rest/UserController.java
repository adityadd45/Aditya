package com.ad.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ad.entity.User;
import com.ad.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(value="/save", consumes="application/json")
	public String saveUser( @RequestBody User u) {
		service.save(u);
		return "User saved successfully!";
	}
	
	@GetMapping(value="/fetch/{id}",produces="application/json")
	public User getUser(@PathVariable("id") int id) {
		return service.fetch(id);
	}
	
	@GetMapping(value="/list",produces="application/json")
	public List<User> getAllUser(){
		return service.list();
	}
	
	@GetMapping(value="/delete/{id}",produces="application/json")
	public String removeUser(@PathVariable("id") int id){
		service.remove(id);
		return "User Deleted Successfully";
	}
	
	
}
