package com.viva.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viva.shoppingcart.entity.UserType;
import com.viva.shoppingcart.service.UserTypeService;

@RestController
public class UserController {
	
	@Autowired
	private UserTypeService userTypeService;
	
	@RequestMapping("/test")
	public String testMethod() {
		return "Hello";
	}
	
	@RequestMapping("getusertype")
	public List<UserType> getUserType(){
		return userTypeService.getAllUserType();
	}
}
