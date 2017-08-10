package TestPackageClasses;

import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import basePackage.BaseAddingProductsToCart;

public class AddingProductsToCart extends BaseTest {
	BaseAddingProductsToCart obj;
	
	@Test
	public void AddingProducts(){
		//Action act = new Action(driver); 
			
		obj= new BaseAddingProductsToCart(driver);
		obj.navigateToCart();
	}
	
	

}
