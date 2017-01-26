package com.dataalert.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dataalert.model.Category;
import com.dataalert.model.Product;
import com.dataalert.model.Register;
import com.dataalert.model.Supplier;
import com.dataalert.model.UserRole;
import com.dataalert.model.Users;




@Configuration
@EnableTransactionManagement
@ComponentScan("com")

public class ApplicationConfig{
	@Autowired
	@Bean(name="datasource")
public DataSource getDataSource()
	{System.out.println("i am inside of datasource");
	DriverManagerDataSource d=new DriverManagerDataSource();
	d.setUrl("jdbc:h2:tcp://localhost/~/data");
	d.setUsername("sa");
	d.setPassword("sa");
	d.setDriverClassName("org.h2.Driver");
	return d;
	
} 


	private Properties getProperties()
	{
		Properties p=new Properties();
		p.setProperty("hibernate.show_sql","true");
		p.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		return p;
		
	}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource datasource)
	{
		 LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(datasource);
		 localSessionFactoryBuilder.addProperties(getProperties());
		localSessionFactoryBuilder.addAnnotatedClasses(Users.class);
    	localSessionFactoryBuilder.addAnnotatedClasses(UserRole.class);
		localSessionFactoryBuilder.addAnnotatedClasses(Product.class);
		localSessionFactoryBuilder.addAnnotatedClasses(Supplier.class);
		localSessionFactoryBuilder.addAnnotatedClasses(Category.class); 
		localSessionFactoryBuilder.addAnnotatedClasses(Register.class);
	
		return localSessionFactoryBuilder.buildSessionFactory();
	}	
	@Autowired
	@Bean(name="trasactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernatetransactionmanager=new HibernateTransactionManager(sessionFactory);
		return hibernatetransactionmanager;
	}
	
}

