package com.hibernate.User_Management_System;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity 
public class User {
	//	/**
	//	 * @return the userId
	//	 */
	//	public int getUserId() {
	//		return userId;
	//	}
	//	/**
	//	 * @param userId the userId to set
	//	 */
	//	public void setUserId(int userId) {
	//		this.userId = userId;
	//	}
	//	/**
	//	 * @return the userName
	//	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userMail
	 */
	public String getUserMail() {
		return UserMail;
	}
	/**
	 * @param userMail the userMail to set
	 */
	public void setUserMail(String userMail) {
		UserMail = userMail;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String UserMail;
	private String password;
	//	public User get(Class<User> class1, int id) {
	//		// TODO Auto-generated method stub
	//		return null;
	//	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	public User get(Class<User> class1, int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", UserMail=" + UserMail + ", password=" + password
				+ "]";
	}
}
