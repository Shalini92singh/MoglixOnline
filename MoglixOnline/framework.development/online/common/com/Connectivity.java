package online.common.com;

import java.awt.ActiveEvent;
import java.awt.Dimension;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import online.pom.com.LoginPage;
import online.pom.com.ProductPurchasePage;
import online.pom.com.RFQPage;
import online.repository.com.Property;
import online.testReportMailConfiguration.com.Mailconfiguration;


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
	
	@AfterSuite
	
	public void sendTestingReport() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Mailconfiguration();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
}