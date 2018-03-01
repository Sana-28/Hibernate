package com.bridgeit.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Address;
import com.bridgeit.model.Employee;

/**
 * Purpose: THis program is to implement one to one Mapping
 * 
 * @author SANA SHAIKH
 *
 */
public class Store {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
	
		Employee employee1 = new Employee(2, "Rosely");
		Address address1 = new Address("lonavala", "Pune", employee1);
		
		session.save(employee1);
		session.save(address1);
		//session.flush();
		transaction.commit();
		System.out.println("update successflly");
		System.out.println("Record of " + employee1.getEmployeeId() + " is inserted");
		session.close();
	}
}
