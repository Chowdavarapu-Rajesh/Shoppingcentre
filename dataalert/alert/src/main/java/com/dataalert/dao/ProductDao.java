package com.dataalert.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.dataalert.model.Product;

@Repository
@ComponentScan("com")
public interface ProductDao 
{
	public void addProduct(Product product); }