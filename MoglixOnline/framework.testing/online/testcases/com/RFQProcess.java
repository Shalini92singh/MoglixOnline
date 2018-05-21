package online.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import junit.framework.TestCase;
import online.appmethods.com.RFQMethods;
import online.common.com.CommonMethods;
import online.pom.com.RFQPage;
import online.utility.com.Log;
import online.utility.com.LoginExcel;
import online.utility.com.RFQExcel;

public class RFQProcess extends RFQMethods{
	
	
	PlacedOrderd po= new PlacedOrderd();
	CommonMethods cm= new CommonMethods();
	/******************************************************
	 * @author Shalini Singh
	 * Test Case Objective : RFQ Process for online user
	 * @throws InterruptedException 
	 * Date:-  16 May 2018
	 * @throws IOException 
	   
	 *******************************************************/
	
	
	@Test(dataProvider = "Login", dataProviderClass = LoginExcel.class)
	
	public void navigateToRFQPage(String username, String password) throws IOException, InterruptedException{
		
		cm.ImplicityWait(10);

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Navigate To RFQ Page");
		
		Log.info("Login in to the application");
		po.validLogin(username, password);
		
		clkOnBulkOrderQueryLink();
		Log.info("RFQ page Found");
		Thread.sleep(3000);
		
		cm.TakeScreenshots("RFQPage");
		
		Log.endTestCase("Test Case End");
		
	}
	
	@Test(dependsOnMethods= "navigateToRFQPage",dataProvider = "RFQ", dataProviderClass = RFQExcel.class, enabled= false)
	
	public void bulkOrderQuerywithOnlineUser(String proCatgory, String proQty, String brandName ) throws IOException, InterruptedException {
		
		cm.ImplicityWait(30);
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Submit Bulk Order Query");
		
		cm.windohandler();
		Thread.sleep(3000); 
		
		enterProCategory(proCatgory);
		Log.info("Product Category Name is: " +proCatgory);
		Thread.sleep(3000);
		
		enterProQty(proQty);
		Log.info("Product Qty is: " +proQty);
		Thread.sleep(3000);
		
		enterBrandName(brandName);
		Log.info("Product Brand Name is: " +brandName);
		Thread.sleep(3000);
		
		getFullName();
		Thread.sleep(3000);
		
		getEmailAddress();
		Thread.sleep(3000);
		
		getMbileNo();
		Thread.sleep(3000);
		
		clkOnSubmitRFQ();
		Thread.sleep(6000);
		Log.endTestCase("Test Case End");
		  
		
	}
	
	/******************************************************
	 * @author Shalini Singh
	 * Test Case Objective : RFQ Process for Business user
	 * @throws InterruptedException 
	 * Date:-  16 May 2018
	 * @throws IOException 
	   
	 *******************************************************/
   @Test(dataProvider = "BusinessUser", dataProviderClass = LoginExcel.class, enabled= false)
	
	public void navigateToRFQPagewithBusinessUser(String username, String password) throws IOException, InterruptedException{
		
		cm.ImplicityWait(10);

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Navigate To RFQ Page");
		
		Log.info("Login in to the application");
		po.loginWithBusinessUser(username, password);
		
		
		clkOnBulkOrderQueryLink();
		Log.info("RFQ page Found");
		Thread.sleep(3000);
		
		cm.TakeScreenshots("RFQPage");
		
		Log.endTestCase("Test Case End");
		
	}
	
   
   @Test(dependsOnMethods= "navigateToRFQPagewithBusinessUser",dataProvider = "RFQ", dataProviderClass = RFQExcel.class,enabled= false)
	
	public void bulkOrderQuerywithBusinessUser(String proCatgory, String proQty, String brandName) throws IOException, InterruptedException {
		
		cm.ImplicityWait(30);
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Submit Bulk Order Query");
		
		cm.windohandler();
		Thread.sleep(3000); 
		
		enterProCategory(proCatgory);
		Log.info("Product Category Name is: " +proCatgory);
		Thread.sleep(3000);
		
		enterProQty(proQty);
		Log.info("Product Qty is: " +proQty);
		Thread.sleep(3000);
		
		enterBrandName(brandName);
		Log.info("Product Brand Name is: " +brandName);
		Thread.sleep(3000);
		
		Log.info("Check business user check box");
		Assert.assertFalse(RFQPage.sel_businessUser_chkbox.isSelected(),
				"Failed: Select Already found Checked..");
		selBusinessUserchkbox();
		Thread.sleep(3000);
		
		getCompanyName();
		Thread.sleep(3000);
		
		getFullName();
		Thread.sleep(3000);
		
		selIndustry(3);
		
		getEmailAddress();
		Thread.sleep(3000);
		
		getMbileNo();
		Thread.sleep(3000);
		
		//enterGST("27GSPMH0601G1Z1");
		//Thread.sleep(3000);
		
		enterPanNo("ABCDS1234Y");
		Thread.sleep(3000);

		cm.TakeScreenshots("RFQPageData");
		
		cm.scrolldown();
		Thread.sleep(3000);
		
		clkOnSubmitRFQ();
		Thread.sleep(3000);
		Log.endTestCase("Test Case End");
	
   }
}












