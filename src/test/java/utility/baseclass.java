package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	public static WebDriver driver;
	
	public static void openBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\commerce\\drivers\\chromedriver.exe");
			driver = new ChromeDriver(co);
			System.out.println(browser + " is up and running");
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\akeem\\eclipse-workspace\\commerce\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(browser + " is up and running");
			
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\akeem\\eclipse-workspace\\commerce\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println(browser + " is up and running");
			
		}
		else {
			System.out.println("Invalid browser");
		}
		
	}
	
	public static void openUrl() {
		try {
			driver.get("https://demo.opencart.com/");
			System.out.println("url is running");
		} catch (Exception e) {
			System.out.println("unable to run url" + e.getMessage());
		}
	}
	
	public static void enterText(By locval, String data) {
		try {
			driver.findElement(locval).sendKeys(data);
			System.out.println("Entered " + data + " into the textbox");
		} catch (Exception e) {
			System.out.println("Unable to enter " + data + " into the textbox");
		}
		
	}
	
	public static void click(By locval) {
		try {
			driver.findElement(locval).click();
			System.out.println("clicked on element");
		} catch (Exception e) {
			System.out.println("unable to click on element");
		}
		
	}
	
	public static void select(By locName, String data) {
		try {
			new Select(driver.findElement(locName)).selectByVisibleText(data);
			System.out.println("clicked on" + data + " successfully");
		} catch (Exception e) {
			System.out.println("Unable to click on" + data + " successfully");
		}
		
	}
	
	public static void select2(By locName, String Data) {
		try {
			new Select(driver.findElement(locName)).selectByValue(Data);
			System.out.println("clicked on" + Data + " successfully");
		} catch (Exception e) {
			System.out.println("unable to click on " + Data + " successfully");
		}
	}
	
	public static void quit() {
		try {
			driver.quit();
			System.out.println("closing browser");
		} catch (Exception e) {
			System.out.println("Unable to close browser");
		}
	}
	public static void sleep() {
		try {
			Thread.sleep(5000);
			System.out.println("sleeping in process");
		} catch (Exception e) {
			System.out.println("Unable to sleep");
		}
	}

}
