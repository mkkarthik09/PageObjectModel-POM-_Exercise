package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackEnd_HomePage {
	
	static WebElement element;
	
	public static WebElement CriticalMessage(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='message-popup-window']/div[1]/a"));
		return element;
		}
	
	public static WebElement Sales(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='nav']/li[1]"));
		return element;
		}
	
	public static WebElement Sales_Orders(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='nav']/li[1]/ul/li[1]/a/span"));
		return element;
		}

}
