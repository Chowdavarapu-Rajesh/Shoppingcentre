package com.dataalert.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dataalert.model.Category;


@Repository("CategoryDaoImpl")
@Transactional

public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addCategory(Category category) {
		Session session=sessionFactory.getCurrentSession();

		category.setEnabled(true);
		Integer ii=(Integer)session.save(category);
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

