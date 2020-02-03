package main.SRP.entities.otherUser;

import main.SRP.entities.user.User;

public class OtherUser extends User{

	private String empType;
	
	public OtherUser()	{	}
	
	public OtherUser(String username, String password)		{	
		super(username,password);
	}

	public OtherUser(String username, String password, String emp, String email)	{
		super(username,password,email);
		this.empType = emp;
	}
	
	public void getEmailID(String type)	{	this.empType = type;	}
	public String getEmailID()			{	return empType;			}

	@Override
	public String toString() {
		return "OtherUser [empType=" + empType + ", username=" + username + ", password=" + password + ", emailID="
				+ emailID + ", repo=" + repo + "]";
	}
}
