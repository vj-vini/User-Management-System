package com.hibernate.User_Management_System;

import java.util.Scanner;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println("1 save-user to save: ");
		System.out.println("2 find-user by their id: ");
		System.out.println("3 update-user by their id: ");
		System.out.println("4 delete-user by their id: ");
		UserService us=new UserService();
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		switch (value) {
		case 1:
			us.SaveUser();
			break;
		case 2:
			us.findUser1();
			break;
		case 3:
			us.updateUser1();
			break;
		case 4:
			us.deleteUser1();
			break;
		default:
			break;
		}
	}
}
