package online.appmethods.com;

import static org.testng.Assert.assertEquals;

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
	
	public void clkOnAddAddresstxt() throws InterruptedException {
		// System.out.println("Print web element");
	   ProductPurchasePage.clk_addShippingAdd.click();
	  
	/*
		WebElement ele = driver.findElement(By.xpath("//label[contains(@class,'pull-right blue-label text-500 height-auto text-center-xs')]"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;	
	      executor.executeScript("arguments[0].click();", ele);
	      ele.click(); 
	      Thread.sleep(3000);*/
		
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
	      ele.getText(); 
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
	
	public void gettextOutofStock() {
	
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Product out of stock')]"));
	    //  JavascriptExecutor executor = (JavascriptExecutor)driver;
	     // executor.executeScript("arguments[0].click();", ele);
	      String value = ele.getText();
	      System.out.println(value);
	}
	
	public void clkOnViewAllCategory() throws InterruptedException{
	
		/* Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[contains(@class,'icon_font icon-electricals')]"));
		action.doubleClick(ele);
		action.perform();
		Thread.sleep(3000);*/
		
		Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("View All Categories >>"))).doubleClick().build().perform();
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
		
		

	}
	
	public void clkonFirstProduct() {
		ProductPurchasePage.clkon_FirstProduct.click();
	
	}
	
	
	public void clkonSubCategoryPro() throws InterruptedException {
		
		WebElement ele = driver.findElement(By.xpath("//product-list[contains(@class,'block mar-t-10')]/div/div[1]"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", ele);
	      ele.click();
	      Thread.sleep(3000);
	//	ProductPurchasePage.clkOn_subCategoryProduct.click();
	}
	
	public void clkOnMorebtn() {
		ProductPurchasePage.clk_showMore_btn.click();
	}

	public void clkOnElectronicCategory() {
		ProductPurchasePage.clk_electronic_cat.click();
	}
   
	public void clkOnRequestQuoteBtn() {
		ProductPurchasePage.clkOn_RequestQuoteNow_btn.click();
	}
}
