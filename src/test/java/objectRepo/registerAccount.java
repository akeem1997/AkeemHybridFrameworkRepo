package objectRepo;

import org.openqa.selenium.By;

import utility.baseclass;

public class registerAccount extends baseclass {
	public static By Firstname = By.name("firstname");
	public static By Lastname = By.name("lastname");
	public static By Email = By.name("email");
	public static By Password = By.name("password");
	public static By Yes = By.id("//label[contains(text(), \"Subscribe\")]//following::input[1]");
	public static By No = By.id("//input[@value=\"0\"]");
	public static By privacyPolicy = By.name("agree");
	public static By Continue = By.xpath("//button[@class=\"btn btn-primary\"]");
	
	
	public static void registerAccountFill(String fname, String lname, String mail, String pass, String subscribe) {
		enterText(Firstname, fname);
		enterText(Lastname, lname);
		enterText(Email, mail);
		enterText(Password, pass);
		
		if(subscribe.equalsIgnoreCase("Yes")) {
			click(Yes);
			
		}
		else if (subscribe.equalsIgnoreCase("No")) {
			click(No);
			
		}
		else {
			System.out.println("Invalid input");
		}
		click(privacyPolicy);
		sleep();
		click(Continue);
		
		
	}
	
	
	

}
