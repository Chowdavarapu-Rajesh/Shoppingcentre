package com.sunder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dataalert.dao.CategoryDao;
import com.dataalert.model.Category;
import com.dataalert.model.Product;
import com.dataalert.model.Supplier;

@Controller
public class CategoryController {
@Autowired
CategoryDao categorydao;

@RequestMapping("/categories")

public String categories(@ModelAttribute("category") Category category)
{
System.out.println(category.getCategoryName());
boolean bb=categorydao.addCategory(category);
  System.out.println("value of b:"+bb);
if(bb)
{
	return"login";
	}
else
{
	return"register";
	}



}
	

@RequestMapping("/Category")
public String product(Model model)
{System.out.println("category is");
Category category=new Category();
model.addAttribute("category",category);
return "Category";
	}
}


