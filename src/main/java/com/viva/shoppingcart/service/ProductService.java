package com.viva.shoppingcart.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.IProductDao;
import com.viva.shoppingcart.dao.ProductDaoImp;
import com.viva.shoppingcart.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private IProductDao iProductDao;
	
	@Autowired
	private ProductDaoImp productDaoImp;
	
	public Product addProduct(Product product) {
		Timestamp timestamp= new Timestamp(System.currentTimeMillis());
		product.setId(timestamp.getTime());
		return iProductDao.save(product);
	}
	
	public List<Product> getProductByVendorId(double id){
		return productDaoImp.getProductByVendorId(id);
	}
	
}
