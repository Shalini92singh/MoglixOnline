package online.utility.com;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

import online.repository.com.Property;

public class ProductPurchaseExcel implements Property{
	
	       
	
	@DataProvider(name = "PlaceOrder")
	 public Object[][] placeorderd() throws Exception {
	 
	  DataDrivenExcel userData = new DataDrivenExcel(
	    TestSheet , "login");
	 
	  ArrayList<Object> dataList = new ArrayList<Object>();
	 
	  int i = 18;// excluding header row
	  int totalRows = 18;
	  while (i <= totalRows) {
	   System.out.println("Oderd Placed : line : " + i);
	 
	   Object[] dataLine = new Object[1];
	 
	   dataLine[0] = userData.getCell(i, 0);
	  // dataLine[1] = userData.getCell(i, 1);
	 //  dataLine[2] = userData.getCell(i, 2);
	 
	   dataList.add(dataLine);
	 
	   i++;
	   
	  }
	 
	  Object[][] data = new Object[dataList.size()][];
	  for (int j = 0; j < dataList.size(); j++)
	  {
	   data[j] = (Object[]) dataList.get(j);
	   }
	 
	  return data;
	 }
	
	@DataProvider(name = "Adress")
	 public Object[][] addAdress() throws Exception {
	 
	  DataDrivenExcel userData = new DataDrivenExcel(
	    TestSheet , "login");
	 
	  ArrayList<Object> dataList = new ArrayList<Object>();
	 
	  int i = 18;// excluding header row
	  int totalRows = 18;
	  while (i <= totalRows) {
	   System.out.println("Oderd Placed : line : " + i);
	 
	   Object[] dataLine = new Object[2];
	  
	   dataLine[0] = userData.getCell(i, 1);
	   dataLine[1] = userData.getCell(i, 2);
	//   dataLine[2] = userData.getCell(i, 2);
	 
	   dataList.add(dataLine);
	 
	   i++;
	   
	  }
	 
	  Object[][] data = new Object[dataList.size()][];
	  for (int j = 0; j < dataList.size(); j++)
	  {
	   data[j] = (Object[]) dataList.get(j);
	   }
	 
	  return data;
	 }
	
	@DataProvider(name = "BillingAdd")
	 public Object[][] billingAddress() throws Exception {
	 
	  DataDrivenExcel userData = new DataDrivenExcel(
	    TestSheet , "login");
	 
	  ArrayList<Object> dataList = new ArrayList<Object>();
	 
	  int i = 18;// excluding header row
	  int totalRows = 18;
	  while (i <= totalRows) {
	   System.out.println("Oderd Placed : line : " + i);
	 
	   Object[] dataLine = new Object[3];
	  
	   dataLine[0] = userData.getCell(i, 1);
	   dataLine[1] = userData.getCell(i, 2);
	   dataLine[2] = userData.getCell(i, 3);
	 
	   dataList.add(dataLine);
	 
	   i++;
	   
	  }
	 
	  Object[][] data = new Object[dataList.size()][];
	  for (int j = 0; j < dataList.size(); j++)
	  {
	   data[j] = (Object[]) dataList.get(j);
	   }
	 
	  return data;
	 }
	
	@DataProvider(name = "Loginbusinessuser")
    public Object[][] logininappwithbusinessuser() throws Exception {
    	 
    	  DataDrivenExcel userData = new DataDrivenExcel(
    	    TestSheet , "login");       
    	 
    	  ArrayList<Object> dataList = new ArrayList<Object>();
    	 
    	  int i = 21;// excluding header row
    	  int totalRows = 21;
    	  while (i <= totalRows) {
    	   System.out.println("loginWithExistingUSer : line : " + i);
    	 
    	   Object[] dataLine = new Object[2];
    	   dataLine[0] = userData.getCell(i, 0);
    	   dataLine[1] = userData.getCell(i, 1);
    	  // dataLine[2] = userData.getCell(i, 2);
    	 
    	   dataList.add(dataLine);
    	 
    	   i++;
    	   
    	  }
    	 
    	  Object[][] data = new Object[dataList.size()][];
    	  for (int j = 0; j < dataList.size(); j++)
    	  {
    	   data[j] = (Object[]) dataList.get(j);
    	   }
    	 
    	  return data;
    	 }



}
