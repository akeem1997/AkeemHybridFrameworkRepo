package objectRepo;

import org.openqa.selenium.By;

import utility.baseclass;

public class loginPage extends baseclass {
	public static By EmailAddress = By.name("email");
	public static By password = By.name("password");
	public static By forgottenPassword = By.name("password");
	public static By login = By.xpath("//button[@type=\"submit\"]");
	
	public static void fillLoginPage(String mailadd, String passw) {
		enterText(EmailAddress, mailadd);
		enterText(password, passw);
		click(login);
		
	}
	public static void clickForgottenPassword() {
		click(forgottenPassword);
	}

}
