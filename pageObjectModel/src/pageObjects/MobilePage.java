package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePage {

	private static WebElement element = null;
	
	public static WebElement Title(WebDriver driver){
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}
	
	public static WebElement Sort(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		return element;
	}
	public static WebElement SonyExperia_Price1(WebDriver driver){
		element = driver.findElement(By.cssSelector("#product-price-1"));
		return element;
	}
	public static WebElement SonyExperia_MobileLink(WebDriver driver){
		element = driver.findElement(By.linkText("SONY XPERIA"));
		return element;
	}
	public static WebElement SonyExperia_Mobile_AddToCart(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/div/div[2]/button"));
		return element;
	}
	
}
