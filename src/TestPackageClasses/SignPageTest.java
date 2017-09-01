package TestPackageClasses;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import basePackage.SignPage;


public class SignPageTest {
	final static Logger logger = Logger.getLogger(SignPageTest.class);
	public WebDriver driver = BaseTest.setBrowser();
	SignPage obj ;
	Boolean stu;
	@Test
	public void navigateToSignPage(){
	
	PropertyConfigurator.configure("log4j.properties");	 
	logger.info("Driver obtained from the parent CLass");		
	
	obj = new SignPage(driver);
	logger.warn("Didnt get it");
	stu = obj.navigateToSignIn();
	
	}
	@Test(priority=2)
	public void getHandles(){
		stu = obj.handlingWindows();
		logger.info("Boolean is returned");
	}
	
	@AfterTest
	public void close(){
		
	}

}
