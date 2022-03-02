package com.facebook.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MasterPage {

	public static WebDriver driver;

	// Creating Properties Class Reference
	public Properties prop;
	public Properties or;

	// Constructor
	public MasterPage() throws Exception {

		// Configure Properties File
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\configuration.properties");

		prop = new Properties();
		prop.load(ip);

		// Locators Properties File
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\locators.properties");

		or = new Properties();
		or.load(fs);
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\testProject\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Software\\javaWorkspace\\testProject\\com.facebook.drivers\\gecko.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Open IE Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	// Dynamic Approch
	
	public void click(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).click();
	}
	
	public void enterData(String xpathKey, String data) {
		//driver.findElement(By.xpath(or.getProperty(xpathKey))).sendKeys(data); // 1st way
		driver.findElement(By.xpath(or.getProperty(xpathKey))).sendKeys(or.getProperty(data)); // 2nd way
	}
	
	public void clearData(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).clear();
	}
	
	public void moveToElement(String xpathKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathKey)))).build().perform();
	}
	
	// Not Totally Dynamic
	public void clickListElement(String xpathKey) {
		List<WebElement> radios = driver.findElements(By.xpath(xpathKey));
		for (int i = 0; i < radios.size(); i ++) {
			if (radios.get(i).getText().equalsIgnoreCase(System.getProperty(or.getProperty("RadioButton1")))) {
				radios.get(i).click();
			}
		}
	}
	
	// Totally Dynamic
	public void clickListElement(String xpathKey, String data) {
		List<WebElement> radios = driver.findElements(By.xpath(xpathKey));
		for (int i = 0; i < radios.size(); i ++) {
			if (radios.get(i).getText().equalsIgnoreCase(System.getProperty(or.getProperty(data)))) {
				radios.get(i).click();
			}
		}
	}
	
	public void verifyEqualAssertion(String a, String b) {
		Assert.assertEquals(driver.findElement(By.xpath(or.getProperty(a))).getText(), or.getProperty(b));
	}

}
