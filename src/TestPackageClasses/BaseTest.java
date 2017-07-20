package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	public BaseTest(String string) {
	}
	
	public WebDriver VerifyPageTitle(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver.exe");
			 driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","C://IEDriverServer_x64_3.3.0//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
}