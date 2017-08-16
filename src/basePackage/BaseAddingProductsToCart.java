package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseAddingProductsToCart {
	WebDriver driver;
	public BaseAddingProductsToCart(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="yourCart")
	WebElement cartButton;
	
	public void navigateToCart(){
		cartButton.click();
		
	}
	
	
	

}
