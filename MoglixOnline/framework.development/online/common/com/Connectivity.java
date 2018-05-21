package online.common.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import online.pom.com.LoginPage;
import online.pom.com.ProductPurchasePage;
import online.pom.com.RFQPage;
import online.repository.com.Property;
import online.testReportMailConfiguration.com.Mailconfiguration;


public class Connectivity implements Property{
	
	public static WebDriver driver= null;
	
	@BeforeSuite
	public void launchBrowser() throws IOException, InterruptedException{
		
	    
		System.setProperty(chromeDriver, chromePath);
		driver = new ChromeDriver();	
		driver.get(webURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize(); 
	  //  Thread.sleep(3000);
	  //  common.Welcomemessage();
	//    common.ImplicityWait(10);
   //    common.TakeScreenshots("message");
	    new LoginPage(driver);
	    new ProductPurchasePage(driver);
	    new RFQPage(driver);
	    
	    
	}
	
	@AfterSuite
	
	public void sendTestingReport() throws InterruptedException {
		Thread.sleep(6000);
		new Mailconfiguration();
		Thread.sleep(6000);
	}
	
	
	
}