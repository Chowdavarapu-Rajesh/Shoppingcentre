package com.dataalert.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dataalert.model.UserRole;
import com.dataalert.model.Users;

@Repository("userDaoImpl")
@Transactional
public class UsersDaoImpl implements UsersDao {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean registerUser(Users user) {
		boolean check=false;

		Session session=sessionFactory.getCurrentSession();
		user.setEnabled(true);
		Integer i=(Integer)session.save(user);
		if(i!=0)
		{
			return true;
			
		}
		else
		{
			return false;
			
		}

	/*	UserRole userrole=new UserRole();
		userrole.setAuthority("ROLE_USER");

		
		userrole.setUserId(user.getUserId());
		session.save(userrole);
		System.out.println("user saved");
		if(i==1)
			check=true;
		else
			check=false;	
		return check;
*/
		
	}

}
