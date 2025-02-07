package com.hibernate.User_Management_System;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObjectProvider {
	private static EntityManagerFactory emf;
	private static UserRepository userRepository;
	private static UserService userService;
	
	public static synchronized EntityManagerFactory emfObject() {
		if(emf==null) {
			emf=Persistence.createEntityManagerFactory("vini-mysql");
		}
		return emf;
	}
	public static synchronized UserRepository urObject() {
		if(userRepository==null) {
			userRepository=new UserRepository();
		}
		return userRepository;
	}
	public static synchronized UserService usObject() {
		if(userService==null) {
			userService=new UserService();
		}
		return userService;
	}

}
