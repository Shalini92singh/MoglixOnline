package online.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPurchasePage extends LoginPage {
	
	
	public ProductPurchasePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//best-seller//div[@class='owl-stage-outer']//*[@class=\"owl-item active\"][1]")
	public static WebElement clk_productName_txt;
	
	@FindBy(xpath="//button[contains(text(),'ADD TO ')]")
	public static WebElement clk_AddToCart_btn;
	
	@FindBy(xpath="//button[contains(text(),' BUY ')]")
	public static WebElement clk_ByNow_btn;
	
	
	@FindBy(xpath="html/body/app/main/pages/ba-page-top/div[1]/header/div[2]/div[4]/ul/li[1]/span[2]")
	public static WebElement clk_CartIcon;
	
	
	@FindBy(xpath="//button[contains(text(),'CONTINUE SHOPPING')]")
	public static WebElement clk_ConntinueShopping_btn;
	
	@FindBy(xpath="//button[contains(text(),'PLACE ORDER')]")
	public static WebElement clk_PlaceOrder_btn;
	
	//label[contains(text(),'Add Shipping Address')]
	
	@FindBy(xpath="//label[contains(text(),'Add Shipping Address')]")
	public static WebElement clk_addShippingAdd;
	
	@FindBy(xpath="//label[contains(text(),'+ Add Billing Address')]")
	public static WebElement clk_addBillingAdd;
	
	@FindBy(xpath= "//button[contains(text(),'SAVE')]")
	public static WebElement clk_AddressSave_btn;
	
	@FindBy(xpath= "//a[contains(text(),'CANCEL')]")
	public static WebElement clk_addressCancel_btn;
	
	@FindBy(xpath= "//button[contains(text(),'PROCEED TO PAYMENT')]")
	public static WebElement clk_proceedtoPay_btn;
	
	@FindBy(xpath= "//ul[contains(@class,'ullist')]//*[contains(text(),'Credit/Debit Card')]")
	public static WebElement clk_ceditDebitCardTab;
	
	//@FindBy(xpath= "//ul[contains(@class,'ullist')]//li[5]")
	@FindBy(xpath= "//ul[@class='ullist']//li[.='Cash On Delivery']")
	public static WebElement clk_CashOnDelivery_btn;
	
	
	@FindBy(xpath= "//input[starts-with(@formcontrolname,'gstin')]")
	public static WebElement enter_GSTIN_txt;
	
	@FindBy(xpath= "//button[contains(text(),'Apply')]")
	public static WebElement clk_onApply_btn;
	
	@FindBy(xpath="//div[contains(text(),'Product out of stock')]")
	public static WebElement gettext_outofStock;
	
	
	// Product order Category wise
	
	@FindBy(xpath="//i[contains(@class,'mar-r-5  icon-electricals')]")
	public static WebElement clk_electronic_cat;
	
	@FindBy(xpath="//button[contains(text(),'Show more')]")
	public static WebElement clk_showMore_btn;
	
	//@FindBy(xpath="//div[contains(@class,'col-xs-6 col-sm-6 col-md-4 col-lg-3')][1]")
	@FindBy(xpath="//div[contains(@id,'subcCategoryTop')]/div[1]")
	public static  WebElement clkon_FirstProduct;
	
	
	@FindBy(xpath="//product-list[contains(@class,'block mar-t-10')]/div/div[1]")
	public static WebElement clkOn_subCategoryProduct;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
