package com.dataalert.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dataalert.model.Register;

@Repository("RegisterDaoImpl")
@Transactional

public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	private SessionFactory sessionFactory;


	public void addRegister(Register register) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(register);
		
		
	}

}
