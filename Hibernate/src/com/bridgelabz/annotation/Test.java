package com.bridgelabz.annotation;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		Employees e1 = new Employees();
		e1.setId(1001);
		e1.setName("abc");
		e1.setAddress("vashi");

		Employees e2 = new Employees();
		e2.setId(1002);
		e2.setName("xyz");
		e2.setAddress("Pune");

		session.persist(e1);
		session.persist(e2);

		transaction.commit();
		session.close();
		System.out.println("successfully saved");
	}
}