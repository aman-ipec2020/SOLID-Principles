package main.DIP.entities;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	private List<User> userList = new ArrayList<>();
	
	public boolean addUser(User user)	{	
		
			userList.add(user);	
		int size = userList.size();

		if(size != userList.size())	{
			System.out.println("New User Added...");
			return true;
		}
		else	{
			System.out.println("Failed to Add New User...");
			return false;
		}
	}
	
	public void removeUser(int index)	{	
		userList.remove(index);	
		System.out.println("User Removed Successfully...");
	}
	
	public boolean verifyUser(String username, String password)	{
		
		for(User obj : userList)	{
			if(obj.getUsername().equalsIgnoreCase(username) && obj.getPassword().equals(password))
				return true;
			else
				return false;
		}
		return false;
	}
	
	public User getSpecificuser(String username, String password)	{
		
		for(User obj : userList)	
		{
			if(obj.getUsername().equalsIgnoreCase(username) && obj.getPassword().equals(password))
				return obj;
			else	{
				System.out.println("user not retrive...");
				return null;
			}
		}
		return null;
	}
	
	public List<User> getAllUser()	{
		return this.userList;
	}
}
