package main.SRP.entities.adminUser;

import java.util.List;


public interface AdminRepoInterface {

	public boolean addUser(AdminUser user);
	public void removeUser(int index);
	public boolean verifyUser(String username, String password);
	public AdminUser getSpecificuser(String username, String password);
	public List<AdminUser> getAllUser();
}
