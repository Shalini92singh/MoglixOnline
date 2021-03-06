package online.testcases.com;
import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import online.appmethods.com.LoginMethods;
import online.pom.com.LoginPage;
import online.utility.com.Log;
import online.utility.com.LoginExcel;

public class BusinessAccount extends LoginMethods{
	
	
	/***********************************************
	 * @author Shalini Singh
	 * Test Case Objective : To navigate sign up page
	 * Note:- MailId should not exist in database 
	 * @throws IOException 
	   
	 *************************************************/
	
	@Test(dataProvider = "signupforBusinessAcountuser", dataProviderClass = LoginExcel.class , enabled= true)
	public void navigateOnSignupPage(String emailAddress) throws IOException {
		
		common.ImplicityWait(10);
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("TC_Login_01");
		
		common.ExplicityWait(30);
		common.alertOkbutton();
		
		Log.info("Enter emailAddress");
		enterEmailAdd(emailAddress);
		Assert.assertTrue(LoginPage.enter_emailAddress.isDisplayed(), "Failed: Email id field is not found");
		Log.info("Entred Username is: " +emailAddress);
		
		Log.info("Click on Continue buttton");
		clkContinuebtn();
		Assert.assertTrue(LoginPage.clk_continue_btn.isDisplayed(), "Failed: Continue button is not found");
		Log.info("Sign Up page found");
		
		
		common.TakeScreenshots("signup");
		 Log.endTestCase("Test Case End");
		
	}
	
	
	/***********************************************
	 * @author Shalini Singh
	 * Test Case Objective : Create Business Account               
	 * Note:- mail id should be new (Mail id should not be use for moglix app)
	 * @throws IOException 
	 * @throws InterruptedException 
	   
   *************************************************/
	
	
	
	 @Test(dependsOnMethods= "navigateOnSignupPage",dataProvider = "bussinessUSerSignup", dataProviderClass = LoginExcel.class)
	  public void navigateToCreateBusinessAccountPage(String password, String mobileNumber, String name) throws IOException, InterruptedException {
		  
		   common.ImplicityWait(20);
			
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("TC_Login_04");
		  
			Log.info("Enter password");
		    enterPassword(password);
		    Log.info("Click on personal account button");
		    Thread.sleep(6000);
		    
			Log.info("Enter mobile number");
			enterMobileNo(mobileNumber);
			Assert.assertTrue(LoginPage.enter_mobileNumber.isDisplayed(), "Failed: Mobile number field did not found");
			Thread.sleep(6000);
		    Log.info("Enter Name");
		    enterName(name);
		    Assert.assertTrue(LoginPage.enter_name.isDisplayed(), "Failed: Name field did not found");
		    Thread.sleep(6000);
		   
		    
		    Log.info("User is navigated on  Create BusinessAccountPage");
		    clkbusinessAccbtn();
		    Assert.assertTrue(LoginPage.clk_businessAccount_btn.isDisplayed(), "Failed: business button field did not found");
		    Thread.sleep(6000);
		    common.TakeScreenshots("Create_BusinessAcc_Page");
		    Log.endTestCase("Test Case End");
		  
	  }
	  
	  @Test(dependsOnMethods= "navigateToCreateBusinessAccountPage")
	  public void verifyMandatoryfieldBusinessAccountPage() throws IOException, InterruptedException {
		  
		  common.ImplicityWait(20);
			
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("TC_Login_05");
			
			common.scrolldown();
			Thread.sleep(6000);
			Log.info("Validate Create Business Account Button is enabled");
			
			clkbusinessAccbtn();
			Assert.assertFalse(LoginPage.clk_CreatebusinessAccount_btn.isEnabled(), "Failed: business account button is foud Enabled");
			Thread.sleep(6000);
			 
			common.scrollup(); 
			
			common.TakeScreenshots("ManadatoryFields");
			Log.endTestCase("Test Case End");
		  
	  }
	  
	  
	  
	  
	  /***********************************************
		 * @author Shalini Singh
		 * Test Case Objective : Create Business Account
		 * Note:- MailId should not exist in database 
		 * @throws IOException 
	 * @throws InterruptedException 
		   
	   *************************************************/
	  
	  @Test(dependsOnMethods= "verifyMandatoryfieldBusinessAccountPage", dataProvider = "BusinessAccount", dataProviderClass = LoginExcel.class, enabled= true)
	  public void signUpwithBusinessAccountInMoglixApp(String companyName, String addressLine, 
			  String emailAddress,String pin,String bussinessPhone, String panNo  ) throws IOException, InterruptedException {
	  
		common.ImplicityWait(30);
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("TC_Login_06");
		
		
	    enterBusinessEntity(companyName);
	    Log.info("Enter value in Business Entity Name: " +companyName);
	  //  Assert.assertNotNull(LoginPage.enter_businessEntityName.getAttribute("value"), "Failed: Business entity field did not found blank");
	    common.ExplicityWait(30);
	    
	    enterRegisterAdd(addressLine);
	    Thread.sleep(6000);
	  //  Assert.assertNotNull(LoginPage.enter_registeredAddress.getAttribute("value"), "Failed: Register Address field did not found blank");
	    Log.info("Enter value in Registered  Address: "+addressLine);
	    
	    
	    enterEmailAdd(emailAddress);
	    Log.info("Enter value in business Email ID: "+emailAddress);
	    Thread.sleep(6000);
	    
	    enterPinNo(pin);
	    Log.info("Enter value in PIN: " +pin);
	    Thread.sleep(6000);
	    
	    enterMobileNo(bussinessPhone);
	    Log.info("Enter value in Business Phone Number: " +bussinessPhone);
	    common.ExplicityWait(30);
	    
	    Log.info("Select Industry from drop down");
	    selIndustry(5);
	    common.ExplicityWait(30);
	    
	    Log.info("Select Business type from drop down");
	    selBusinessType(1);
	    common.ExplicityWait(30);
	    
	    
	    enterPanNo(panNo);
	    Log.info("Enter Pan number: " +panNo);
	    
	    Thread.sleep(6000);
	  //  Log.info("Enter GST");
	   // enterGST(gst);
	    
	    common.scrolldown();
	    Thread.sleep(3000);
	       
	   clkbusinessAccbtn();
	    
       clkhomebtn();
	    
	    Log.endTestCase("Test Case End");
	    
	     
	    
	  }
	  
	  
 
	/***********************************************
	 * @author Shalini Singh
	 * Test Case Objective : Login with existing user
	   
	 ************************************************/
	  /*
	@Test (dataProvider = "Login", dataProviderClass = LoginExcel.class, enabled= true)
	public void validLogin(String emailAddress, String password) throws IOException, InterruptedException{
		
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Login TestCase for Online user");
		
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
		
		
		
	} */
}


