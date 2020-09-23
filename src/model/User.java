package model;

public class User {
	private int id;
	private String displayName;
	private String emailAddress;
	
	
	public User(int id, String displayName, String emailAddress) {
		super();
		this.id = id;
		this.displayName = displayName;
		this.emailAddress = emailAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
