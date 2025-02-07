package com.hibernate.User_Management_System;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.query.NativeQuery;



public class UserRepository {


	EntityManagerFactory fact=Persistence.createEntityManagerFactory("vini-mysql");
	public  void saveUser(User user) {
		EntityManager manager=fact.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		manager.close();
	}
	public User findUser2(int id) {
		EntityManager manager1=fact.createEntityManager();
		User user=manager1.find(User.class, id);
		System.out.println(user);
	
	manager1.close();
	return user;
	}
	public void updateUser2(User user1) {
		EntityManager manager1=fact.createEntityManager();
		EntityTransaction transaction=manager1.getTransaction();
		transaction.begin();
		manager1.merge(user1);

		transaction.commit();
		manager1.close();

	}
	public void deleteUser2(User user) {
		EntityManager manager1=fact.createEntityManager();
		EntityTransaction transaction=manager1.getTransaction();
		transaction.begin();
		manager1.remove(user);
		transaction.commit();
		manager1.close();
	}
}
