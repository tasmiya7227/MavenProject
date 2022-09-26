package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Packgecucu {
	
	private static WebDriver driver = null;
		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

		@When("user enters user name and password")
		public void user_enters_user_name_and_password() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			  
		
		}

		@Then("home page is displayed")
		public void home_page_is_displayed() {
		String actualResult;
		String expectedResult;
		expectedResult= "PIM";
		actualResult= driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]")).getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualResult, expectedResult);
		
		}
		@Then("user is loggedout")
		public void user_is_loggedout() {
			driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
			driver.findElement(By.xpath("//li[4]/a[@class=\"oxd-userdropdown-link\"]")).click();
		}
	
		
	}


