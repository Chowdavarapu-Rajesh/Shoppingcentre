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

import com.dataalert.model.Product;
import com.dataalert.model.Users;

@Configuration
@EnableTransactionManagement
@ComponentScan("com")
public class ApplicationConfig {

	
	@Autowired
	@Bean(name="datasource")
	public DataSource getDataSource()
	{System.out.println("i am inside data source");
	DriverManagerDataSource d= new DriverManagerDataSource();
	d.setUrl("jdbc:h2:tcp://localhost/~/datax");
	d.setUsername("sa");
	d.setPassword("sa");
	d.setDriverClassName("org.h2.Driver");
	return d;
		}
	private Properties getProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
		return properties;
	}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		 LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(dataSource);
		 localSessionFactoryBuilder.addProperties(getProperties());
		localSessionFactoryBuilder.addAnnotatedClasses(Users.class);

		localSessionFactoryBuilder.addAnnotatedClasses(Product.class);
		 return localSessionFactoryBuilder.buildSessionFactory();
	}	


	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
		return hibernateTransactionManager;
		
	}

	
}

