package online.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RFQPage extends LoginPage {
	
	
	public RFQPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(text(),'Bulk Order Query')]")
	public static WebElement clkOn_BulkOrderQuery;

	@FindBy(id="prod_detail")
	public static WebElement enter_productDetails_txt;
	
	@FindBy(id="prod_qty")
	public static WebElement enter_ProdQty_txt;
	
	@FindBy(xpath="//input[contains(@placeholder,'Brand*')]")
	public static WebElement enter_BrandName_txt;
	
	@FindBy(xpath="//span[contains(@class,'checkbox b-text')]")
	public static WebElement sel_businessUser_chkbox;
	
	@FindBy(xpath="//input[contains(@placeholder,'First Name*')]")
	public static WebElement enter_FullName_txt;
	
	@FindBy(xpath="//input[contains(@placeholder,'Last Name')]")
	public static WebElement enter_LastName_txt;
	
	@FindBy(xpath="//input[contains(@placeholder,'Email*')]")
	public static WebElement enter_mailAddress_txt;
	
	@FindBy(xpath="//button[contains(text(),'Submit RFQ')]")
	public static WebElement clkOn_SubmitRFQ_btn;
	
	@FindBy(xpath="//select[contains(@formcontrolname,'buyertype')]")
	public static WebElement sel_IndustryName_drpdwn;
	
	@FindBy(xpath="//input[contains(@formcontrolname,'panno')]")
	public static WebElement enter_PanNo_txt;
	
	@FindBy(xpath="//input[contains(@formcontrolname,'companyname')]")
	public static WebElement txt_companyName;
	
	
	
}
