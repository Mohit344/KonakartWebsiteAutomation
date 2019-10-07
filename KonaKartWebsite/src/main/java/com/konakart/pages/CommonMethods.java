package com.konakart.pages;

import java.time.Month;

import org.openqa.selenium.WebDriver;

import com.konakart.constant.FindLocator;
import com.konakart.helper.CommonUtility;
import com.konakart.helper.DateValidationMethod;
import com.konakart.validation.ValidationMethod;

public class CommonMethods {
	/**
	 * 
	 * @param expectedtitle
	 * @param driver
	 */
		 public static void pageTitleValidation(String expectedtitle,WebDriver driver) {
			 String actualtitle=driver.getTitle();// get title of page.
			 System.out.println(actualtitle);
			
		ValidationMethod.verify(actualtitle, expectedtitle, "Redirection of page is not landed successfully");// validate the title of each pages
			 }
		 
		 public static void validateName( FindLocator loc,WebDriver driver,String productname)
		 {
			 String actual_name=CommonUtility.getText(driver,loc.getlocator("itemname").replace("xxxx", productname));
			 System.out.println(actual_name);
			 ValidationMethod.verify(actual_name, productname, "not matched");
		 }
		 
		 
		 
		 public static void validatePrice( FindLocator loc,WebDriver driver,String productprice)
		 {
			 String actual_price=CommonUtility.getText(driver, loc.getlocator("itemprice").replace("xxxx", productprice));
			 System.out.println(actual_price);
			 ValidationMethod.verify(actual_price, productprice, "not matched");
			 
		 }
		 
		 public static  void validateMessage(FindLocator loc,WebDriver driver,String message )
		 {
			 String actual_message= CommonUtility.getText(driver, loc.getlocator("errormesaage").replace("xxxx",message ));
			 System.out.println(actual_message);
			  ValidationMethod.verify(actual_message, message, "message is not correct");
			   
			  
		 }
		 
	
		
   
       
       
}
