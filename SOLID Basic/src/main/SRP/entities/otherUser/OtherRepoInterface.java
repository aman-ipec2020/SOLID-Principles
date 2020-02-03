package main.SRP.entities.otherUser;

public interface OtherRepoInterface {

	public boolean addUser(OtherUser user);
	public void removeUser(int index);
	public boolean verifyUser(String username, String password);
	public OtherUser getSpecificuser(String username, String password);
}
