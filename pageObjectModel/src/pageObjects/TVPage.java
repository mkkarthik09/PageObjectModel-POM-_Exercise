package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TVPage {
	
	private static WebElement element = null;
	
	public static WebElement LG_LCDTV_AddWishList(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement LG_LCDTV_ShareWishList(WebDriver driver){
		element = driver.findElement(By.cssSelector("button.button[title='Share Wishlist']"));
		return element;
	}

}
