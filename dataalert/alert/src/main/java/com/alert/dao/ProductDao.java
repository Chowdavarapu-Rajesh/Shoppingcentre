package com.alert.dao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.dataalert.model.Product;

@ComponentScan("com")
@Repository
public interface ProductDao {
	
	public void addProduct(Product product);
}
