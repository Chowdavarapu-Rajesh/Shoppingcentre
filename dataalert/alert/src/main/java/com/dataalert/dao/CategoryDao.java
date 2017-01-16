package com.dataalert.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.dataalert.model.Category;

@Repository
@ComponentScan("com")
public interface CategoryDao {
public void addCategory(Category category);
}
