package com.viva.shoppingcart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.viva.shoppingcart.entity.Product;
import com.viva.shoppingcart.entity.User;

@Repository
public class ProductDaoImp {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Product> getProductByVendorId(double id){
		String querystr="FROM Product WHERE vendor_id=:id";
		Query query = entityManager.createQuery(querystr);
		query.setParameter("id",id);
		try {
			return (List<Product>) query.getResultList();
		}
		catch (NoResultException nre){
			return null;
		}
	}
	
	public Product getProductById(double id) {
		String querystr="From Product Where id=:id";
		System.out.println(id);
		Query query = entityManager.createQuery(querystr);
		query.setParameter("id", id);
		try {
			return (Product) query.getSingleResult();
		}
		catch(NoResultException nre) {
			return null;
		}
	}
}
