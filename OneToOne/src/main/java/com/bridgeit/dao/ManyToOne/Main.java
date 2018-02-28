package com.bridgeit.dao.ManyToOne;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Address;
import com.bridgeit.model.Student;
import com.mysql.cj.api.Session;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = (Session) sessionFactory.openSession();

		try {
			Transaction transaction = null;
			transaction = ((SharedSessionContract) session).beginTransaction();

			Address address = new Address("OMR Road", "Chennai", "TN", "600097");

			Student student1 = new Student("Eswar", address);
			Student student2 = new Student("Joe", address);
			
			((org.hibernate.Session) session).save(student1);
			((org.hibernate.Session) session).save(student2);

		} catch (HibernateException e) {
			
			e.printStackTrace();
		} finally {
			session.forceClose();
		}
	}
}
