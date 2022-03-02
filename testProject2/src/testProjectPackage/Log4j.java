package testProjectPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		
		// We need to create logger instance so we need to pass class name for which we want to create log file
		org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("Log4j");
		
		// Configure log4j.properties file
		PropertyConfigurator.configure("E:\\Software\\javaWorkspace\\testProject\\log4j.properties");
		
		// Open chrome browser instance
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		logger.info("Chrome Browser Instance Opened");
		
		// Maximize the window
		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		// Set Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit Wait Given");
		
		// Open Url
		driver.get("https://www.facebook.com");
		logger.info("Application Launched");

	}

}
