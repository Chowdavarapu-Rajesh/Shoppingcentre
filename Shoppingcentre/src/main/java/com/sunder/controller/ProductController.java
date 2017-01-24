package com.sunder.controller;
import com.dataalert.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dataalert.dao.ProductDao;
import com.dataalert.dao.UsersDao;
import com.dataalert.model.Users;
@Controller
public class ProductController {
	@Autowired
ProductDao productdao;
@RequestMapping("/items")

public String items(@ModelAttribute("product") Product product)
{
System.out.println(product.getPrice());
boolean bb=productdao.addProduct(product);
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
	

@RequestMapping("/Product")
public String product(Model model)
{System.out.println("product is");
Product product=new Product();
model.addAttribute("product",product);
return "Product";
	}






/*public String Product(){
	System.out.println("i am a tester");
Product p= new Product();
p.setPname("rajesh");
p.setPrice(900.0f);
productdao.addProduct(p);
return "login";
}
*/


}
