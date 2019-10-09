package com.konakart.script;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.konakart.constant.FileConstant;
import com.konakart.constant.FindLocator;
import com.konakart.dataprovider.DataProviderData;
import com.konakart.driver.DriverClass;
import com.konakart.helper.CommonUtility;
import com.konakart.pages.CommonMethods;

public class KonaKartScriptScenarioFirst  extends DriverClass{

	FindLocator loc = new FindLocator();
	@Test(priority = 1,  dataProvider = "positiveScenario", dataProviderClass = DataProviderData.class)
	/**
	 * 
	 * @param producttype
	 * @param productname
	 * @param productprice
	 */
	
//	LogReport.getlogger();
	//logger = extent.startTest("HomepageRedirection");
	public void  positiveScenario(String producttype,String productname,String productprice ) {
		System.out.println(producttype);
		System.out.println(productname); 
		Logger log = Logger.getLogger(KonaKartScriptScenarioFirst.class);
		log.info("select the option");
		CommonUtility.selectDropdown(driver, loc.getlocator("selectoption"),FileConstant.waittime, producttype);
		CommonUtility.clickAndSendText(driver, loc.getlocator("inputbox"), FileConstant.waittime, productname);
		CommonUtility.clickElement(driver, loc.getlocator("clickonsearch"));
		CommonMethods.validateName(loc, driver, productname);
		
		log.info("validated the name of product");
		CommonMethods.validatePrice(loc, driver, productprice);
        log.info("validated the price of product");


	}
	@Test(priority = 2,  dataProvider = "negativeScenario", dataProviderClass = DataProviderData.class)
	/**
	 * 
	 * @param producttype
	 * @param productname
	 * @param message
	 */
	public  void negativeScenario(String producttype,String productname,String message)
	{
		Logger log = Logger.getLogger(KonaKartScriptScenarioFirst.class);
		CommonUtility.wait(FileConstant.polling_time);
		System.out.println(producttype);
		System.out.println(productname);
		System.out.println(message);
		CommonUtility.selectDropdown(driver, loc.getlocator("selectoption"), FileConstant.waittime, producttype);
		CommonUtility.clickAndSendText(driver, loc.getlocator("inputbox"), FileConstant.waittime, productname);
		CommonUtility.clickElement(driver, loc.getlocator("clickonsearch"));
		CommonUtility.scrollToElement(driver, loc.getlocator("showmessage"));

		CommonMethods.validateMessage(loc, driver, message);
        log.info("validated the error message");
	}



}
