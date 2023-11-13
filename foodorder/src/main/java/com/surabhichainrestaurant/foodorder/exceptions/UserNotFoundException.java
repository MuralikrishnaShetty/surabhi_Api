package com.surabhichainrestaurant.foodorder.exceptions;

public class UserNotFoundException extends Exception {
	public UserNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		super("User not found");
	}
}
