package com.viva.shoppingcart.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.IProductCount;
import com.viva.shoppingcart.dao.IProductDao;
import com.viva.shoppingcart.dao.ProductDaoImp;
import com.viva.shoppingcart.entity.Product;
import com.viva.shoppingcart.entity.ProductCount;

@Service
public class ProductService {
	
	@Autowired
	private IProductDao iProductDao;
	
	@Autowired
	private ProductDaoImp productDaoImp;
	
	@Autowired
	private IProductCount productCount;
	
	public Product addProduct(Product product) {
		Timestamp timestamp= new Timestamp(System.currentTimeMillis());
		product.setId(timestamp.getTime());
		ProductCount pquantity = new ProductCount();
		pquantity.setId(timestamp.getTime());
		pquantity.setProductId(product.getId());
		pquantity.setQuantity(Product.quantity);
		productCount.save(pquantity);
		return iProductDao.save(product);
	}
	
	public List<Product> getProductByVendorId(double id){
		return productDaoImp.getProductByVendorId(id);
	}
	
	public List<Product> getAllProducts(){
		return iProductDao.findAll();
	}
	
	public Product getProductById(double id) {
		return productDaoImp.getProductById(id);
	}
}
