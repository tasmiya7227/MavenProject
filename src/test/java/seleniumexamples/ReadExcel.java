package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\EI13048\\Documents";
		String fileName="Facebook.xlsx";
		String sheetName="Sheet1";
		
		
		File file = new File(filePath+"\\"+fileName);
		 FileInputStream inputStream = new FileInputStream(file);
		 Workbook workBook = null;
		 String fileExtensionName = fileName.substring(fileName.indexOf("."));
		 if(fileExtensionName.equals(".xls"))
		 {
			 workBook = new XSSFWorkbook(inputStream);

		 }
		 else if(fileExtensionName.equals(".xlsx")){

		    	workBook = new XSSFWorkbook(inputStream);

		    }

		    Sheet sheet = workBook.getSheet(sheetName);

		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		    System.out.println("Row count " +rowCount);
		    String userName,passWord;
		    Row row= sheet.getRow(1);
		    userName= row.getCell(0).getStringCellValue();
		    passWord=row.getCell(1).getStringCellValue();
		    System.out.println(userName);
		    
		    System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("tasmiyam72@gmail.com");
			driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("Admin123");
			driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
			
  
	}

}
