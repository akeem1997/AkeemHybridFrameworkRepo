package objectRepo;

import org.openqa.selenium.By;

import utility.baseclass;

public class openCartHomePage extends baseclass {
	public static By MyAccount = By.xpath("//span[contains(text(), \"My Account\")]");
	
	
	public static void clickMyAccount() {
		click(MyAccount);
	}

}
