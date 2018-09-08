package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
private static WebElement element = null;
	
	public static WebElement Click_Account(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div/a/span[2]"));
		return element;
		}

	public static WebElement Click_MyAccount(WebDriver driver){
		element= driver.findElement(By.linkText("My Account"));
		return element;
		}
	
	public static WebElement Click_CreateAnAccount(WebDriver driver){
		element= driver.findElement(By.linkText("CREATE AN ACCOUNT"));
		return element;
		}
	
	
}
