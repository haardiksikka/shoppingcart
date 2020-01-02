package com.viva.shoppingcart.service;



import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.IUserDao;
import com.viva.shoppingcart.dao.UserDaoImp;
import com.viva.shoppingcart.entity.User;

@Service
public class UserService {
	@Autowired
	private IUserDao iUserDao;
	
	@Autowired UserDaoImp userDao;
	
	public User addUser(User user) {
		Timestamp timestamp= new Timestamp(System.currentTimeMillis());
		user.setId(timestamp.getTime());
		return iUserDao.save(user);
	}
	public Boolean login(User user) {
		User usr=userDao.getUserByEmail(user);
		if(usr==null) {
			return false;
		}
		else {
			if(usr.getPassword().equals(user.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
