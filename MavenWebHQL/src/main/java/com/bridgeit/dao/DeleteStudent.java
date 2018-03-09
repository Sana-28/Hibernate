package com.bridgeit.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Purpose: This program is to delete a Student Data from dataBase using HQL
 * 
 * @author SANA SHAiKH
 *
 */
public class DeleteStudent {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("delete from Student where id= 1");

		query.setParameter("id", 1L);

		int result = query.executeUpdate();
		System.out.println("Student Data Delete Status=" + result);

		System.out.println("Deleted");

		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
