package online.testcases.com;

import java.io.IOException;


import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import online.appmethods.com.RFQMethods;
import online.common.com.CommonMethods;
import online.utility.com.Log;
import online.utility.com.RFQExcel;

public class RequestQuoteProcess extends RFQMethods {
	
	CommonMethods cm= new CommonMethods();
	
	
	/******************************************************
	 * @author Shalini Singh
	 * Test Case Objective : Apply RFQ From Product page
	 * @throws InterruptedException 
	 * Date:-  May 2018
	 * @throws IOException 
	   
	 *******************************************************/
	
	 @Test()
     public void NavigatedToRFQPage() throws InterruptedException, IOException {
   			 
   	    cm.ImplicityWait(10);
   	    		
   	    DOMConfigurator.configure("log.xml");
   	    Log.startTestCase("Request Quote process");
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
   	    	cm.TakeScreenshots("ProductOutOfStock");
            Thread.sleep(6000);
   	        clkOnRequestQuoteBtn();
   	        Log.info("Request Quote Now button is found");
       		Thread.sleep(3000);
       		cm.TakeScreenshots("QuotationPage");
   	    }
   	    
   	       Log.endTestCase("Test Case End");
   		
      }
	 
	 
	 @Test(dataProvider = "Quote", dataProviderClass = RFQExcel.class)
	 public void ApplyBulkOrderRequestForm(String proQty, String panNo) throws InterruptedException, IOException {
		
		cm.ImplicityWait(10);
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("BULK ORDER REQUEST FORM");
		
		enterProQty(proQty);
		Log.info("Product Qty is: " +proQty);
		
		selBusinessUserchkbox();
		Thread.sleep(3000);
		
		selIndustry(2);
		Log.info("Industry name is: Retailer" );
		Thread.sleep(3000);
		
		enterPanNo(panNo);
		Log.info("Pan number is: " +panNo);
		Thread.sleep(3000);
		
		clkOnQuoteBtn();
		Log.info("Bulk order has been created");
		Thread.sleep(6000);
		
		cm.TakeScreenshots("SubmitQuoteform");
		
		Log.endTestCase("Test Case End");
		
		
		
	 }

}
