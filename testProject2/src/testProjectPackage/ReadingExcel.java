package testProjectPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {

		// Specify the location of Excel File
		File src = new File("C:\\Users\\HP\\Desktop\\testexcelsheet.xlsx");

		// Load File
		FileInputStream fis = new FileInputStream(src);

		// Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load Worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");

		// Print the name of loaded sheet
		System.out.println(sh.getSheetName());

		// Print Username from Excel Sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

		// Print p2 from Excel Sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());

		// Print Total Number of Rows - 1st Way
		System.out.println("Total Rows = " + sh.getPhysicalNumberOfRows());

		// Print Total Number of Rows - 2nd Way
		System.out.println(sh.getLastRowNum()); // Here Index will work and output will be 5
		System.out.println(sh.getFirstRowNum()); // Here Index will work and output will be 0
		int rows = (sh.getLastRowNum() - sh.getFirstRowNum()) + 1;
		System.out.println("Total Rows = " + rows); // 6

		// Print Total Number of Rows - 3rd Way
		System.out.println("Total Rows = " + (sh.getLastRowNum() + 1));

		// Print Total Number of Columns - 1st Way
		System.out.println("Total Columns = " + sh.getRow(0).getPhysicalNumberOfCells());

		// Print Total Number of Columns - 2nd Way
		System.out.println("Total Columns = " + sh.getRow(0).getLastCellNum());

		// Print Total Number of Columns - 3rd Way
		int columns = sh.getRow(0).getLastCellNum();
		System.out.println("Total Columns = " + columns);
		
		// Print all cells of excel sheet
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		// Setting the property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		// Enter Username using Excel Sheet
		String a = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(a);
				

	}

}
