package basePackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import TestPackageClasses.SignPageTest;

public class SignPage {
	WebDriver driver;
	private  final Logger log = Logger.getLogger(SignPage.class);
	public SignPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="hdrSignIn")
	WebElement SignInButton; 
	
	@FindBy(css="input[type ='submit']")
	WebElement SignIn; 
	
	WebDriverWait wait;
	
	
	public boolean navigateToSignIn(){
		
		wait = new WebDriverWait(driver,2);
		driver.get("http://www.lampsplus.com/");
		wait.until(ExpectedConditions.visibilityOf(SignInButton));
		SignInButton.click();
		driver.switchTo().frame("signInToolTip");
		driver.findElement(By.id("UserName")).sendKeys("abi111@mailinator.com");
		driver.findElement(By.id("Password")).sendKeys("abi111");
		
		if(SignIn.isEnabled()){
			SignIn.click();
			return true;
		}
		else{
			return false;
		}
	}
	public boolean handlingWindows(){
		
		Set<String> allWindowsHandles = driver.getWindowHandles();
		for(String ele :allWindowsHandles){
			System.out.println("here are the handle names "+ele);
		//	driver.switchTo().window(ele);
		}
		int x = allWindowsHandles.size();
		System.out.println("Size is "+x);
/*		Cookie cook = new Cookie("cookie Name ", "cookie Value");
		Set<Cookie>  cookiesCurrent = driver.manage().getCookies();
		for(Cookie cuk : cookiesCurrent){
			System.out.println(cuk.getName()+" "+cuk.getName());
		}
*/		return true;
	}

}
