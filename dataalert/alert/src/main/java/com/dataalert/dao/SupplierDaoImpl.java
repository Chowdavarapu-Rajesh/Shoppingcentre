package com.dataalert.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dataalert.model.Supplier;

@Repository("SupplierDaoImpl")
@Transactional
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addSupplier(Supplier supplier) {
		Session session=sessionFactory.getCurrentSession();

		supplier.setEnabled(true);
		Integer ii=(Integer)session.save(supplier);
		if(ii!=0)
		{
			return true;
			
		}
		else
		{
			return false;
			
		}

		
		
		
		
		
		//logger.info("-----------------------ended--------------------------");
		
	}

}

