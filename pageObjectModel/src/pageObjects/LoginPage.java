package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;
	
	public static WebElement My_Username(WebDriver driver){
		element =driver.findElement(By.id("email"));
		return element;
		}
	
	public static WebElement My_Password(WebDriver driver){ 
		element=driver.findElement(By.id("pass"));
	return element;
	}
	
	public static WebElement Click_Login(WebDriver driver){
	 element=driver.findElement(By.id("send2"));
	return element;
	}
	
}
