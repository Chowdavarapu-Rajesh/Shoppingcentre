package com.dataalert.dao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.dataalert.model.Users;

@ComponentScan("com")
@Repository
public interface UsersDao {
	
public void registerUser(com.dataalert.model.Users user);
}
