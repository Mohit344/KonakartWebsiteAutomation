package com.konacart.script;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.konacart.constant.FileConstant;
import com.konacart.constant.FindLocator;
import com.konacart.dataprovider.DataProviderData;
import com.konacart.driver.DriverClass;
import com.konacart.pages.CommonMethods;
import com.konakart.helper.CommonUtility;

public class KonaCartScriptScenarioFirst  extends DriverClass{
	FindLocator loc = new FindLocator();
	@Test(priority = 1,  dataProvider = "testdata", dataProviderClass = DataProviderData.class)
	public void  positiveScenerio(String game,String inputbox,String price)  {
		System.out.println(game);
		System.out.println(inputbox); 
	CommonUtility.selectDropdown(driver, loc.getlocator("selectoption"),FileConstant.waittime, game);
		CommonUtility.clickAndSendText(driver, loc.getlocator("inputbox"), FileConstant.waittime, inputbox);
		CommonUtility.clickElement(driver, loc.getlocator("clickonsearch"));
		CommonUtility.scrollToElement(driver, loc.getlocator("nameofgame"));
		CommonMethods.validateName(loc, driver, inputbox);
		CommonMethods.validatePrice(loc, driver, inputbox, price);
			
	}
   @Test(priority = 2,  dataProvider = "testdatasecond", dataProviderClass = DataProviderData.class)
		   public  void negativeScenerio(String game,String inputbox,String message)
		   {
	
	   CommonUtility.wait(FileConstant.polling_time);
	   System.out.println(game);
	   System.out.println(inputbox);
	   System.out.println(message);
	   CommonUtility.selectDropdown(driver, loc.getlocator("selectoption"), FileConstant.waittime, game);
	   CommonUtility.clickAndSendText(driver, loc.getlocator("inputbox"), FileConstant.waittime, inputbox);
	   CommonUtility.clickElement(driver, loc.getlocator("clickonsearch"));
	   CommonUtility.scrollToElement(driver, loc.getlocator("showmessage"));
	   
	   CommonMethods.validateMessage(loc, driver, message);
	   
		   }
		   


}
