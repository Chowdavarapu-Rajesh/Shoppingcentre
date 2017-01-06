package com.dataalert.alert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alert.dao.ProductDao;
import com.alert.dao.UsersDao;
import com.dataalert.configuration.ApplicationConfig;
import com.dataalert.model.Product;
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
p.addProduct(product);
}
 
}
    

