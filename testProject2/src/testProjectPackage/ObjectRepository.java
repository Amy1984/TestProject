package testProjectPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {

		ObjectRepository objectRepo = new ObjectRepository();

		// Specify the properties file location
		File src = new File("E:\\Software\\javaWorkspace\\testProject\\Repository\\Object_Repo.properties");

		// Create FileInputStream Class Object to load the file
		FileInputStream fis = new FileInputStream(src);

		// Create Properties Class Object to read Properties File
		Properties pro = new Properties();
		pro.load(fis);

		// Setting the property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		objectRepo.openURL(driver, pro.getProperty("URL1"));
		Thread.sleep(3000);
		//objectRepo.openURL(driver, pro.getProperty("URL")); 
		driver.get(pro.getProperty("URL")); // one more method to do the same
		Thread.sleep(3000);
		
		// getProperty() method accept key and it returns value for the same key
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		Thread.sleep(3000);
		driver.quit();

	}

	// Open URL
	public void openURL(WebDriver driver, String url) {
		driver.get(url);
	}

}
