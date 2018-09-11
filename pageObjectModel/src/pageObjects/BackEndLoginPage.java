package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackEndLoginPage {
	static WebElement element = null;
	
	public static WebElement Username_Textbox(WebDriver driver){
		element = driver.findElement(By.id("username"));
		return element;
		}
	
	public static WebElement Password_Textbox(WebDriver driver){
		element = driver.findElement(By.id("login"));
		return element;
		}
	
	public static WebElement Login_Button(WebDriver driver){
		element = driver.findElement(By.cssSelector("input.form-button[value='Login']"));
		return element;
		}

}
