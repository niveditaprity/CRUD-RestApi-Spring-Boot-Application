package com.nivedita.app.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.nivedita.app.crud.models.User;
import com.nivedita.app.crud.repo.*;

@RestController
public class ApiController {

	@Autowired 
	private  UserRepo UserRepo;
	
	@GetMapping(value = "/")
	public String getWelcome()
	{
		return "Welcome";
	}
	
	@GetMapping(value = "/getUsers")
	public List<User>getUser()
	{
		return UserRepo.findAll();
	}
	
	@PostMapping(value = "/saveUser" )
	public String saveUser(@RequestBody User user)
	{
		UserRepo.save(user);
		return "user saved";
	}
	
	@PutMapping(value = "/updateUser/{id}")
	public String updateUser(@PathVariable long id, @RequestBody User user)
	{
		User updateUser = UserRepo.findById(id).get();
		updateUser.setFirstName(user.getFirstName());
		updateUser.setLastName(user.getLastName());
		updateUser.setAge(user.getAge());
		updateUser.setPhoneNumber(user.getPhoneNumber());
		UserRepo.save(updateUser);
		return "Upadted User";
	}
	
	@DeleteMapping(value = "/deleteUser/{id}")
	public String deleteUser(@PathVariable long id)
	{
		User user = UserRepo.findById(id).get();
		UserRepo.delete(user);
		return "Deleted User";
	}
	
	
	

}
