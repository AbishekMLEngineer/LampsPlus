package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	public static  WebDriver driver;
	@BeforeTest
	public static  WebDriver setBrowser()// double checked login using synchronized keyword will increase the time by 100
	{
		if(driver==null){
			synchronized(BaseTest.class){
				System.setProperty("webdriver.chrome.driver","/home/user/Downloads/driver/chromedriver");
				 driver = new ChromeDriver();	
			}
		}
		driver.manage().window().maximize();
		return driver;
	}
}
