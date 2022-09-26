package seleniumexamples;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File pathToBinary = new File("C:\\Tasmiya\\geckodriver.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		//FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Tasmiya\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
