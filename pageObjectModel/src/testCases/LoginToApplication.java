package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginToApplication {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Tools\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://live.guru99.com/");
		
		HomePage.Click_Account(driver).click();
		HomePage.Click_MyAccount(driver).click();
		
		LoginPage.My_Username(driver).clear();
		LoginPage.My_Username(driver).sendKeys("mk.karthik09@gmail.com");
		LoginPage.My_Password(driver).clear();
		LoginPage.My_Password(driver).sendKeys("Whatever5833");
		LoginPage.Click_Login(driver).click();  
		
	}
	

}
