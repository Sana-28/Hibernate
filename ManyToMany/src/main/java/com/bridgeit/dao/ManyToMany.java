package com.bridgeit.dao;

import java.util.HashSet;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.bridgeit.config.Config;
import com.bridgeit.model.Cart;
import com.bridgeit.model.Item;

/**Purpose: THis program is to implement many-to-many association
 * @author SANA SHAIKH
 * @since 6Mar18
 */
public class ManyToMany {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = null;

		sessionFactory = Config.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Item iphone = new Item();
		iphone.setPrice(100);
		iphone.setDescription("iPhone");

		Item ipod = new Item();
		ipod.setPrice(50);
		ipod.setDescription("iPod");

		Set<Item> items = new HashSet<Item>();
		items.add(iphone);
		items.add(ipod);

		Cart cart = new Cart();
		cart.setItems(items);
		cart.setTotal(150);

		Cart cart1 = new Cart();
		Set<Item> items1 = new HashSet<Item>();
		items1.add(iphone);
		cart1.setItems(items1);
		cart1.setTotal(100);

		
		session.save(iphone);
		session.save(ipod);
		transaction.commit();
		sessionFactory.close();
		
		System.out.println("Before committing transaction");
		System.out.println("Cart ID=" + cart.getId());
		System.out.println("Cart1 ID=" + cart1.getId());
		System.out.println("Item1 ID=" + iphone.getId());
		System.out.println("Item2 ID=" + ipod.getId());

	}
}
