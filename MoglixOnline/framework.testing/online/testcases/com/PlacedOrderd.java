package online.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import online.appmethods.com.ProductPurchageMethods;
import online.common.com.CommonMethods;
import online.pom.com.LoginPage;
import online.pom.com.ProductPurchasePage;
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
	    
	    CommonMethods cm= new CommonMethods();
	
	
	   
	    
	   
	
        @Test()
        public void SelectProduct() throws InterruptedException, IOException {
        	
           cm.ImplicityWait(10);
    		
    		DOMConfigurator.configure("log.xml");
    		Log.startTestCase("To Select prodcut");
    		
    	//	clkOnProducttitle(productName);
    	//	Log.info("Click on product Title : " + productName );
    	////	Thread.sleep(3000);
    		
    		clkOnproductnametext();
    		Log.info("Click on product Title");
    		Thread.sleep(3000);
    		cm.TakeScreenshots("ProductNameScreen");
    	//	common.scrolldown();
    		Log.endTestCase("Test Case End");
    	    
        }
    		
       @Test()
      public void AddProductIntoCart() throws InterruptedException, IOException {
    			 
    	    cm.ImplicityWait(10);
    	    		
    	    DOMConfigurator.configure("log.xml");
    	    Log.startTestCase("OpenCartItam");
    	    Thread.sleep(3000);
    	    
    	    if (driver.findElements(By.xpath("//button[contains(text(),'ADD TO ')]")).size() != 0) {
    	    	
    	    	Log.info("Click on Add to Cart");
    	    	clkOnAddtoCartbtn();
        		//Assert.assertTrue(ProductPurchasePage.clk_CartIcon.isDisplayed(), "Failed: Element is not found");
        		cm.ExplicityWait(10);
        		
        		Log.info("Click on Cart Icon");
        	    clkOnCartIcon();
        		Thread.sleep(3000);
     
        	    cm.scrollup();
        	    Thread.sleep(3000);
        	
        		clkOnPlaceOrderbtn();
        		Log.info("Click on place order");
        		//common.ExplicityWait(10);
        		
        		cm.TakeScreenshots("AddCardDetailspage");
        		Log.endTestCase("Test Case End");
        		
    	    } else{
    	    	
    	    	Log.info("Add to Cart button not found due to product is out of stock");
    	    	cm.TakeScreenshots("outOfStockProduct");
        		Thread.sleep(3000);	
        		
        		
    	    }
    	    
    	    Log.endTestCase("Test Case End");
    		
       }
    		
    	 @Test(dataProvider = "Adress",dataProviderClass= ProductPurchaseExcel.class)
    	 public void addShippingAddress(String pin, String addressLine) throws InterruptedException, IOException {
    	     			 
    	cm.ImplicityWait(10);
	    		
    	DOMConfigurator.configure("log.xml");
    	Log.startTestCase("Add Address");  
    	
    	//element = null;
    	Thread.sleep(6000);
    	try {
    	 // element = driver.findElement(By.xpath("//label[contains(text(),'+ Add Shipping Address')]"));
    			  // Log.info("Add Address button found");
    			   clkOnAddAddresstxt();
    			   
    			   Thread.sleep(6000);
    			//   common.ExplicityWait(20);
    			   
    	}catch(Exception e) {
    		Log.error("Add Shipping Address button not found");
    		Thread.sleep(3000);
    		//common.ExplicityWait(20);
    		
    	}finally{
    		
    		enterPinNo(pin);
    		Log.info("Enter Pin Code : " +pin );
      		Thread.sleep(3000);
    		
    	}	
  		enterRegisterAdd(addressLine);
  		Log.info("Enter Address Name : " +addressLine );
  		Thread.sleep(3000);
  		
  		cm.TakeScreenshots("ShippingAddressPage");	
  		
  		clkOnSavebutn();
  		Thread.sleep(3000); 
  
  		Log.endTestCase("Test Case End");
    	 }
    	 
    	 
    	@Test()
       	 public void proceedOrdertoPayment() throws InterruptedException, IOException {   		
    	
    		
      	  DOMConfigurator.configure("log.xml");
      	  Log.startTestCase("Proceed COD Order to Payment "); 
    		 
    		
    		clkContinuebtn();
    		Log.info("Click on Continue button");
    		cm.ImplicityWait(10);
    		
    		clk_proceedtoPay();
    		Log.info("Click on proceed to payment");
    		Thread.sleep(6000);
    		
    		try {
    			element= driver.findElement(By.xpath("//ul[@class='ullist']//li[.='Cash On Delivery']"));
    		  
    			clkOnCashOnDliverytab();
    			Log.info("Cash on dilivery button found");
    			Thread.sleep(3000);
    			
    		}catch(Exception e){
    			
    			gettextOutofStock();
    			Log.info("Product is out of stock");
    			Assert.assertTrue(ProductPurchasePage.gettext_outofStock.isDisplayed(), "Failed: Product is out of stock");
    			Thread.sleep(3000);
    			cm.TakeScreenshots("OutofStock");
    		}
    		
    		
    		Log.endTestCase("Test Case End");
    		
    		
    		}
    		
    		
    		
    		//clkonApplybtn();
    		
    		//clkOnPlaceOrderbtn();
    		//Thread.sleep(3000);
    	//}
    	
    	/******************************************************
    	   * @author Shalini Singh
    	   * Test Case Objective : Placed Order with Business user
    	   * @throws InterruptedException 
    	   * Date:- 27 April 2018
    	   * @throws IOException 
    	    		   
    	   *******************************************************/
   
    	
    	@Test (dataProvider = "Loginbusinessuser", dataProviderClass= ProductPurchaseExcel.class)
	    public void LoginwithBussinessUser(String emailAddress, String password) throws IOException, InterruptedException{
		
	    cm.ImplicityWait(10);
	    
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
        
        cm.TakeScreenshots("HomePage");
	    
	    Log.endTestCase("Test Case End");
    		
    	}
    	
    	
		@Test(dataProvider= "BillingAdd",dataProviderClass= ProductPurchaseExcel.class)
	    public void addBiillingAddress(String pin, String addressLine, String gst) throws InterruptedException, IOException{
			
			cm.ImplicityWait(10);
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("Add Billing Address");
			
			cm.scrolldown();
			
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
	  		
	  		cm.TakeScreenshots("BillingAddressPage");
	  		
	  		clkOnSavebutn();
	  		Thread.sleep(3000); 
	  		Log.endTestCase("Test Case End");
			
		}
		
	  /******************************************************
  	   * @author Shalini Singh
  	   * Test Case Objective : Category wise product ordered
  	   * @throws InterruptedException 
  	   * Date:- 4 May 2018
  	   * @throws IOException 
  	    		   
  	   *******************************************************/
		
		@Test()
		public void OrderCategoryProduct() throws InterruptedException, IOException {
			cm.ImplicityWait(20);
			
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("Category wise product ordered");
			
			
			Log.info("clk on view all Category");
			clkOnViewAllCategory();
			cm.ExplicityWait(10);
			
			Log.info("clk on Category Product Electronic");
			clkOnElectronicCategory();
			Thread.sleep(3000);
			
			
			Log.info("Click on more button");
			clkOnMorebtn();
			Thread.sleep(6000);
			
			Log.info("clk on First sub category Product");
			clkonFirstProduct();
			Assert.assertTrue(ProductPurchasePage.clkon_FirstProduct.isDisplayed(), "Failed: Product not found");
			Thread.sleep(6000);
			
			Log.info("clk on sub category Product");
			clkonFirstProduct();
	        Assert.assertTrue(ProductPurchasePage.clkon_FirstProduct.isDisplayed(), "Failed: Product not found");
	        
	        cm.scrollup();
    	    Thread.sleep(6000);
	
			
			Log.info("Select First Product");
			clkonSubCategoryPro();
			cm.ExplicityWait(10);
			
			cm.windohandler();
			Thread.sleep(3000); 
			
			cm.TakeScreenshots("AddtoCartPage");
			
			Log.endTestCase("Test Case End");
		}
		
		 @Test (dataProvider = "Login", dataProviderClass = LoginExcel.class)
		    public void validLogin(String emailAddress, String password) throws IOException, InterruptedException{
			
		    cm.ImplicityWait(10);
		    
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("Login with Online user");
			
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
		    
	        cm.TakeScreenshots("LoginInAppScreen");
		    Log.endTestCase("Test Case End");

		 }
		 
		 @Test (dataProvider = "BusinessUser", dataProviderClass = LoginExcel.class)
		    public void loginWithBusinessUser(String emailAddress, String password) throws IOException, InterruptedException{
			
		    cm.ImplicityWait(10);
		    DOMConfigurator.configure("log.xml");
			Log.startTestCase("Login with Online user");
			
			Log.info("Enter emailAddress");
			enterEmailAdd(emailAddress);
			Log.info("Entred Username is: " +emailAddress);
			
			Log.info("Click Continue Button");
			clkContinuebtn();
		
			enterPassword(password);
			Log.info("Entered Password is: "+password);
			
			Log.info("Again Click Continue Button");
			clkContinuebtn();
			Thread.sleep(3000);
			
	        clkhomebtn();
	        Thread.sleep(3000);
		    
	        cm.TakeScreenshots("LoginInAppScreen");
		    Log.endTestCase("Test Case End");
		    
    		
		 }  
   }
	

