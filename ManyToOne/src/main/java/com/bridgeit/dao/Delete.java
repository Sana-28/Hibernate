package com.bridgeit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Dept;
import com.bridgeit.model.Employee;

/**
 * Purpose: This method is to retrive the records from many-to-one mapping
 * 
 * @author SANA SHAIKH
 *
 */
public class Delete {
	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();

			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();

			/*Employee e1 = (Employee) session.get(Employee.class, new Integer(100));

			// System.out.println("Employee ID: " + employee1.getEmployeeId());
			System.out.println("Employee Name: " + e1.getEmployeeName());

			Dept dept1 = e1.getMyDept();
			System.out.println("Employee Department ID: " + dept1.getDeptId());
			System.out.println("Employee Department Name: " + dept1.getDeptName());
			session.close();
			System.out.println("many to one select is completed");
			sessionFactory.close();*/

			
			Employee e1 = (Employee) session.get(Employee.class, new Integer(100));
			Transaction transaction = session.beginTransaction();
			session.delete(e1);
			transaction.commit();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}