package testCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import au.com.bytecode.opencsv.CSVReader;
import pageObjects.BackEndLoginPage;
import pageObjects.BackEnd_HomePage;
import pageObjects.BackEnd_SalesOrderPage;

public class Ecommerce_Day10 {

	public static WebDriver driver;
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\QA Tools\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver, 40);
		
		driver.get("http://live.guru99.com/index.php/backendlogin/");
		
		BackEndLoginPage.Username_Textbox(driver).clear();
		BackEndLoginPage.Username_Textbox(driver).sendKeys("user01");

		BackEndLoginPage.Password_Textbox(driver).clear();
		BackEndLoginPage.Password_Textbox(driver).sendKeys("guru99com");
		
		BackEndLoginPage.Login_Button(driver).click();
		
		BackEnd_HomePage.CriticalMessage(driver).click();
		
		Actions action=new Actions(driver);
		WebElement Sales = BackEnd_HomePage.Sales(driver);
		action.moveToElement(Sales).build().perform();
		
		BackEnd_HomePage.Sales_Orders(driver).click();
		
		Select exporttodropdown = new Select(BackEnd_SalesOrderPage.Export_to_dropdown(driver));
		exporttodropdown.selectByVisibleText("CSV");
		
		BackEnd_SalesOrderPage.Export_button(driver).click();
		
		
		// This will load csv file 
		//wait.until(ExpectedConditions.presenceOfElementLocated(null))
		Thread.sleep(5000);
		 CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Karthick\\Downloads\\orders.csv"));
		 
		 
		 // this will load content into list
		  List<String[]> li = null;
		try {
			li = reader.readAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Total rows which we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
		     
		 String[] str=i1.next();
		   
		 System.out.print(" Values are ");
		 
		 for(int i=0;i<str.length;i++)
		{
		 
		   System.out.print(" "+str[i]);
		 
		}
		   System.out.println("   ");
		
	}
		 
		 
		 
		 
		 
		 
		 

}
	
	
	
}