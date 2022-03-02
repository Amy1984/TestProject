package cucumberStepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberPage.LoginPage;


public class LoginStepdefinition {
	
	LoginPage lp = new LoginPage();
	
	@Given("^I am the user of facebook application$")
	public void i_am_the_user_of_facebook_application() throws Throwable {
		
		//lp.openUrl();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@When("^I enter my valid username$")
	public void i_enter_my_valid_username() throws Throwable {
	    lp.enterUserName();
	}

	@When("^I enter my valid password$")
	public void i_enter_my_valid_password() throws Throwable {
	    lp.enterPassword();
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    lp.clickLoginButton();
	}

	@Then("^I should be able to login successfully$")
	public void i_should_be_able_to_login_successfully() throws Throwable {
	    lp.verifyLogin();
	}

	@When("^I enter my invalid username$")
	public void i_enter_my_invalid_username() throws Throwable {
	    
	}

	@When("^I enter my invalid password$")
	public void i_enter_my_invalid_password() throws Throwable {
	    
	}

	@Then("^I should not be able to login successfully$")
	public void i_should_not_be_able_to_login_successfully() throws Throwable {
	    
	}

	@Then("^Error message should display$")
	public void error_message_should_display() throws Throwable {
	    
	}

}
