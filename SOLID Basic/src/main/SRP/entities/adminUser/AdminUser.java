package main.SRP.entities.adminUser;

import main.SRP.entities.user.User;

public class AdminUser extends User{
	
	private String empType;
	private AdminRepoistory repo = new AdminRepoistory();
	
	public AdminUser()	{	}
	
	public AdminUser(String username, String password)		{	
		super(username,password);
	}

	public AdminUser(String username, String password, String emp, String email)	{
		super(username,password,email);
		this.empType = emp;
	}
	
	public void getEmailID(String type)	{	this.empType = type;	}
	public String getEmailID()			{	return empType;			}
	
	public void getAllUsers()	{
		for(User obj : repo.getAllUser())	{
			System.out.println("USERNAME : " + obj.getUsername());
			System.out.println("PASSWORD : " + obj.getPassword());
			System.out.println("Email ID : " + obj.getEmailID());
		}
	}

	@Override
	public String toString() {
		return "AdminUser [empType=" + empType + ", repo=" + repo + ", username=" + username + ", password=" + password
				+ ", emailID=" + emailID + "]";
	}
}
