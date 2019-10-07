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
	@Test(priority = 1,  dataProvider = "testdata", dataProviderClass = DataProviderData.class)

		public void  positiveScenario(String game,String inputbox) {
		System.out.println(game);
		System.out.println(inputbox); 
	CommonUtility.selectDropdown(driver, loc.getlocator("selectoption"),FileConstant.waittime, game);
		CommonUtility.clickAndSendText(driver, loc.getlocator("inputbox"), FileConstant.waittime, inputbox);
		CommonUtility.clickElement(driver, loc.getlocator("clickonsearch"));

		
			
	}
   @Test(priority = 2,  dataProvider = "testdatasecond", dataProviderClass = DataProviderData.class)
		   public  void negativeScenario(String game,String inputbox,String message)
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
