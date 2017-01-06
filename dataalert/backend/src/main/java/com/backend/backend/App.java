package com.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;
import com.backend.dao.DataAlertDao;
import com.backend.dao.DataAlertDaoImpl;
import com.backend.dao.ProductDao;
import com.backend.model.DataAlert;
import com.backend.model.Product;
public class App 
{
    public static void main( String[] args )
    {
        
    	AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
    
    	DataAlertDao DataAlertDao=(DataAlertDao)annotationConfigApplicationContext.getBean("DataAlertDaoImpl");
    DataAlert alert=new DataAlert();
    	alert.setUsername("test");
    	alert.setPassword("test");
    	DataAlertDao.registerUser(alert);

/*    	
    	ProductDao product=(ProductDao)annotationConfigApplicationContext.getBean("ProductDaoImpl");
        Product p=new Product();
        
        	p.setProductName("test");

        	p.setPrice(910.0f);
        	product.addProduct(p);

*/
    }
}
	