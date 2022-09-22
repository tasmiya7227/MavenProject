package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTableDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		System.out.println(driver.findElement(By.xpath("//table/tbody/t[3]/td[1]")).getText());
		
	}

}
