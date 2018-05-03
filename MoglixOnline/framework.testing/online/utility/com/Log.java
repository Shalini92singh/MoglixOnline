package online.utility.com;


import org.apache.log4j.Logger;

public class Log {
	
	private static Logger Log = Logger.getLogger(Log.class.getName());//
	 
	 // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
	 
	 public static void startTestCase(String sTestCaseName){
	 
		Log.info("****************************************************************************************");
	 
		Log.info("****************************************************************************************");
	 
		Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
	 
		Log.info("****************************************************************************************");
	 
		Log.info("****************************************************************************************");
	 
		}
	 
		//This is to print log for the ending of the test case
	 
	 public static void endTestCase(String sTestCaseName){
	 
		Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
	 
		Log.info("X");
	 
		Log.info("X");
	 
		Log.info("X");
	 
		Log.info("X");
	 
		}
	 
	 
	 
		// Need to create these methods, so that they can be called  
	 
	 public static void trace(String message){
	 
	 Log.trace(message);
}
	 
	 public static void info(String message) {
	 
			Log.info(message);
	 
			}
	 
	 public static void warn(String message) {
	 
	    Log.warn(message);
	 
		}
	 
	 public static void error(String message) {
	 
	    Log.error(message);
	 
		}
	 
	 public static void fatal(String message) {
	 
	    Log.fatal(message);
	 
		}
	 
	 public static void debug(String message) {
	 
	    Log.debug(message);


}
}


//package org.apache.log4j;

//public abstract class Log {
//
//  // Creation & retrieval methods:
//  public abstract Logger getRootLogger();
//  public abstract Logger getLogger(String name);
//
//  // printing methods:
//  public abstract void trace(Object message);
//  public abstract void debug(Object message);
//  public abstract void info(Object message);
//  public abstract void warn(Object message);
//  public abstract void error(Object message);
//  public abstract void fatal(Object message);
//
//  // generic printing method:
//  public abstract void log(Level l, Object message);
//}
