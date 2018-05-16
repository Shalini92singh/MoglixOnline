 package online.testcases.com;



import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import online.appmethods.com.LoginMethods;
import online.pom.com.LoginPage; 
import online.utility.com.Log;
import online.utility.com.LoginExcel;




   public class Personaluseraccount extends LoginMethods{
	
	/***********************************************
	 * @author Shalini Singh
	 * Test Case Objective : To navigate sign up page
	 * Note:- MailId should not exist in database 
	 * @throws IOException 
	 * @throws InterruptedException 
	   
	 *************************************************/
	@Test(dataProvider = "signup", dataProviderClass = LoginExcel.class , enabled= true)
	public void navigateOnSignupPage(String emailAddress) throws IOException, InterruptedException {
		
		common.ImplicityWait(10);
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("TC_Login_01");
	
		
		Log.info("Enter emailAddress");
		enterEmailAdd(emailAddress);
		Log.info("Entred Username is: " +emailAddress);
		Thread.sleep(3000);
		common.TakeScreenshots("signup");
		
		Log.info("Click on Continue buttton");
		clkContinuebtn();
		Log.info("Sign Up page found");
		Thread.sleep(3000);
		
		
		
		 Log.endTestCase("Test Case End");
		
	}
	
	/***********************************************
	 * @author Shalini Singh
	 * Test Case Objective : Verify mandatory fields
	 * @throws IOException 
	 * @throws InterruptedException 
	   
	 *************************************************/
	
	  @Test(dependsOnMethods= "navigateOnSignupPage", enabled= true)
      public void verifySingupMandatoryFields() throws IOException, InterruptedException {
		  
		common.ImplicityWait(20);
			
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("TC_Login_02"); 
		
		
		Log.info("Validate personal account button is enabled");
		Assert.assertFalse(LoginPage.clk_personalAccount_btn.isEnabled(), "Failed: Field Found Enabled");
		Thread.sleep(3000);
		
		common.TakeScreenshots("ManadatoryFields");
		 Log.endTestCase("Test Case End");
	
	}
	  
	  /***********************************************
		 * @author Shalini Singh
		 * Test Case Objective : Signup with personal account
		 * @throws IOException 
	 * @throws InterruptedException 
		   
		 *************************************************/
	  
	  
	  @Test(dependsOnMethods= "verifySingupMandatoryFields", dataProvider = "PersonalAccount", dataProviderClass = LoginExcel.class, enabled= true )
	  public void signupWithPersonalAccountInMoglixApp(String password, String mobileNumber, String name ) throws IOException, InterruptedException {
		  
		  common.ImplicityWait(20);
			
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("TC_Login_03");
				
		
		    enterPassword(password);
		    Log.info("Enter password: " +password);
		    Log.info("Click on personal account button");
		    
			
			enterMobileNo(mobileNumber);
			Log.info("Enter mobile number: " +mobileNumber);
			Assert.assertTrue(LoginPage.enter_mobileNumber.isDisplayed(), "Faield: Mobile number field is not found");
		    Log.endTestCase("Test Case End");
		    Thread.sleep(3000);
		    
		   
		    enterName(name);
		    Assert.assertTrue(LoginPage.enter_name.isDisplayed(), "Faield: Name field is not found");
		    Log.info("Enter Name: "+name);
		    
		    clkPersonalAccountbtn();
		    Thread.sleep(3000);
		    Log.info("Account has been created");
		    
		    common.TakeScreenshots("UserDashboard");
		    
		    clkhomebtn();
		    common.TakeScreenshots("HomePage");
		    Thread.sleep(3000);
		    Log.endTestCase("Test Case End");
	  }
	  
   }
	  
	 