package objectRepo;

import org.openqa.selenium.By;

import utility.baseclass;

public class register extends baseclass {
	public static By Register = By.xpath("//a[contains(text(), \"Register\")]");
	
	public static void clickRegister() {
		click(Register);
	}

}
