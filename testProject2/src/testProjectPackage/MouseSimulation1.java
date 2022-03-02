package testProjectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// Creating Web Element reference
		WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		// Mouse Simulation using Actions Class
		Actions act = new Actions(driver);
		
		// Mouse Hover to Electronics Web Element
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		
		// Right Click on Web Element
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();
		
		// Release Control from Web Element
		Thread.sleep(3000);
		act.release(Electronics).build().perform();
		
		// Perform Key Events
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		// Press Enter Keys to Home & Furniture Web Element
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
		Thread.sleep(3000);
		act.sendKeys(Home, Keys.ENTER).build().perform();
		System.out.println("Home Menu Clicked");

	}

}
