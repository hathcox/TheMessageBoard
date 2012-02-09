package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity(name = "BOARD")
public class Board  implements DomainObject {
	private String name;
	private int identifier;

	Board() {
		// Required for Hibernate
	}
	
	public Board(String name) {
		this.name = name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public void setidentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	@Id
	@GeneratedValue
	public int getidentifier() {
		return identifier;
	}

}
