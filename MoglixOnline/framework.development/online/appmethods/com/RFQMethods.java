package online.appmethods.com;

import org.openqa.selenium.support.ui.Select;

import online.pom.com.RFQPage;
import online.utility.com.Log;

public abstract class RFQMethods extends ProductPurchageMethods{
	
	
	
	public void clkOnBulkOrderQueryLink() {
		RFQPage.clkOn_BulkOrderQuery.click();
	}
	
	public void enterProCategory(String proCatgory) {
		RFQPage.enter_productDetails_txt.sendKeys(proCatgory);
	}
	
	public void enterProQty(String proQty) {
		RFQPage.enter_ProdQty_txt.sendKeys(proQty);
	}
	
	public void enterBrandName(String brandName) {
		RFQPage.enter_BrandName_txt.sendKeys(brandName);
	}
	
	public void selBusinessUserchkbox() {
		RFQPage.sel_businessUser_chkbox.click();
	}
	
	public void getFullName(){
		String fullname=  RFQPage.enter_FullName_txt.getAttribute("value");
		System.out.println("Full name is: " +fullname);
		Log.info("Get Full Name: " +fullname);
	}
	
	public void enterLastName(String lastName) {
		RFQPage.enter_LastName_txt.sendKeys(lastName);
	}
	
	public void getEmailAddress() {
		String email= RFQPage.enter_mailAddress_txt.getAttribute("value");
		System.out.println("Email Address is : " +email);
		Log.info("Get Email Address: " +email);
	}
	
	public void getMbileNo() {
		String mobileNo= RFQPage.enter_mobileNumber.getAttribute("value");
		System.out.println("Mobile Number is: " +mobileNo);
		Log.info("Get Mobile Number: " +mobileNo);
	}
	
	public void clkOnSubmitRFQ() {
		RFQPage.clkOn_SubmitRFQ_btn.click();
	}
	
	public void selIndustry(int i) {
		Select sel= new Select(RFQPage.sel_IndustryName_drpdwn);
		sel.selectByIndex(i);
	}
	
	public void enterPanNo(String panNo) {
		
		RFQPage.enter_PanNo_txt.sendKeys(panNo);
	}
	
	public void getCompanyName() {
		String companyName= RFQPage.txt_companyName.getAttribute("value");
		System.out.println("Company Name is: " +companyName);
		Log.info("Get Company Name: " +companyName);
	}
	
	public void clkOnQuoteBtn() {
		RFQPage.clkOn_GetQuote_btn.click();
	}
	
	

}
