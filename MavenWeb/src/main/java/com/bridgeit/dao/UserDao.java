package com.bridgeit.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.User;

public class UserDao {
	public static int register(User u) {
		int i = 0;
		Session session = new Configuration().configure().buildSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		transaction.begin();

		i = (Integer) session.save(u);

		transaction.commit();
		session.close();

		return i;
	}
}