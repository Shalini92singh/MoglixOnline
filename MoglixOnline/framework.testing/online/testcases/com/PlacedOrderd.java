package online.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import online.appmethods.com.ProductPurchageMethods;
import online.pom.com.LoginPage;
import online.utility.com.Log;
import online.utility.com.LoginExcel;
import online.utility.com.ProductPurchaseExcel;


public class PlacedOrderd extends ProductPurchageMethods {
	
	/******************************************************
	 * @author Shalini Singh
	 * Test Case Objective : Placed Order with personal User
	 * @throws InterruptedException 
	 * Date:- 26 April 2018
	 * @throws IOException 
	   
	 *******************************************************/
	
	    public static WebElement element = null;
	
	
	    @Test (dataProvider = "Login", dataProviderClass = LoginExcel.class, enabled= false, priority= 1)
	    public void validLogin(String emailAddress, String password) throws IOException, InterruptedException{
		
	    common.ImplicityWait(10);
	    
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Login with personal account user");
		
		Log.info("Enter emailAddress");
		enterEmailAdd(emailAddress);
		Log.info("Entred Username is: " +emailAddress);
		
		Log.info("Click Continue Button");
		clkContinuebtn();
		
		Log.info("Enter Password");
		enterPassword(password);
		Log.info("Entered Password is: "+password);
		
		Log.info("Again Click Continue Button");
		clkContinuebtn();
		Thread.sleep(3000);
		
        clkhomebtn();
        Thread.sleep(3000);
	    
	    Log.endTestCase("Test Case End");
	    
	}
        @Test(enabled= true,priority= 2)
        public void SelectProduct() throws InterruptedException {
        	
           common.ImplicityWait(10);
    		
    		DOMConfigurator.configure("log.xml");
    		Log.startTestCase("To Select prodcut");
    		
    	//	clkOnProducttitle(productName);
    	//	Log.info("Click on product Title : " + productName );
    	////	Thread.sleep(3000);
    		
    		clkOnproductnametext();
    		Log.info("Click on product Title");
    		Thread.sleep(3000);
    		
    	//	common.scrolldown();
    		
    		clkOnAddtoCartbtn();
    		Log.info("Click on Add to Cart");
    		Thread.sleep(3000);
    		
    			
        }
    		
       @Test(enabled= true,priority= 3)
      public void OpenCartItem() throws InterruptedException {
    			 
    	    common.ImplicityWait(10);
    	    		
    	    DOMConfigurator.configure("log.xml");
    	    Log.startTestCase("OpenCartItam");
    	    
    	    common.scrollup();
    	    Thread.sleep(3000);
    		
    		clkOnCartIcon();
    		Log.info("Click on Cart");
    		Thread.sleep(3000);
    		
    		clkOnPlaceOrderbtn();
    		Log.info("Click on place order");
    		common.ExplicityWait(30);
    		
       }
    		
    	 @Test(dataProvider = "Adress",dataProviderClass= ProductPurchaseExcel.class, enabled= true,priority= 4)
    	 public void addShippingAddress(String pin, String addressLine) throws InterruptedException {
    	     			 
    	common.ImplicityWait(10);
	    		
    	DOMConfigurator.configure("log.xml");
    	Log.startTestCase("Add Address");  
    	
    	//element = null;
    	
    	try {
    	   element = driver.findElement(By.xpath("//label[contains(text(),'+ Add Shipping Address')]"));
    			   Log.info("Add Address button found");
    			   clkOnAddAddresstxt();
    			  // Thread.sleep(3000);
    			   common.ExplicityWait(20);
    			   
    	}catch(Exception e) {
    		Log.error("Add Address button not found");
    		Thread.sleep(3000);
    		
    	}finally {
    		
    		enterPinNo(pin);
    		Log.info("Enter Pin Code : " +pin );
      		Thread.sleep(3000);
    		
    	}
  		
    	
  		enterRegisterAdd(addressLine);
  		Log.info("Enter Address Name : " +addressLine );
  		Thread.sleep(3000);
  		
  		clkOnSavebutn();
  		Thread.sleep(3000); 	    
    		
    		
    	 }
    	 
    	@Test(enabled= true,priority= 6)
       	 public void proceedOrdertoPayment() throws InterruptedException {   		
    	
    		
      	  DOMConfigurator.configure("log.xml");
      	  Log.startTestCase("Proceed COD Order to Payment "); 
    		
    		
    		clkContinuebtn();
    		Log.info("Click on Continue button");
    		common.ImplicityWait(10);
    		
    		clk_proceedtoPay();
    		Log.info("Click on proceed to payment");
    		
    		Thread.sleep(3000);
 
    		clkOnCashOnDliverytab();
    		Log.info("Click on cash on delivery Tab");
    		
    		Thread.sleep(3000);
    		
    		//clkonApplybtn();
    		
    		//clkOnPlaceOrderbtn();
    		//Thread.sleep(3000);
    	}
    	
    	/******************************************************
    	   * @author Shalini Singh
    	   * Test Case Objective : Placed Order with Business user
    	   * @throws InterruptedException 
    	   * Date:- 27 April 2018
    	   * @throws IOException 
    	    		   
    	   *******************************************************/
   
    	
    	@Test (dataProvider = "Loginbusinessuser", dataProviderClass= ProductPurchaseExcel.class, enabled= true, priority= 1)
	    public void LoginwithBussinessUser(String emailAddress, String password) throws IOException, InterruptedException{
		
	    common.ImplicityWait(10);
	    
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Login with business account user");
		
		Log.info("Enter emailAddress");
		enterEmailAdd(emailAddress);
		Log.info("Entred Username is: " +emailAddress);
		
		Log.info("Click Continue Button");
		clkContinuebtn();
		
		Log.info("Enter Password");
		enterPassword(password);
		Log.info("Entered Password is: "+password);
		
		Log.info("Again Click Continue Button");
		clkContinuebtn();
		Thread.sleep(3000);
		
        clkhomebtn();
        Thread.sleep(3000);
	    
	    Log.endTestCase("Test Case End");
    		
    	}
    
    	
		@Test(dataProvider= "BillingAdd",dataProviderClass= ProductPurchaseExcel.class, enabled= true, priority= 6)
	    public void addBiillingAddress(String pin, String addressLine, String gst) throws InterruptedException{
			
			common.ImplicityWait(10);
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("Add Billing Address");
			
			common.scrolldown();
			
			clkOnAddBillingAdd();
			Log.info("Click on Add billing text");
			
			enterPinNo(pin);
	  		Assert.assertTrue(LoginPage.enter_PINNumber.isDisplayed(), "Failed: Element is not found");
	  		Log.info("Enter Pin Code : " +pin );
	  		Thread.sleep(3000);
	  		
	  		enterRegisterAdd(addressLine);
	  		Log.info("Enter Address Name : " +addressLine );
	  		Thread.sleep(3000);
	  		
	  		enterGST(gst);
	  		Log.info("Enter GSTIN number : " +gst);
	  		
	  		clkOnSavebutn();
	  		Thread.sleep(3000); 
			
		}
		
		
		
		
		
	
		
    		
	   
   }
	

