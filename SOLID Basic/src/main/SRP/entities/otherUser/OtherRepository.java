package main.SRP.entities.otherUser;

import java.util.ArrayList;
import java.util.List;

public class OtherRepository extends OtherUser implements OtherRepoInterface	{
	
	private List<OtherUser> userList = new ArrayList<>();
	
	@Override
	public boolean addUser(OtherUser user)	{	
		
		userList.add(user);	
		int size = userList.size();

		if(size != userList.size())	{
			System.out.println("New User Added...");
			return true;
		}	else	{
				System.out.println("Failed to Add New User...");
				return false;
			}
	}
	
	@Override
	public void removeUser(int index)	{	
		userList.remove(index);	
		System.out.println("User Removed Successfully...");
	}
	
	public boolean verifyUser(String username, String password)	{
		
		for(OtherUser obj : userList)	{
			if(obj.getUsername().equalsIgnoreCase(username) && obj.getPassword().equals(password))
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public OtherUser getSpecificuser(String username, String password)	{
		
		for(OtherUser obj : userList)	
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
}
