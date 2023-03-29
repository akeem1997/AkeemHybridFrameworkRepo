package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.openCartHomePage;
import objectRepo.register;
import objectRepo.registerAccount;
import utility.baseclass;

public class stepDefinitions extends baseclass {

@Given("User is on signup page")
public void user_is_on_signup_page() {
	openBrowser("edge");
	openUrl();
	openCartHomePage.clickMyAccount();
	register.clickRegister();
    
}

@When("user fills up signup page")
public void user_fills_up_signup_page() {
	registerAccount.registerAccountFill("akeem", "olalere", "akeemolalere@yahoo.com", "keemazolalere", "Yes");
    
}

@Then("signUp is a success and closes bowser")
public void user_is_navigated_to_the_homepage() {
	quit();
    
}

}
