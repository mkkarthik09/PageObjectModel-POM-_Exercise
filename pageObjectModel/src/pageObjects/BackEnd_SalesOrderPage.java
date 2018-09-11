package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackEnd_SalesOrderPage {
	
	static WebElement element;
	
	public static WebElement Export_to_dropdown(WebDriver driver){
		element = driver.findElement(By.id("sales_order_grid_export"));
		return element;
	}
	
	public static WebElement Export_button(WebDriver driver){
		element = driver.findElement(By.cssSelector("button.scalable.task[id^='id_']"));
		return element;
	}

}
