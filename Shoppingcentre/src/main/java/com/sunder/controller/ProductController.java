package com.sunder.controller;
import com.dataalert.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dataalert.dao.ProductDao;
import com.dataalert.dao.UsersDao;
import com.dataalert.model.Users;
@Controller
public class ProductController {
	@Autowired
ProductDao productdao;
@RequestMapping("/product")
public String Product(){
	System.out.println("i am a tester");
Product p= new Product();
p.setPname("rajesh");
p.setPrice(900.0f);
productdao.addProduct(p);
return "login";
}



}
