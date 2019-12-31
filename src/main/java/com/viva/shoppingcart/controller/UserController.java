package com.viva.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viva.shoppingcart.entity.User;
import com.viva.shoppingcart.entity.UserType;
import com.viva.shoppingcart.service.UserService;
import com.viva.shoppingcart.service.UserTypeService;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private UserTypeService userTypeService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/test")
	public String testMethod() {
		return "Hello";
	}
	
	@RequestMapping("getusertype")
	public List<UserType> getUserType(){
		System.out.println("hello .....");
		return userTypeService.getAllUserType();
	}
	
	@RequestMapping("/adduser")
	public User addUser(@RequestBody User user) {
		System.out.println(user);
		
		return userService.addUser(user);
	}
}
