package testProjectPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		// 1st way - Not recommended but mostly industry use the same
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Dropdown Values = " + birthMonth.size());
		birthMonth.get(7).click();
		System.out.println(birthMonth.get(1).isEnabled());  // True
		
		
		
		// 2nd way - Recommended
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		// Will use Select class constructor
		Select month = new Select(bm); // Parameterized Constructor
		// Select by visible text
		month.selectByVisibleText("Apr"); // April
		// Select by value
		month.selectByValue("11"); // November
		// Select by index
		month.selectByIndex(9); // October
		// Get current selected value from dropdown
		System.out.println(month.getFirstSelectedOption().getText());
		
		
		
		// 3rd way - Will store all dropdown values in a list
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown values are :" + dropdown.size());
		for (int i = 0 ; i < dropdown.size(); i++)
		{
			String dropdownValues = dropdown.get(i).getText();
			if (dropdownValues.equalsIgnoreCase("Aug"));
			{
				dropdown.get(i).click();
				break;
			}
		}
		
		
		
		// 4th way - Checking if dropdown support multiple selection or not
		System.out.println(month.isMultiple()); // false
		month.selectByVisibleText("Apr"); // April
		month.selectByValue("11"); // Nov
		month.deselectByIndex(9); // Oct
		
		
		// Deselect the selected dropdown value
		
		month.deselectByVisibleText("Apr"); // Apr 
		month.deselectByValue("11"); // Nov
		month.deselectByIndex(9); // Oct
		month.deselectAll();
		 	
		
		
		
		// 5th way
		bm.sendKeys("Feb");
		
		
		
		// 6th way
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
	}

}