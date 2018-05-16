package online.utility.com;

import java.io.IOException;
import java.util.ArrayList;
 
import org.testng.annotations.DataProvider;

import online.repository.com.Property;

 

public class LoginExcel implements Property{
	
	/***********************************************
	 * @author Shalini Singh
	 * Method Object : To validate sign up page
	 * @throws IOException 
	   
     *************************************************/
		 
		 @DataProvider(name = "signup")
		 public Object[][] Signup() throws Exception {
		 
		  DataDrivenExcel userData = new DataDrivenExcel(
		    TestSheet , "login");       
		 
		  ArrayList<Object> dataList = new ArrayList<Object>();
		 
		  int i = 5;// excluding header row
		  int totalRows = 5;
		  while (i <= totalRows) {
		   System.out.println("Signup for new user: line : " + i);
		 
		   Object[] dataLine = new Object[1];
		   dataLine[0] = userData.getCell(i, 0);
		
		 
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
		 
		 /***********************************************
			 * @author Shalini Singh
			 * Method Object : login With Online USer
			 * @throws IOException 
			   
		 *************************************************/
 
        @DataProvider(name = "Login")
        public Object[][] loginapp() throws Exception {
        	 
        	  DataDrivenExcel userData = new DataDrivenExcel(
        	    TestSheet , "login");       
        	 
        	  ArrayList<Object> dataList = new ArrayList<Object>();
        	 
        	  int i = 1;// excluding header row
        	  int totalRows = 1;
        	  while (i <= totalRows) {
        	   System.out.println("loginWithOnlineUser : line : " + i);
        	 
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
        
        /***********************************************
		 * @author Shalini Singh
		 * Method Object : CreateNewUSerWithPersonalAccount
		 * @throws IOException 
		   
	    *************************************************/
        	 
        	 @DataProvider(name = "PersonalAccount")
        	 public Object[][] CreatePersonalAccount() throws Exception {
        	 
        	  DataDrivenExcel userData = new DataDrivenExcel(
        	    TestSheet , "login");
        	 
        	  ArrayList<Object> dataList = new ArrayList<Object>();
        	 
        	  int i = 3;// excluding header row
        	  int totalRows = 3;
        	  while (i <= totalRows) {
        	   System.out.println("CreateNewUSerWithPersonalAccount : line : " + i);
        	 
        	   Object[] dataLine = new Object[3];
        	  // dataLine[0] = userData.getCell(i, 0);
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
        	 
        	 /***********************************************
        		 * @author Shalini Singh
        		 * Method Object : To validate sign up page for bussiness user
        		 * @throws IOException 
        		   
        	     *************************************************/
        			 
        			 @DataProvider(name = "signupforBusinessAcountuser")
        			 public Object[][] BusinessUserSignup() throws Exception {
        			 
        			  DataDrivenExcel userData = new DataDrivenExcel(
        			    TestSheet , "login");       
        			 
        			  ArrayList<Object> dataList = new ArrayList<Object>();
        			 
        			  int i = 14;// excluding header row
        			  int totalRows = 14;
        			  while (i <= totalRows) {
        			   System.out.println("Signup for new user: line : " + i);
        			 
        			   Object[] dataLine = new Object[1];
        			   dataLine[0] = userData.getCell(i, 0);
        			
        			 
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
        	 
        	 /***********************************************
     		 * @author Shalini Singh
     		 * Method Object : CreateNewUSerWithBusinessAccount
     		 * @throws IOException 
     		   
     	    *************************************************/
        	 
        	 @DataProvider(name = "BusinessAccount")
        	 public Object[][] CreateBusinessAccount() throws Exception {
        	 
        	  DataDrivenExcel userData = new DataDrivenExcel(
        	    TestSheet , "login");
        	 
        	  ArrayList<Object> dataList = new ArrayList<Object>();
        	 
        	  int i = 8;// excluding header row
        	  int totalRows = 8;
        	  while (i <= totalRows) {
        	   System.out.println("CreateNewUSerWithBusinessAccount : line : " + i);
        	 
        	   Object[] dataLine = new Object[6];   
        	  // dataLine[0] = userData.getCell(i, 0);
        	   dataLine[0] = userData.getCell(i, 4);
        	   dataLine[1] = userData.getCell(i, 5);
        	   dataLine[2] = userData.getCell(i, 6);
        	   dataLine[3] = userData.getCell(i, 7);
        	   dataLine[4] = userData.getCell(i, 8);
        	   dataLine[5] = userData.getCell(i, 9);
        	  
        	//   dataLine[9] = userData.getCell(i, 10);
        	   
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
        	 
        	// ==================================================================
        	 
        	 @DataProvider(name = "bussinessUSerSignup")
        	 public Object[][] SignupForBusinessUser() throws Exception {
        	 
        	  DataDrivenExcel userData = new DataDrivenExcel(
        	    TestSheet , "login");
        	 
        	  ArrayList<Object> dataList = new ArrayList<Object>();
        	 
        	  int i = 11;// excluding header row
        	  int totalRows = 11;
        	  while (i <= totalRows) {
        	   System.out.println("CreateNewUSerWithPersonalAccount : line : " + i);
        	 
        	   Object[] dataLine = new Object[3];
        	  // dataLine[0] = userData.getCell(i, 0);
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
        	   
        	
         /***********************************************
 			 * @author Shalini Singh
 			 * Method Object : loginWitheBusinesUSer
 			 * @throws IOException 
 			   
 		 *************************************************/
 
 
        	 @DataProvider(name = "BusinessUser")
             public Object[][] loginwithBusinessUser() throws Exception {
             	 
             	  DataDrivenExcel userData = new DataDrivenExcel(
             	    TestSheet , "login");       
             	 
             	  ArrayList<Object> dataList = new ArrayList<Object>();
             	 
             	  int i = 27;// excluding header row
             	  int totalRows = 27;
             	  while (i <= totalRows) {
             	   System.out.println("loginWithBusinessUser : line : " + i);
             	 
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
