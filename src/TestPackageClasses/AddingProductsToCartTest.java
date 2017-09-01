package TestPackageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseAddingProductsToCart;

public class AddingProductsToCartTest   {
	WebDriver driver;
	BaseAddingProductsToCart obj;
	BaseTest objOfBaseTest;
	@Test
	public void checkelements(){
		List<WebElement> ele = (List<WebElement>) driver.findElement(By.id("aChandeliers"));
		//List<WebElement> lis=ele;
		for (WebElement ele1 :ele){
			System.out.println(ele1.getText());
		}
	}
	
//	@Test
	public void AddingProducts(){
		driver = objOfBaseTest.getDriver();
		System.out.println("required driver is will c and is  "+driver);
		String str =driver.getTitle();
		System.out.println("title is "+str);
		obj= new BaseAddingProductsToCart(driver);
		obj.navigateToCart();
	}
	
	

}
