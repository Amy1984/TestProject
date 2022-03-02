package testProjectPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitandAutoSuggestion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Introduce Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How stuff works");
		
		// How to handle Auto Suggestion
		List<WebElement> allSearch = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Auto Suggestion Displayed : " + allSearch.size());
		
		for(int i = 0; i < allSearch.size(); i++) {
			
			String allSearchText = allSearch.get(i).getText();
			String expectedSearchText = "How stuff works quiz";
			
			if (allSearchText.equalsIgnoreCase(expectedSearchText)) {
				allSearch.get(i).click();
				System.out.println("You have clicked on : " + expectedSearchText);
				break;
			}
		}

	}

}
