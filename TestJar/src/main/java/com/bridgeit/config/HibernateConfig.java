package com.bridgeit.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

	private static SessionFactory sessionFactory;

	public SessionFactory getSessionFactory()
	
	{
		Configuration config=new Configuration();
		SessionFactory sessionFactory=config.buildSessionFactory();
		return sessionFactory;
	}

}
