package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignPage {
	WebDriver driver;
	
	public SignPage(WebDriver driver){
		this.driver= driver;
	}
	
	public boolean navigateToSignIn(){
		driver.get("http://www.lampsplus.com/");
		driver.findElement(By.id("UserName")).click();
		
		return true;
	}

}
