package com.bridgeit.annotation;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.annotations.*;
import org.hibernate.cfg.*;

public class Test {

public static void main(String[] args) {
	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();

		Employees e1 = new Employees();
		e1.setId(1003);
		e1.setName("paul");
		e1.setAddress("vashi");

		Employees e2 = new Employees();
		e2.setId(1004);
		e2.setName("jack");
		e2.setAddress("Pune");

		session.persist(e1);
		session.persist(e2);

		transaction.commit();
		session.close();
		System.out.println("successfully saved");
	}
}