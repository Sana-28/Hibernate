package com.bridgeit.OneToManyDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.dto.Cart;
import com.bridgeit.dto.Items;

public class OneToManyDAO {

	
	Configuration configuration = new Configuration().configure();

	SessionFactory sessionFactory = configuration.buildSessionFactory();

	public void oneToMany(Cart cart,Items item1,Items item2) {
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		// Save the Model objects
		session.save(cart);
		session.save(item1);
		session.save(item2);

		// Commit transaction
		transaction.commit();
		session.close();
	}

}
