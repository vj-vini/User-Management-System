package com.hibernate.User_Management_System;

import java.util.Scanner;

public class UserService {
	UserRepository ud=ObjectProvider.urObject();
	public void SaveUser() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the user name:");
		String name=in.nextLine();
		System.out.println("Enter the user email:");
		String email=in.nextLine();
		System.out.println("Enter the user password:");
		String pwd=in.nextLine();
		User user=new User();
		user.setUserName(name);
		user.setUserMail(email);
		user.setPassword(pwd);
	
		ud.saveUser(user);
	}

	public void findUser1() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the user id:");
		int id=in.nextInt();
		
		ud.findUser2(id);
		
	}

	public void updateUser1() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the user id:");
		int id=in.nextInt();
		User user=ud.findUser2(id);
		
		System.out.println("Enter the user name:");
		String name=in.next();
	
		user.setUserName(name);
		ud.updateUser2(user);
	}

	public void deleteUser1() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the user id:");
		int id=in.nextInt();
		User  user=ud.findUser2(id);
		ud.deleteUser2(user);
		
	}
	
}
