package online.appmethods.com;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import online.common.com.Connectivity;
import online.pom.com.LoginPage;

public abstract class LoginMethods extends Connectivity {
	
	/************************************
	 * Methods for login/signup and personal Account
	 * @Author Shalini Singh
	 * Date:- 24 April 2018
	 *****************************************/
	
	public void enterEmailAdd(String emailAddress){
		LoginPage.enter_emailAddress.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		LoginPage.enter_password.sendKeys(password);
	}
	
	public void clkContinuebtn(){
		LoginPage.clk_continue_btn.click();
	}
	
	public void clkPersonalAccountbtn() {
		LoginPage.clk_personalAccount_btn.click();
	}
	
	public void clkBusinessAccountbtn() {
		LoginPage.clk_businessAccount_btn.click();
	}
	
	public void enterMobileNo(String mobileNo) {
		LoginPage.enter_mobileNumber.sendKeys(mobileNo);
	}
	
	public void enterName(String name) {
		LoginPage.enter_name.sendKeys(name);
	}
	
	
	/************************************
	 * Methods for Business Account
	 * @Author Shalini Singh
	 * Date:- 24 April 2018
	 */
	
	public void enterBusinessEntity(String companyName) {
		LoginPage.enter_businessEntityName.sendKeys(companyName);
	}
	
	public void enterRegisterAdd(String addressLine) {
		LoginPage.enter_registeredAddress.sendKeys(addressLine);
	}
	
	public void enterPinNo(String pin) {
		LoginPage.enter_PINNumber.sendKeys(pin);
	}
	
	public void enterCityName(String city) {
		LoginPage.enter_cityName.sendKeys(city);
	}
	
	public void selIndustry(int i) {
		new Select(LoginPage.sel_industry_drpdwn).selectByIndex(i);
	}
	
	public void selState(String state) {
		new Select(LoginPage.sel_state_drpdwn).selectByVisibleText(state);
	}
	
	public void selBusinessType(int i) {
		new Select(LoginPage.sel_businessType_drpdwn).selectByIndex(i);
	}
	
	public void enterPanNo(String panNo) {
		LoginPage.enter_panNumber.sendKeys(panNo);
	}
	
	public void enterGST(String gst) {
		LoginPage.enter_gst.sendKeys(gst);
	}
	
	public void clkbusinessAccbtn() {
		LoginPage.clk_businessAccount_btn.click();
	}
	
	public void clkhomebtn() {
		LoginPage.clk_moglixHome_icon.click();
	}
	
	public void clkCreateBussinessAc() {
		LoginPage.clk_CreatebusinessAccount_btn.click();
	}
	
	public static void clkOnUserprofile() throws InterruptedException {
		
		Actions action = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("html/body/app/main/pages/ba-page-top/div[1]/header/div[2]/div[4]/ul/li[3]/a/span[2]"));
		action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath("html/body/app/main/pages/ba-page-top/div[1]/header/div[2]/div[4]/ul/li[3]/div/ul/li[4]/span[2]"))).click().build().perform();
		// LoginPage.clk_UserProfile_icon.click();
	}
	
	public void clkOnLogOut() throws InterruptedException {
		LoginPage.clk_Logout_icon.click();
		Thread.sleep(3000);

	}
	
	public void clkOnLogin() {
		LoginPage.clk_Login_icon.click();
	}
	
	

	
	


}
