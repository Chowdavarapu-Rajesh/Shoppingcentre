package com.sunder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dataalert.dao.ProductDao;
import com.dataalert.dao.SupplierDao;
import com.dataalert.model.Product;
import com.dataalert.model.Supplier;

@Controller

public class SupplierController {

	@Autowired
SupplierDao supplierdao;
@RequestMapping("/supplier")
public String Product(){
	System.out.println("i am a tester");
Supplier s= new Supplier();
s.setSupplierAddress("mahabubabad");
s.setSupplierName("rajesh");
supplierdao.addSupplier(s);
return "login";
}



}
