package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basePackage.SignPage;

public class SignPageTest extends BaseTest{
	
	SignPage obj ;
	Boolean stu;
	@Test
	public void navigateToSignPage(){
	obj = new SignPage(driver);
	stu = obj.navigateToSignIn();
	}
	@Test(priority=2)
	public void getHandles(){
		stu = obj.handlingWindows();
	}

}
