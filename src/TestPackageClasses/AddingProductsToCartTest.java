package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basePackage.BaseAddingProductsToCart;

public class AddingProductsToCartTest extends BaseTest  {
	
	BaseAddingProductsToCart obj;
	BaseTest objOfBaseTest;
	
	@Test
	public void AddingProducts(){
		System.out.println("required driver is  "+driver);
		String str =driver.getTitle();
		System.out.println("title is "+str);
		obj= new BaseAddingProductsToCart(driver);
		obj.navigateToCart();
	}
	
	

}
