package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	private static WebElement element = null;

	
	public static WebElement FirstName(WebDriver driver){
		element = driver.findElement(By.id("firstname"));
		return element;
		}
	
	public static WebElement MiddleName(WebDriver driver){
		element = driver.findElement(By.id("middlename"));
		return element;
		}
	
	public static WebElement LastName(WebDriver driver){
		element = driver.findElement(By.id("lastname"));
		return element;
		}
	
	public static WebElement EmailAddress(WebDriver driver){
		element = driver.findElement(By.id("email_address"));
		return element;
		}
	
	public static WebElement Password(WebDriver driver){
		element = driver.findElement(By.id("password"));
		return element;
		}
	
	public static WebElement ComfirmPassword(WebDriver driver){
		element = driver.findElement(By.id("confirmation"));
		return element;
		}
	
	public static WebElement Registerbutton(WebDriver driver){
		element = driver.findElement(By.cssSelector("button.button[title='Register']"));
		return element;
		}
}
