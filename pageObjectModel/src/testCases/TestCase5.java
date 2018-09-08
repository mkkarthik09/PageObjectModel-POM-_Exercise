package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.After_Sharing;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.MyAccount_ShareWishList;
import pageObjects.RegistrationPage;
import pageObjects.TVPage;

public class TestCase5 {
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		/*1. Go to URL
		 *2. Click my account link
		 *3. Click create account link and fill new user information except email id
		 *4. Click Register
		 *5. Verify registration is done
		 *6. Go to TV menu
		 *7. Add product in your wishlist(Product LG LCD)
		 *8. Click share wishlist
		 *9. In the next page enter the email and a message and click share wishlist
		 *10. Check wishlist is shared   
		 * 
		 */
		//1. Go to URL
		System.setProperty("webdriver.gecko.driver","D:\\QA Tools\\Selenium\\drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://live.guru99.com/index.php/");
		//2. Click my account link
		HomePage.Click_Account(driver).click();
		HomePage.Click_MyAccount(driver).click();
		//3. Click create account link 
		HomePage.Click_CreateAnAccount(driver).click();
		//3.1. fill new user information
		RegistrationPage.FirstName(driver).clear();
		RegistrationPage.FirstName(driver).sendKeys("Karthik");
		
		RegistrationPage.MiddleName(driver).clear();
		RegistrationPage.MiddleName(driver).sendKeys("K");
		
		RegistrationPage.LastName(driver).clear();
		RegistrationPage.LastName(driver).sendKeys("M");
		
		
		RegistrationPage.EmailAddress(driver).clear();
		RegistrationPage.EmailAddress(driver).sendKeys("kovil.karthik@gmail.com");
		
		RegistrationPage.Password(driver).clear();
		RegistrationPage.Password(driver).sendKeys("Whatever5833");
		
		RegistrationPage.ComfirmPassword(driver).clear();
		RegistrationPage.ComfirmPassword(driver).sendKeys("Whatever5833");
		
		//4. Click Register
		RegistrationPage.Registerbutton(driver).click();
		
		//5. Verify registration is done
		String WindowTitle=driver.getTitle();
		
		if(WindowTitle.contains("Create New Customer Account")){
			System.out.println("New Account has not created");
		}
		else
		{
			System.out.println("New Account has created successfully");
		}
		
		//6. Go to TV menu
		MyAccountPage.TVLink(driver).click();
		
		//Scroll down
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)", "");
		
		//7. Add product in your wishlist(Product LG LCD)
		TVPage.LG_LCDTV_AddWishList(driver).click();
		
		//8. Click share wishlist
		TVPage.LG_LCDTV_ShareWishList(driver).click();
		
		//9. In the next page enter the email and a message and click share wishlist
		MyAccount_ShareWishList.Email_IDs_ToShare(driver).clear();
		MyAccount_ShareWishList.Email_IDs_ToShare(driver).sendKeys("mk.karthik09@gmail.com,kovil.karthik@gmail.com");
		
		//Scroll down
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		MyAccount_ShareWishList.Message_ToShare(driver).clear();
		MyAccount_ShareWishList.Message_ToShare(driver).sendKeys("Test");
		
		MyAccount_ShareWishList.ShareWishListButton_ToShare(driver).click();
		
		//10. Check wishlist is shared 
		String SuccessMsg=After_Sharing.Title(driver).getText();
		System.out.println(SuccessMsg);
	}

}
