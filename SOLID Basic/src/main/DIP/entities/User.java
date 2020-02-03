package main.DIP.entities;

public class User	{

	protected String username;
	protected String password;
	protected String emailID;
	
	protected Repository repo = new Repository();
	
	public User()	{	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.emailID = email;
	}


	public void setUsername(String username) {	this.username = username;	}
	public void setPassword(String password) {	this.password = password;	}
	public void setEmailID(String email)	 {	this.emailID = email;		}
	
	public String getPassword() {	return password;	}
	public String getUsername() {	return username;	}
	public String getEmailID()	{	return emailID;		}
	
	
	public boolean login(String username, String password) 	{
	
		if(repo.verifyUser(username, password))	{
			System.out.println("User Logged In Successfully...!!");
			return true;
		}	
		else	{
					System.out.println("User not Found...!!");
					return false;
		}
	}

	public void regsiter(String username, String password, String emailID) {
		repo.addUser(new User(username, password, emailID));
	}	
	
	public User getSpecificUser(String username, String password)	{
		return repo.getSpecificuser(username, password);
	}

	public String toString() {
		return "[username=" + username + ", password=" + password + ", emailID=" + emailID + "]";
	}
}
