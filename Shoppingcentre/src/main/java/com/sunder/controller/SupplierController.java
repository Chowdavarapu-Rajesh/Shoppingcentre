package com.sunder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dataalert.dao.ProductDao;
import com.dataalert.dao.SupplierDao;
import com.dataalert.model.Product;
import com.dataalert.model.Supplier;

@Controller

public class SupplierController {

	@Autowired
SupplierDao supplierdao;
	@RequestMapping("/suppliers")

public String suppliers(@ModelAttribute("supplier") Supplier supplier)
{
System.out.println(supplier.getSupplierAddress());
boolean bb=supplierdao.addSupplier(supplier);
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
	

@RequestMapping("/Supplier")
public String product(Model model)
{System.out.println("Supplier  is");
Supplier supplier=new Supplier();
model.addAttribute("supplier",supplier);
return "Supplier";
	}





}