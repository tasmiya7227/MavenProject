package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceebokXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Abc");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Pqrs");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("@123abc");
		
		
		WebElement date = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select sel = new Select(date);
		sel.selectByIndex(15);
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select sel1 = new Select(month);
		sel1.selectByIndex(3);
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select sel2 = new Select(year);
		sel2.selectByVisibleText("2001");
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
	}
	

}
