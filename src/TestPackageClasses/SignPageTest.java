package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basePackage.SignPage;

public class SignPageTest {
	BaseTest obj2;
	SignPage obj ;
	Boolean stu;
	WebDriver driver;
	@Test
	public void navigateToSignPage(){
	
	obj2= new BaseTest("chrome");
	driver = obj2.VerifyPageTitle("chrome");
	obj = new SignPage(driver);
	stu = obj.navigateToSignIn();
	if(stu =true){	
		System.out.println("hello all");
	}
		
	}

}
