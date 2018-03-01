package com.bridgeit.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Dept;
import com.bridgeit.model.Employee;

/**Purpose:THis program is to implement many to one Mapping
 * @author SANA SHAIKH
 *
 */
public class Insert {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Dept d1 = new Dept();
		d1.setDeptId(45678);
		d1.setDeptName("Stores");

		Employee e1 = new Employee();
		e1.setEmployeeId(203);
		e1.setEmployeeName("Jackup");
		e1.setMyDept(d1);

		Employee e2 = new Employee();
		e2.setEmployeeId(201);
		e2.setEmployeeName("Thomas");
		e2.setMyDept(d1);

		Employee e3 = new Employee();
		e3.setEmployeeId(204);
		e3.setEmployeeName("Rosy");
		e3.setMyDept(d1);

		Transaction transaction = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);

		transaction.commit();
		session.close();
		System.out.println("Many to one completed");
		sessionFactory.close();

	}
}
