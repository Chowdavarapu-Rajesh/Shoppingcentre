package com.dataalert.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.dataalert.model.Register;

@Repository
@ComponentScan("com")


public interface RegisterDao {

	public void addRegister(Register register); 

}
