package com.konacart.script;

import org.testng.annotations.Test;

import com.konacart.constant.FindLocator;
import com.konacart.dataprovider.DataProviderData;
import com.konacart.driver.DriverClass;
import com.konacart.pages.CommonMethods;
import com.konakart.helper.CommonUtility;

public class KonaCartScriptScenarioSecond extends DriverClass {
	FindLocator loc = new FindLocator();
@Test(priority = 3)	
public void konaCartClickImage()
{
	CommonUtility.clickElement(driver,loc.getlocator("clickonImage") );
	CommonUtility.scrollToElement(driver, loc.getlocator("clickonspecification"));
	
}
@Test(priority = 4,  dataProvider = "testdatathird", dataProviderClass = DataProviderData.class)
public void validateContentInsideTab(String productcontent, String specificationcontent)
{
	System.out.println(productcontent);
	System.out.println(specificationcontent);
	CommonMethods.validateProductContent(loc, driver, productcontent);
	CommonUtility.clickElement(driver, loc.getlocator("clickonspecification"));
	CommonMethods.validateSpecificationContent(loc, driver, specificationcontent);
    CommonUtility.clickElement(driver, loc.getlocator("clickoncustomerreview"));
    
    
  	
}

}
