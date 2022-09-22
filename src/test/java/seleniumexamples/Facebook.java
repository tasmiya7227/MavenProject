package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Abc");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("pqr");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("Admin123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Admin123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.name("birthday_day")).sendKeys("7");
		Thread.sleep(1000);
		driver.findElement(By.name("birthday_month")).sendKeys("February");
		Thread.sleep(1000);
		driver.findElement(By.name("birthday_year")).sendKeys("2001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
	}

}
