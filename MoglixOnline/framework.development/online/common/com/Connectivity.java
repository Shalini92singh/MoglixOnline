package online.common.com;

import java.awt.ActiveEvent;
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import online.pom.com.LoginPage;
import online.pom.com.ProductPurchasePage;
import online.pom.com.RFQPage;
import online.repository.com.Property;


public class Connectivity implements Property{
	
	public static WebDriver driver= null;
	
	@BeforeSuite
	public void launchBrowser(){
		
	    
		System.setProperty(chromeDriver, chromePath);
		driver = new ChromeDriver();	
		driver.get(webURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize(); 
	   // common.WelComeNote();
	   // common.ImplicityWait(10);

	    new LoginPage(driver);
	    new ProductPurchasePage(driver);
	    new RFQPage(driver);
	    
	}
}