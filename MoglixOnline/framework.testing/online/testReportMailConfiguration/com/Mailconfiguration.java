package online.testReportMailConfiguration.com;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import javax.activation.*;
public class Mailconfiguration {
	



	
	public  Mailconfiguration() {

	      // Recipient's email ID needs to be mentioned.
	      String to = "shalini.singh@moglix.com";
	      // Sender's email ID needs to be mentioned
	      String from = "mahikaya92@gmail.com";
	      // Assuming you are sending email from localhost
	      String host = "localhost";
	      // Get system properties
	      Properties properties = System.getProperties();
	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	          // Create a default MimeMessage object.
	          MimeMessage message = new MimeMessage(session);
	          // Set From: header field of the header.
	          message.setFrom(new InternetAddress(from));
	          // Set To: header field of the header.
	          message.addRecipient(Message.RecipientType.TO,
	                                   new InternetAddress(to));

	          // Set Subject: header field
	          message.setSubject("Automation Testing Report");

	          // Create the message part 
	          BodyPart messageBodyPart = new MimeBodyPart();

	          // Fill the message
	          messageBodyPart.setText("Hi,"+(char) Character.LINE_SEPARATOR
	        		  +(char) Character.LINE_SEPARATOR  +"   This mail has been genrated from Selenium automaion testing tool" +(char) Character.LINE_SEPARATOR
	          	      + "   Please check the Automation testing report with  attachment file"+(char) Character.LINE_SEPARATOR
	          	    +(char) Character.LINE_SEPARATOR +"Thanks & Regards" +(char) Character.LINE_SEPARATOR
	        		  + "Shalini Singh");

	          // Create a multipar message
	          Multipart multipart = new MimeMultipart();

	          // Set text message part
	          multipart.addBodyPart(messageBodyPart);

	          // Part two is attachment
	          messageBodyPart = new MimeBodyPart();
	          String filename = "//home/moglix/MoglixSelenium/MoglixOnline/test-output/emailable-report.html";
	          DataSource source = new FileDataSource(filename);
	          messageBodyPart.setDataHandler(new DataHandler(source));
	          messageBodyPart.setFileName(filename);
	          multipart.addBodyPart(messageBodyPart);

	          // Send the complete message parts
	          message.setContent(multipart );

	          // Send message
	          Transport.send(message);
	          System.out.println("Report has be successfully send....");
	       }catch (MessagingException mex) {
	          mex.printStackTrace();
	       }
	    }
	 }