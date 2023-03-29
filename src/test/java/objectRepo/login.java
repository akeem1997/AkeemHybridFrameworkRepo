package objectRepo;

import org.openqa.selenium.By;

import utility.baseclass;

public class login extends baseclass {
	public static By login = By.xpath("//a[contains(text(), \"Login\")]");
	
	public static void clickLogin() {
		click(login);
		
	}

}
