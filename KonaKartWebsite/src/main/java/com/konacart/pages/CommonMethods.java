package com.konacart.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.konacart.constant.FindLocator;
import com.konacart.validation.ValidationMethod;
import com.konakart.helper.CommonUtility;

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
}
