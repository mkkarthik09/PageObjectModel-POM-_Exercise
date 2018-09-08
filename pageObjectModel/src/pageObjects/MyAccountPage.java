package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	
	private static WebElement element = null;
	
	public static WebElement MobileLink(WebDriver driver){
		element=driver.findElement(By.linkText("MOBILE"));
		return element;
		}
	
	public static WebElement TVLink(WebDriver driver){
		element=driver.findElement(By.linkText("TV"));
		return element;
		}

	public static WebElement MyWishList(WebDriver driver){
		element=driver.findElement(By.linkText("MY WISHLIST"));
		return element;
		}
	
	public static WebElement MyWishList_ShareWishList(WebDriver driver){
		element=driver.findElement(By.cssSelector("button.button[title='Share Wishlist']"));
		return element;
		}
	
	public static WebElement MyOrders(WebDriver driver){
		element=driver.findElement(By.linkText("MY ORDERS"));
		return element;
		}
}
