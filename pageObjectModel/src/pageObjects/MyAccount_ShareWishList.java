package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount_ShareWishList {
	
	private static WebElement element;
	
	public static WebElement Email_IDs_ToShare(WebDriver driver){
		element = driver.findElement(By.id("email_address"));
		return element;
	}
	
	public static WebElement Message_ToShare(WebDriver driver){
		element = driver.findElement(By.id("message"));
		return element;
	}

	public static WebElement ShareWishListButton_ToShare(WebDriver driver){
		element = driver.findElement(By.cssSelector("button.button[title='Share Wishlist']"));
		return element;
	}
	
	
}
