package testProjectPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);

		// Print how many windows are opened
		Set<String> PopupId = driver.getWindowHandles();
		System.out.println("Popup Id = " + PopupId);
		System.out.println("Popup are opened = " + PopupId.size());

		Iterator<String> abc = PopupId.iterator();
		String Window1 = abc.next();
		String Window2 = abc.next();
		String Window3 = abc.next();
		String Window4 = abc.next();

		// Print the title of Popup Window 2
		driver.switchTo().window(Window2);
		System.out.println(Window2); // alphanumeric id for Popup Window 2
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// Print the title of Popup Window 3
		driver.switchTo().window(Window3);
		System.out.println(Window3); // alphanumeric id for Popup Window 3
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// Print the title of Popup Window 4
		driver.switchTo().window(Window4);
		System.out.println(Window4); // alphanumeric id for Popup Window 4
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// Print the title of Popup Window 1
		driver.switchTo().window(Window1);
		System.out.println(Window1); // alphanumeric id for Popup Window 1
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
