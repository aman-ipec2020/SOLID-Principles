package main.SRP.entities.user;

import java.util.List;

public interface RepositoryInterface {

	public boolean addUser(User user);
	public void removeUser(int index);
	public boolean verifyUser(String username, String password);
	public User getSpecificuser(String username, String password);
	public List<User> getAllUser();
}
