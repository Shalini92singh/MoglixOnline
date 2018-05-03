package online.repository.com;

import online.common.com.CommonMethods;
import online.testcases.com.LoginModule;

public interface Property {
	
	
	CommonMethods common= new CommonMethods();
	String webURL = "https://www.moglix.com/login"; //Scripts.selectEnviorment();
	//String webURL = "https://newplatform.moglix.com/login"; //Scripts.selectEnviorment();
	String chromeDriver = "webdriver.chrome.driver";
	String chromePath ="//home//moglix//Desktop//SeleniumDriver//chromedriver";	// lonch web driver
	String TestSheet ="//home//moglix//Desktop//SeleniumDriver//TestData1.xls"; //to connect excel sheet
	LoginModule login = new LoginModule();
}
