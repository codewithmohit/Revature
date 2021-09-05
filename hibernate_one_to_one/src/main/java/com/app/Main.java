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

import com.app.model.Passport;
import com.app.model.Person;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Passport passport1 = new Passport("CBVPJ3280P", "India");
//		Passport passport2 = new Passport("BBVPJ3280P", "India");
//		Passport passport3 = new Passport("FBVPJ3280P", "India");
//		Passport passport4 = new Passport("EBVPJ3280P", "India");
//		Passport passport5 = new Passport("DBVPJ3280P", "India");
//		
//		Person person1 = new Person("Mohit Jindal", passport1);
//		Person person2 = new Person("Kalpit Jindal", passport2);
//		Person person3 = new Person("Simpi Jindal", passport3);
//		Person person4 = new Person("Dimpi Jindal", passport4);
//		Person person5 = new Person("Neha Jindal", passport5);
//		
//		session.save(person1);
//		session.save(person2);
//		session.save(person3);
//		session.save(person4);
//		session.save(person5);
//		session.save(passport1);
//		session.save(passport2);
//		session.save(passport3);
//		session.save(passport4);
//		session.save(passport5);
		
		Person person = (Person)session.get(Person.class, 2);
		
		System.out.println(person);
		
		Query query = session.createQuery("from com.app.model.Person");
		List<Person> personList = query.list();		
		for (Person person2 : personList) {
			if(person2.getName().startsWith("M"))
			System.out.println(person2.getName());
		}
		
		System.out.println("----------------------------------------------------------");
		Criteria criteriaPerson = session.createCriteria(Person.class);
		Criteria criteriaPassport = session.createCriteria(Passport.class);
		
//		criteriaPerson.add(Restrictions.eq("name", "Mohit Jindal"));
		criteriaPassport.add(Restrictions.eq("country", "India"));
		List<Person> personList1=criteriaPerson.list();
		System.out.println(personList1);
		
		
		
		transaction.commit();
		session.close();
		factory.close();
		

	}

}
