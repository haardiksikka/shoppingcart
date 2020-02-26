package com.viva.shoppingcart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.viva.shoppingcart.entity.Cart;

@Repository
public class CartDaoImp {

		@PersistenceContext
		public EntityManager entityManager;
		
		public List<Cart> productsInCart(double id){
			String queryString = "From Cart where user_id=:id";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("id", id);
			try {
				return (List<Cart>) query.getResultList();
			}
			catch(Exception e) {
				return null;
			}
		}
		
		public Cart productInCart(double id) {
			String queryString = "From Cart where products_in_cart_id=:id";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("id", id);
			try {
				Cart cart = (Cart) query.getSingleResult();
				 return cart;
				}
			catch(Exception e) {
				return null;
			}
		}
}
