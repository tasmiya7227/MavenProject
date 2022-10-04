package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tasmiya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();
		
		//To create new account
		driver.findElement(By.id("email_create")).sendKeys("tasmiyam@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		//first name last name
		driver.findElement(By.cssSelector("label.top")).click();
		driver.findElement(By.xpath("//input[@class=\"is_required validate form-control\"]")).sendKeys("Rahul");
		driver.findElement(By.id("customer_lastname")).sendKeys("Singh");
		
		
		//password
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("acc@1234");
					
		//date of birth
		WebElement day = driver.findElement(By.cssSelector("select#days"));
		Select sel1 = new Select(day);
		sel1.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("months"));
		Select sel2 = new Select(month);
		sel2.selectByVisibleText("January ");
		
		driver.findElement(By.id("uniform-years")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"2001\")]")).click();
		
		//check box
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		//company
		driver.findElement(By.name("company")).sendKeys("Pineapple");
		
		//address
		driver.findElement(By.xpath("//input[@name = 'address1']")).sendKeys("Kengeri, Bangalore");
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		
		WebElement state = driver.findElement(By.xpath("//select[@id = 'id_state']"));
		Select stateName = new Select(state);
		stateName.selectByVisibleText("Texas");
		
		
		//zip code
		driver.findElement(By.xpath("//input[@class=\"form-control uniform-input text\"]")).sendKeys("12345");
		
		
		//mobile number
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys(" Kengeri, Bangalore");
		//driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
	}

}
