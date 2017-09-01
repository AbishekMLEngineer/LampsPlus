package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	BaseTest obj2;
	public BaseTest(WebDriver driver){
		
	}
	public  WebDriver driver2;
	public  WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void   VerifyPageTitle(String browser)
	{
		obj2 = new BaseTest(driver2);
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver_win32//chromedriver.exe");
			 driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","C://IEDriverServer_x64_3.3.0//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		obj2.setDriver(driver);
	}
	public void setDriver(WebDriver driverl){
		//this.driver = driverl;
		System.out.println("Control is reached here  "+driverl);
		
	}
	
	public  WebDriver getDriver(){
	return driver;	
	}
	
}
