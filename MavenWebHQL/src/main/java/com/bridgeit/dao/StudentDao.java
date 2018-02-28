package com.bridgeit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Student;

/**Purpose: This method is to add student in a dataBase
 * @author Sana Shaikh
 *
 */
public class StudentDao {
	
	public static void main(String agrs[]){
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Student student=new Student();
		student.setId(1);
		student.setName("Edward");
		student.setRoll("211");
		student.setDegree("BE");
		
		Student student1=new Student();
		student1.setId(2);
		student1.setName("albert");
		student1.setRoll("121");
		student1.setDegree("BSc");
		
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
		System.out.println("Object saved successfully.....!!");
		session.close();
		sessionFactory.close();
	}
}
