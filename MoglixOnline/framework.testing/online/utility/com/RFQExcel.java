package online.utility.com;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

import online.repository.com.Property;

public class RFQExcel implements Property{
	
	       
	
	@DataProvider(name = "RFQ")
	 public Object[][] placeorderd() throws Exception {
	 
	  DataDrivenExcel userData = new DataDrivenExcel(
	    TestSheet , "login");
	 
	  ArrayList<Object> dataList = new ArrayList<Object>();
	 
	  int i = 24;// excluding header row
 	  int totalRows = 24;
 	  while (i <= totalRows) {
 	   System.out.println("Bulk Order Query : line : " + i);
 	
 	   Object[] dataLine = new Object[3];
 	   dataLine[0] = userData.getCell(i, 0);
 	   dataLine[1] = userData.getCell(i, 1);
 	   dataLine[2] = userData.getCell(i, 2);
 	   //dataLine[3] = userData.getCell(i, 3);
 	  // dataLine[4] = userData.getCell(i, 4);
 	  // dataLine[5] = userData.getCell(i, 5);
	 
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
