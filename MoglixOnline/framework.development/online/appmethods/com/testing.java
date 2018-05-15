package online.appmethods.com;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import online.common.com.CommonMethods;

public class testing {

	
		CommonMethods cm= new CommonMethods();
		
		@Test()
		
		public void testapp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//home//moglix//Desktop//SeleniumDriver//chromedriver");
		
        
	     WebDriver driver=new ChromeDriver();
			 
		
		      
		      driver.get("https://moglix.com//login");
		      
		      driver.manage().window().maximize(); 
		      
		      driver.findElement(By.xpath("//input[starts-with(@formcontrolname,'email')]")).sendKeys("test1@yopmail.com");
		      
		      driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
		      Thread.sleep(3000); 
		      
		      driver.findElement(By.xpath("//input[starts-with(@formcontrolname,'password')]")).sendKeys("test@123");
		      
		      
		      driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();

		      driver.findElement(By.xpath("//img[starts-with(@alt,'Shop for Assortment')]")).click();
		      
		      Thread.sleep(3000); 
		     
		     // cm.scrolldown();
		      driver.findElement(By.xpath("//best-seller//div[@class='owl-stage-outer']//*[@class=\"owl-item active\"][1]")).click();
		      Thread.sleep(3000); 
		      driver.findElement(By.xpath("//button[contains(text(),'ADD TO ')]")).click();
		      Thread.sleep(3000); 
		      
		      driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
		      Thread.sleep(3000); 
		      
		      driver.findElement(By.xpath("//button[contains(text(),'PLACE ORDER')]")).click();
		      Thread.sleep(3000); 
	
             
		      driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
		      Thread.sleep(3000); 
		      
		      driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO PAYMENT')]")).click();
		      Thread.sleep(3000);
		      
		      try {
	    		   driver.findElement(By.xpath("//ul[@class='ullist']//li[.='Cash On Delivery']")).isDisplayed();
	    			driver.findElement(By.xpath("//ul[@class='ullist']//li[.='Cash On Delivery']")).click();            
	    			
	    			Thread.sleep(3000);
	    			
	    		}catch(Exception e){
	    			WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Product out of stock')]"));
	    		    //  JavascriptExecutor executor = (JavascriptExecutor)driver;
	    		     // executor.executeScript("arguments[0].click();", ele);
	    		      String value = ele.getText();
	    		      System.out.println(value);
	    		      
	    		      Thread.sleep(3000);
	    		}
		      
		    /*  
		      WebElement ele = driver.findElement(By.xpath("//ul[@class='ullist']//li[.='Cash On Delivery']"));
		      JavascriptExecutor executor = (JavascriptExecutor)driver;
		      executor.executeScript("arguments[0].click();", ele);
		      String value = ele.getText();
		      System.out.println(value);
		      Thread.sleep(3000); 
		      */
		      
		     
		      
		      driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		     
		     
		      Thread.sleep(3000); 
			
	/*
		Actions act = new Actions(driver);
		 
	    // Script for dragging an element and dropping it in another place
	    WebElement iFrame = driver.findElement(By.tagName("iframe"));
	    System.out.println(iFrame.getSize());
	    driver.switchTo().frame(iFrame);
	 
	    WebElement From = driver.findElement(By.id("//span[contains(@class,'icon-safety')]"));
	    System.out.println(From.getLocation());
	 
	    WebElement To = driver.findElement(By.id("droppable"));
	    System.out.println(To.getLocation());
	 
	    act.dragAndDrop(From, To).build().perform(); 
	    
	    driver.findelement("").click();
	    
	  //span[contains(@class,'icon-safety')]
	    
	  //a[contains(text(),'Safety Signs & Signals')]
	    
	  //h4[contains(text(),'Hitachi 12V Cordless Driver Drill, DS12DVF3')]*/

	}

}
