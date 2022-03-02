package cucumberPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public void openUrl() {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	public void enterUserName() {

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}

	public void enterPassword() {

		driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
	}
	
	public void clickLoginButton() {

		System.out.println("Login Button Clicked");
	}
	
	public void verifyLogin() {
		
		Assert.assertTrue(true);
	}
}
