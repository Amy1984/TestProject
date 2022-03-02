package testProjectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(3000);
		
		// Verify Alert Text
		System.out.println(driver.switchTo().alert().getText());
		String expectedResult = "Do you confirm action?";
		Assert.assertEquals(driver.switchTo().alert().getText(), expectedResult);
		System.out.println("Alert text verified");
		
		// Accept the Alert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Accept Worked");
		
		// Dismiss the Alert
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Dismiss Worked");
		driver.close();

	}

}
