package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class After_Sharing {
	
	private static WebElement element;
	
	public static WebElement Title(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span"));
		return element;
	}

}
