package testProjectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	WebDriver driver;
	
	@Test
	public void testCase1() throws InterruptedException {
		
		String expectedValidation = "Sorry, we don't recognize this email.";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('login-signin').click()");
		
		Thread.sleep(3000);
		String actualValidation = driver.findElement(By.id("username-error")).getText();
		
		Assert.assertEquals(actualValidation, expectedValidation);
		System.out.println("Equal Assertion Successfully Validated");
		
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("False Assertion Successfully Validated");
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("True Assertion Successfully Validated");
		
	}

}
