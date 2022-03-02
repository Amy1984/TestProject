package testProjectPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		// Switching Frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames available on Web Page = " + allFrames.size());
		driver.switchTo().frame(0);
		
		// Will Find draggable Web Element
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		
		// Using Actions Class, Drag the Web Element
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(draggableElement, 30, 20).build().perform();
		
		// Drag the Web Element & Click and Hold using coordinates
		Thread.sleep(3000);
		act.clickAndHold(draggableElement).dragAndDropBy(draggableElement, 30, 30).build().perform();

	}

}
