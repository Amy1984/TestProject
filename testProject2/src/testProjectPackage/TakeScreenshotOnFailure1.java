package testProjectPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	public void captureScreenshot(ITestResult result) throws Exception {
		
		if (ITestResult.FAILURE == result.getStatus()) {
			
			// Create Reference of TakesScreenshot Interface and Type Casting
			TakesScreenshot ts = (TakesScreenshot) driver; // Type Casting of 2 Interfaces
			
			// Use getScreenshotAs() Method to Capture Screenshot in File Format
			// getScreenshotAs() Method Return Type is File
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			// Copy File to Specific Location
			FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
			System.out.println(result.getName() + " method() screenshot captured.");
			
			
		}
		
	}
	
}
