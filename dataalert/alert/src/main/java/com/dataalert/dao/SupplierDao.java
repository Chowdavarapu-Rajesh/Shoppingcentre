package com.dataalert.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.dataalert.model.Supplier;

@Repository
@ComponentScan("com")
public interface SupplierDao 
{
	public boolean addSupplier(Supplier supplier);}