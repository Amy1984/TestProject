package testProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*Thread.sleep(3000);
		driver.navigate().to ("https//www.google.com/");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("https//www.google.com/");*/
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("amitgoswami03@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"u_0_h_L4\"]")).click(); //wrong i think 
		Thread.sleep(3000);
		driver.close();
		System.out.println("Page Source");
		System.out.println("Launching the URL Successfully");
		
		
	}

}
