package com.bridgeit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Dept;
import com.bridgeit.model.Employee;

public class Retrieve {
	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();

			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();

			Employee employee1 = (Employee) session.get(Employee.class, new Integer(101));
			Transaction transaction = session.beginTransaction();

			System.out.println("Employee ID: " + employee1.getEmployeeId());
			System.out.println("Employee Name: " + employee1.getEmployeeName());

			Dept dept1 = employee1.getMyDept();
			System.out.println("Employee Department ID: " + dept1.getDeptId());
			System.out.println("Employee Department Name: " + dept1.getDeptName());
			session.close();
			transaction.commit();

			System.out.println("many to one select is completed");
			sessionFactory.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
