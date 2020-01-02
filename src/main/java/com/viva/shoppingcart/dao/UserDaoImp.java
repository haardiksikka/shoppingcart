package com.viva.shoppingcart.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.viva.shoppingcart.entity.User;

@Repository
public class UserDaoImp {
	@PersistenceContext
	private EntityManager entityManager;
	public User getUserByEmail(User user) {
		String email = user.getEmail();
		String querystr="FROM User WHERE email=:email";
		Query query = entityManager.createQuery(querystr);
		query.setParameter("email",email);
		try {
			return (User) query.getSingleResult();
		}
		catch (NoResultException nre){
			return null;
		}
	}
}
