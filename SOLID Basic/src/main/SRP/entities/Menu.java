package main.SRP.entities;

import java.util.Scanner;

import main.SRP.entities.user.User;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	private User user = new User();
	
	public Menu()	{	
		mainMenu();
	}
	
	public void mainMenu()	{

		System.out.println("MENU");
		System.out.println("1. Existing User");
		System.out.println("2. Add New User");
		System.out.println("3. Exit");
		System.out.print("Enter Option : ");
		int ch = sc.nextInt();

		switch(ch)	{
			case 1: userMainMenu();;
					break;
					
			case 2:	registrationMenu();
					break;
					
			case 3: System.exit(0);
			
			default:	System.out.println("Wrong choice...!!");
					 	mainMenu();
			}
	}
			
	
	public void userMainMenu()	{

		System.out.println("USER MENU");
		System.out.print("Enter username : ");
		String username = sc.nextLine();
		System.out.print("Enter password : ");
		String password = sc.nextLine();
	
		if(user.login(username, password))
			userMenu(username, password);
		else {
				System.out.println("User not Found...!!");
				userMainMenu();
			}
	}
	
	public void userMenu(String username, String password)	{
		System.out.println("Welcome User " + user.getSpecificUser(username, password));
	}
	
	public void registrationMenu()	{
		System.out.println("\t User Registration Page");
		
		System.out.print("Enter username : ");
		String username = sc.nextLine();
		username = sc.nextLine();
		System.out.print("Enter password : ");
		String password = sc.nextLine();
		System.out.print("Enter email ID  : ");
		String emailID = sc.nextLine();
		
		user.regsiter(username, password, emailID);
		
		userMainMenu();
	}
}
