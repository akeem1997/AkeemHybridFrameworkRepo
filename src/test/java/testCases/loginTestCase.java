package testCases;

import org.testng.annotations.Test;

import objectRepo.login;
import objectRepo.loginPage;
import objectRepo.openCartHomePage;
import utility.baseclass;

public class loginTestCase extends baseclass {
	@Test(priority = 0)
	public void browserOpen() {
		openBrowser("chrome");
		
	}
	
	@Test(priority = 2)
	public void url() {
		openUrl();
	}
	@Test(priority = 3)
	public void account() {
		openCartHomePage.clickMyAccount();
	}
	@Test(priority = 4)
	public void testPage() {
		login.clickLogin();
	}
	@Test(priority = 5)
	public void loginTestPageFill() {
		loginPage.fillLoginPage("akeembad@gmail.com", "wereyworlf");
		sleep();
		
	}
	@Test(priority = 6)
	public void closedown() {
		quit();
	}
	
	

}
