package online.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;	

public class LoginPage  {
		
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		}
		
	    
		@FindBy(xpath="//input[starts-with(@formcontrolname,'email')]")
		public static WebElement enter_emailAddress;

		@FindBy(xpath= "//input[starts-with(@formcontrolname,'password')]")
		public static WebElement enter_password;

		@FindBy(xpath= "//button[contains(text(),'CONTINUE')]")
		public static WebElement clk_continue_btn;
		
		@FindBy(xpath= "//button[contains(text(),'Personal Account')]")
	    public static WebElement clk_personalAccount_btn;
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'phone')]")
		public static WebElement enter_mobileNumber;
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'name')]")
		public static WebElement enter_name;
		
		//Business users
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'companyName')]")
		public static WebElement enter_businessEntityName;
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'addressLine')]")
		public static WebElement enter_registeredAddress;
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'postCode')]")
		public static WebElement enter_PINNumber;
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'city')]")
		public static WebElement enter_cityName;
		
		@FindBy(xpath= "//select[starts-with(@formcontrolname,'industry')]")
		public static WebElement sel_industry_drpdwn;
		
		@FindBy(xpath= "//select[starts-with(@formcontrolname,'idState')]")
		public static WebElement sel_state_drpdwn;
		
		@FindBy(xpath= "//select[starts-with(@formcontrolname,'businessType')]")
		public static WebElement sel_businessType_drpdwn; 
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'pan')]")
		public static WebElement enter_panNumber;
		
		@FindBy(xpath= "//input[starts-with(@formcontrolname,'gstin')]")
		public static WebElement enter_gst;
		
		@FindBy(xpath= "//button[contains(text(),'Business Account')]")
	    public static WebElement clk_businessAccount_btn;
		
		@FindBy(xpath= "//button[contains(text(),'Create Business Account')]")
	    public static WebElement clk_CreatebusinessAccount_btn;
		
		@FindBy(xpath= "//img[starts-with(@alt,'Shop for Assortment')]")
		public static WebElement clk_moglixHome_icon;        
		
		@FindBy(xpath="html/body/app/main/pages/ba-page-top/div[1]/header/div[2]/div[4]/ul/li[3]/a/span[2]")
		public static WebElement clk_UserProfile_icon;
		
		@FindBy(xpath="html/body/app/main/pages/ba-page-top/div[1]/header/div[2]/div[4]/ul/li[3]/div/ul/li[4]/span[2]")
		public static WebElement clk_Logout_icon;
		
		@FindBy(xpath="//span[contains(text(),'Login')]")
		public static WebElement clk_Login_icon;
		
		
		
		 
		
	       
		
			
		
		
		
		
		
		
		
		


}
