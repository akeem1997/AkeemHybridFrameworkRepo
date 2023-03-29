package testCases;

import org.testng.annotations.Test;

import objectRepo.openCartHomePage;
import objectRepo.registerAccount;
import utility.baseclass;

public class homePage extends baseclass {
	
	@Test(priority = 0)
	public void browserOpen() {
		openBrowser("firefox");
		
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
	public void register() {
		objectRepo.register.clickRegister();
	}
	
	@Test(priority = 5)
	public void fillform() {
		registerAccount.registerAccountFill("akeem", "lekan", "akeemlekan@gmail.com", "keemlekan", "Yes");
	}
	@Test(priority = 6)
	public void teardown() {
		quit();
	}

}
