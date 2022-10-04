package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginHrm {
	private static WebDriver driver = null;
	
  @Test
  public void login() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
  }
  
  @Test
  public void logout() {
	  driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		driver.findElement(By.xpath("//li[4]/a[@class=\"oxd-userdropdown-link\"]")).click();
  }
}
