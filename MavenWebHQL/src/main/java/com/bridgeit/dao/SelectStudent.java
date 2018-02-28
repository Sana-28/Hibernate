package com.bridgeit.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Student;

/**Purpose: This method is to select student from dataBase using HQL 
 * @author SANA SHAiKH
 *
 */
public class SelectStudent {
	public static void main(String args[]) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("from Student");
		List<Student> list = query.getResultList();
		for (Student st : list) {
			System.out.println("List of Employees::" + st.getId() 
								+ "," + st.getName() + "," + st.getDegree());
		}

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
