package testngexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HrmLeave {
	private static WebDriver driver = null;
	@Test(priority=1)
	public void leave() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"CAN\")]")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]/input")).sendKeys("2022-09-21");
		driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"][2]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		driver.close();
	}
	@Test(priority=2)
	public void forgotPassword() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button")).click(); //presses "cancel"
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String expectedResult = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actalResult = driver.getCurrentUrl();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actalResult,expectedResult);
		System.out.println(actalResult);
		System.out.println(expectedResult);
		driver.close();
	}
}