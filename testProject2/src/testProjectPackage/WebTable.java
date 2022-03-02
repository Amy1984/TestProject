package testProjectPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		// Create list of all companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Number of Companies : " + allCompanies.size());
		
		// Create list of all current prize
		List<WebElement> allCurrentPrize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Number of Current Prize : " + allCurrentPrize.size());
		
		String ExpectedCompanyName = "MTNL";
		
		for (int i = 0; i < allCompanies.size(); i++) {
			if(allCompanies.get(i).getText().equalsIgnoreCase(ExpectedCompanyName)) {
				System.out.println(allCompanies.get(i).getText() + " == " + allCurrentPrize.get(i).getText());
				allCompanies.get(i).click();
				break;
			}
		}

	}

}
