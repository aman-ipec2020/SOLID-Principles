package main.SRP.entities.adminUser;

import java.util.ArrayList;
import java.util.List;


public class AdminRepoistory implements AdminRepoInterface	{
	
	private List<AdminUser> userList = new ArrayList<>();
	
	public boolean addUser(AdminUser user)	{	
		
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
	
	for(AdminUser obj : userList)	{
		if(obj.getUsername().equalsIgnoreCase(username) && obj.getPassword().equals(password))
			return true;
		else
			return false;
		}
		return false;
	}

	public AdminUser getSpecificuser(String username, String password)	{
	
	for(AdminUser obj : userList)	
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

	public List<AdminUser> getAllUser()	{
		return this.userList;
	}
}
