package com.bridgeit.MavenDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {

		// creating configuration object
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");// populates the data of the configuration file

		// creating session factory object
		SessionFactory factory = configuration.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction transaction = session.beginTransaction();
		
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ID..");
		int id=scanner.nextInt();*/

		Employee e1 = new Employee();
		e1.setId(31);
		e1.setFirstName("alfred");
		e1.setLastName("Thomas");

		session.persist(e1);// persisting the object

		transaction.commit();// transaction is comitted
		session.close();

		System.out.println("successfully saved");

	}

}
