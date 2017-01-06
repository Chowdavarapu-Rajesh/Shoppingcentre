package com.backend.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.backend.model.DataAlert;
@Repository("DataAlertDaoImpl")
@Transactional
public class DataAlertDaoImpl implements DataAlertDao{

	@Autowired
	private SessionFactory sessionFactory;
public void registerUser(DataAlert Alert)
{Session session =sessionFactory.getCurrentSession();
session.save(Alert);
System.out.println("user saved");
}	
}
