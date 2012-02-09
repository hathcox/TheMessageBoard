package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity(name = "USER")
public class User implements DomainObject{
	private Long userID;
	private String name;
	private String password;

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	User() {
		// Required for Hibernate
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Id
	@GeneratedValue
	public Long getUserID() {
		return userID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
