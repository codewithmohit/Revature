package com.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.app.model.Player;





public class HibernateMain {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		create object
		
//		Player player1 = new Player("Mohit Jindal", "Male", 22);
//		session.save(player1);
//		
//		Player player2 = new Player("Kalpit Jindal", "Male", 22);
//		session.save(player2);
//		
//		Player player3 = new Player("Simpi Jindal", "Female", 12);
//		session.save(player3);
//		Player player4 = new Player("Dimpi Jindal", "Female", 13);
//		session.save(player4);
//		
		
//		update data in table
//		Player player = (Player) session.get(Player.class, 100);
//		player.setAge(21);
//		session.update(player);
		
//		delete data in table
//		Player player = new Player();
//		player.setId(100);
//		session.delete(player);
//		
		Query query = session.createQuery("from com.app.model.Player");
		List<Player> playerList = query.list();
		for (Player player : playerList) {
			System.out.println(player);
		}
		
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.between("age", 20, 26));
		List<Player> playerList1 = criteria.list();
		for (Player player : playerList1) {
			System.out.println(player);
		}
		
		transaction.commit();
		session.close();
		factory.close();
		

	}

}
