package main.SRP.entities.interfaces;

import main.SRP.entities.user.User;

public interface UserInterface {

	boolean login(String username, String password);
	void regsiter(String username, String password, String emailID);
	User getSpecificUser(String username, String password);
}
