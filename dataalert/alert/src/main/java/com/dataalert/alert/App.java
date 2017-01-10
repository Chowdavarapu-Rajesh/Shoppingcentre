package com.dataalert.alert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alert.dao.CategoryDao;
import com.alert.dao.ProductDao;
import com.alert.dao.SupplierDao;
import com.alert.dao.UsersDao;
import com.dataalert.configuration.ApplicationConfig;
import com.dataalert.model.Category;
import com.dataalert.model.Product;
import com.dataalert.model.Supplier;
import com.dataalert.model.Users;
public class App 
{
    public static void main( String[] args )
    {
    	
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);

/*//annotationConfigApplicationContext.refresh();
UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
Users user=new Users();
user.setUsername("test");
user.setPassword("test");
userDao.registerUser(user);
  */ 


ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
Product product=new Product();
product.setPname("test");
product.setPrice(900.0f);
Product product1=new Product();
product1.setPname("rajesh");
product1.setPrice(900.0f);
p.addProduct(product); 
p.addProduct(product1); 


/*
SupplierDao supplierdao =(SupplierDao)annotationConfigApplicationContext.getBean("SupplierDaoImpl");
Supplier supplier=new Supplier();
supplier.setSupplierAddress("hyd");
supplier.setSupplierName("Hindustan unilever limited");
supplierdao.addSupplier(supplier); 
  */  
  /*
CategoryDao cd=(CategoryDao)annotationConfigApplicationContext.getBean("CategoryDaoImpl");
Category c=new Category();
c.setCategoryName("Category");
cd.addCategory(c);
    */
}
 
}
    

