package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basePackage.BaseAddingProductsToCart;

public class AddingProductsToCartTest   {
	WebDriver driver;
	BaseAddingProductsToCart obj;
	BaseTest objOfBaseTest;
	
	@Test
	public void AddingProducts(){
		driver = objOfBaseTest.getDriver();
		System.out.println("required driver is will c and is  "+driver);
		String str =driver.getTitle();
		System.out.println("title is "+str);
		obj= new BaseAddingProductsToCart(driver);
		obj.navigateToCart();
	}
	
	

}
