package testProjectPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title=\"6 GB & Above\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title=\"SAMSUNG\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title=\"4★ & above\"]")).click();
		
		// Total Checkbox count
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total Check Boxes = " + checkBox.size());
		
		Thread.sleep(3000);
		driver.close();
	}

}
