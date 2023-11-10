package com.surabhichainrestaurant.foodorder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private boolean isAdmin;
    
    
    
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", isAdmin=" + isAdmin + "]";
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", password=" + password + ", email=" + email + ", firstName=" + firstName
//				+ ", lastName=" + lastName + "]";
//	}
	public User(Long id, String password, String email, String firstName, String lastName,boolean isAdmin) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin =isAdmin;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    

    
	
    
    

}
