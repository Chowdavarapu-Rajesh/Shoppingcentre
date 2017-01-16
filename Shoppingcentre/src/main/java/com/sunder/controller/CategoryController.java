package com.sunder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dataalert.dao.CategoryDao;
import com.dataalert.model.Category;
import com.dataalert.model.Supplier;

@Controller
public class CategoryController {
@Autowired
CategoryDao categorydao;
@RequestMapping("/category")
public String Product(){
	System.out.println("i am a tester");
Category c= new Category();
c.setCategoryName("Chowdavarapu Rajesh");
categorydao.addCategory(c);
return "login";
}
}
