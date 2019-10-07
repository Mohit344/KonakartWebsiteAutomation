package com.konakart.script;
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
		public void  positiveScenario(String producttype,String productname,String productprice ) {
		System.out.println(producttype);
		System.out.println(productname); 
	CommonUtility.selectDropdown(driver, loc.getlocator("selectoption"),FileConstant.waittime, producttype);
		CommonUtility.clickAndSendText(driver, loc.getlocator("inputbox"), FileConstant.waittime, productname);
		CommonUtility.clickElement(driver, loc.getlocator("clickonsearch"));
		CommonMethods.validateName(loc, driver, productname);
		CommonMethods.validatePrice(loc, driver, productprice);

		
			
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
	
	   CommonUtility.wait(FileConstant.polling_time);
	   System.out.println(producttype);
	   System.out.println(productname);
	   System.out.println(message);
	   CommonUtility.selectDropdown(driver, loc.getlocator("selectoption"), FileConstant.waittime, producttype);
	   CommonUtility.clickAndSendText(driver, loc.getlocator("inputbox"), FileConstant.waittime, productname);
	   CommonUtility.clickElement(driver, loc.getlocator("clickonsearch"));
	   CommonUtility.scrollToElement(driver, loc.getlocator("showmessage"));
	   
	   CommonMethods.validateMessage(loc, driver, message);
	   
		   }
		   


}
