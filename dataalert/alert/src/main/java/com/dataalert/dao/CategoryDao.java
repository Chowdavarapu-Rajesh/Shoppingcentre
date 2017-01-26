package com.dataalert.dao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.dataalert.model.Category;
import com.dataalert.model.Product;
@Repository
@ComponentScan("com")

public interface CategoryDao {
	
		public boolean addCategory(Category category); 
}
