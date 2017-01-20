package com.dataalert.alert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dataalert.dao.CategoryDao;
import com.dataalert.dao.ProductDao;
import com.dataalert.dao.RegisterDao;
import com.dataalert.dao.SupplierDao;
import com.dataalert.dao.UsersDao;
import com.dataalert.configuration.ApplicationConfig;
import com.dataalert.model.Category;
import com.dataalert.model.Product;
import com.dataalert.model.Register;
import com.dataalert.model.Supplier;
import com.dataalert.model.Users;
public class App 
{
    public static void main( String[] args )
    {
    	
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);

//annotationConfigApplicationContext.refresh();
UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
Users user=new Users();
user.setUsername("test");
user.setPassword("test");
userDao.registerUser(user);


ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
Product product=new Product();
product.setPname("test");
product.setPrice(900.0f);
p.addProduct(product); 

SupplierDao supplierdao =(SupplierDao)annotationConfigApplicationContext.getBean("SupplierDaoImpl");
Supplier supplier=new Supplier();
supplier.setSupplierAddress("hyd");
supplier.setSupplierName("Hindustan unilever limited");
supplierdao.addSupplier(supplier); 
  
CategoryDao cd=(CategoryDao)annotationConfigApplicationContext.getBean("CategoryDaoImpl");
Category c=new Category();
c.setCategoryName("rajesh");
cd.addCategory(c);



RegisterDao rd=(RegisterDao)annotationConfigApplicationContext.getBean("RegisterDaoImpl");
Register r=new Register();
r.setFirstName("chowdavarapu");
r.setLastName("rajesh");
r.setCreatePassword("amma@143");
r.setConfirmPassword("amma@143");
r.setEmailId("rajesh.ch1993@gmail.com");
rd.addRegister(r);

    
    
    }
 
}
    

