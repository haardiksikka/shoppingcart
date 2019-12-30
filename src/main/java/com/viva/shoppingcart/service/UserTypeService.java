package com.viva.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.IUserTypeDao;
import com.viva.shoppingcart.entity.UserType;

@Service
public class UserTypeService {
	@Autowired
	private IUserTypeDao iUserTypeDao;
	
	public List<UserType> getAllUserType(){
		return iUserTypeDao.findAll();
	}
}
