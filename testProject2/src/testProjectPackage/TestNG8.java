package testProjectPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}

	// Get Current Date and Time
	public String getDateAndTime() {
		DateTimeFormatter currentDateAndTime = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return currentDateAndTime.format(now);
	}
	
	@DataProvider
	public Object [][] dataSet() throws Exception {
		
		// Specify the properties file location
		File src = new File("E:\\Software\\javaWorkspace\\testProject\\Repository\\Object_Repo.properties");
		
		// Create FileInputStream Class Object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		// Create properties Class Object to read properties file
		Properties pro = new Properties();
		pro.load(fis);
		
		Object arr[][] = new Object [3][2];
		
		TestNG8 t8 = new TestNG8();
		
		arr[0][0] = pro.getProperty("EmailTestData") + " " + t8.getDateAndTime();
		arr[0][1] = pro.getProperty("PasswordTestData");
		
		arr[1][0] = "Email_2";
		arr[1][1] = "Password_2";
		
		arr[2][0] = "Email_3";
		arr[2][2] = "Password_3";
		
		return arr;
		
	}
	
	@Test(dataProvider = "dataSet")
	public void enterCred(String UserName, String Password) throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
	}

}
