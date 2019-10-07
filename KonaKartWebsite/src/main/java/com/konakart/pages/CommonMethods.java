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
		 
		 public static void validateName( FindLocator loc,WebDriver driver,String inputbox)
		 {
			 String actual_name=CommonUtility.getText(driver, loc.getlocator("nameofgame"));
			 System.out.println(actual_name);
			 ValidationMethod.verify(actual_name, inputbox, "not matched");
		 }
		 
		 public static void validatePrice( FindLocator loc,WebDriver driver,String inputbox,String price)
		 {
			 String actual_price=CommonUtility.getText(driver, loc.getlocator("price"));
			 System.out.println(actual_price);
			 ValidationMethod.verify(actual_price,price , "not matched");
			 
		 }
		 
		 public static  void validateMessage(FindLocator loc,WebDriver driver,String message )
		 {
			 String actual_message= CommonUtility.getText(driver, loc.getlocator("showmessage"));
			 System.out.println(actual_message);
			 ValidationMethod.verify(actual_message, message, "message is not correct");
			 
			 
		 }
		 
		public static void validateMouseName(FindLocator loc,WebDriver driver, String devicename)
		{
			String actual_mouse_name=CommonUtility.getText(driver,loc.getlocator("mousename"));
          ValidationMethod.verify(actual_mouse_name, devicename, "not correct");
			
		}
		public static void validateMousePrice(FindLocator loc,WebDriver driver, String deviceprice)
		{
			String actual_item_price = CommonUtility.getText(driver, loc.getlocator("mouseprice"));
			ValidationMethod.verify(actual_item_price, deviceprice, "it is not correct");
		}
		public static void validateDvdName(FindLocator loc,WebDriver driver, String dvdname)
		
		{
		String actual_dvd_name=CommonUtility.getText(driver, loc.getlocator("dvdname"));
		ValidationMethod.verify(actual_dvd_name, dvdname, "it is not correct");
			
		}
		public static void validateDvdPrice(FindLocator loc,WebDriver driver, String dvdprice)
		{
			String actual_dvd_price = CommonUtility.getText(driver, loc.getlocator("dvdprice"));
			ValidationMethod.verify(actual_dvd_price, dvdprice, "not correct");
		}
		
		
		
		 
		 
		 
		public static void  validateProductContent(FindLocator loc,WebDriver driver,String productcontent)
		 
		{
			String actual_product_content=CommonUtility.getText(driver,loc.getlocator("productdescriptioncontent"));
			System.out.println(actual_product_content);
			ValidationMethod.verify(actual_product_content, productcontent,"content does not match");	
		}
		public static void  validateSpecificationContent(FindLocator loc,WebDriver driver,String specificationcontent)
		{
			String actual_specification_content=CommonUtility.getText(driver,loc.getlocator("specificationcontent"));
			System.out.println(actual_specification_content);
			ValidationMethod.verify(actual_specification_content, specificationcontent, "content does not match");
	      
				
		}
       public static void validateDate(WebDriver driver) {
    	   
    	   
    	   String s = CommonUtility.getText(driver," (//span[contains(.,'Thursday 7 July 2016')])[1]");
    	   System.out.println(s);
    	   String s1=s.substring(10,20);
    	   System.out.println(s1);
    	   
    	   // Create a month instance 
           Month month = Month.DECEMBER; 
     
           // Get the value of month-of-year as int 
           System.out.println(month.getValue()); 
    	   
    	   
       }
		
   

}
