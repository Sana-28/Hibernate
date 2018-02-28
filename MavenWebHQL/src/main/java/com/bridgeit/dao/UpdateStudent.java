package com.bridgeit.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Purpose: This program is to update DAtaBase
 * 
 * @author SANA SHAiKH
 *
 */
public class UpdateStudent {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("update Student set name= :name where id= :id");
		query.setParameter("name", "aaa");
		query.setParameter("id", 1L);

		// ((org.hibernate.query.Query) query).setLong("id", 1);

		int result = query.executeUpdate();
		System.out.println("Student data Update Status=" + result);
		
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
