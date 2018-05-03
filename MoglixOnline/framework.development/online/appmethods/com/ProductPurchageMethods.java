package online.appmethods.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import online.pom.com.ProductPurchasePage;


public abstract class ProductPurchageMethods extends LoginMethods{
	
	 
	public void clkOnProducttitle(String productName) {
		String firstPath= "//h4[contains(text(),'";
	      String endPath= "')]"; 
	      String  fullpath = firstPath +productName+ endPath;
	      WebElement productTitle = driver.findElement(By.xpath(fullpath)); 
	      productTitle.click();
	}
	
	public void clkOnAddtoCartbtn() {
		ProductPurchasePage.clk_AddToCart_btn.click();
	}
	
	public void clkOnCartIcon() {
		ProductPurchasePage.clk_CartIcon.click();
	}
	
	public void clkOnPlaceOrderbtn() {
		ProductPurchasePage.clk_PlaceOrder_btn.click();
	}
	
	public void clkOnAddAddresstxt() {
		ProductPurchasePage.clk_addShippingAdd.click();
	}
	
	public void clkOnSavebutn() {
		ProductPurchasePage.clk_AddressSave_btn.click();
	}
	
	public void clk_proceedtoPay() {
		ProductPurchasePage.clk_proceedtoPay_btn.click();
		
	}
	
	public void clkOnCashOnDliverytab() throws InterruptedException {
		
		WebElement ele = driver.findElement(By.xpath("//ul[@class='ullist']//li[.='Cash On Delivery']"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", ele);
	      ele.click();
	      Thread.sleep(3000);

		
	}
	
	public void clkCreditDebitCard() {
		ProductPurchasePage.clk_ceditDebitCardTab.click();
	}
	
	public void clkOnAddBillingAdd() {
		ProductPurchasePage.clk_addBillingAdd.click();
	}
	
	public void enterGSTIN(String gstin) {
		ProductPurchasePage.enter_GSTIN_txt.sendKeys(gstin);
	}
	
	public void clkOnproductnametext() {
		ProductPurchasePage.clk_productName_txt.click();
	}
	
	public void clkonApplybtn() {
		ProductPurchasePage.clk_onApply_btn.click();
	}


}
