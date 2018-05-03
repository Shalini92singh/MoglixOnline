package online.pom.com;

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
		
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	public static WebElement clk_CartIcon;
	
	@FindBy(xpath="//button[contains(text(),'CONTINUE SHOPPING')]")
	public static WebElement clk_ConntinueShopping_btn;
	
	@FindBy(xpath="//button[contains(text(),'PLACE ORDER')]")
	public static WebElement clk_PlaceOrder_btn;
	
	//label[contains(text(),'Add Shipping Address')]
	
	@FindBy(xpath="//label[contains(text(),'+ Add Shipping Address')]")
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
