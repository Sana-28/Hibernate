package com.bridgeit.HibernateDemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bridgeit.HibernateDemo.config.HibernateConfig;
import com.bridgeit.HibernateDemo.dto.User;

public class UserDAO {

	HibernateConfig hibernateConfig = new HibernateConfig();
	SessionFactory factory = hibernateConfig.getSessionFactory();
	Session session =null;
	
	public void saveUser (User user){
		 session = factory.getCurrentSession();
		 session.save(user);
		 
		
	}
}
