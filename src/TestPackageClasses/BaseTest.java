package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	static BaseTest obj2;
	public BaseTest(WebDriver driver){
		
	}
	public  WebDriver driver2;
	public static WebDriver driver;
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
		obj2.setDriver(driver);
		return driver;
	}
	public void setDriver(WebDriver driverl){
		//this.driver = driverl;
		System.out.println("Control is reached here  "+driverl);
		
	}
	
	public  WebDriver getDriver(){
	return driver;	
	}
	
}
