package com.konakart.script;

import java.time.Month;

import org.testng.annotations.Test;

import com.konakart.constant.FileConstant;
import com.konakart.constant.FindLocator;
import com.konakart.dataprovider.DataProviderData;
import com.konakart.driver.DriverClass;
import com.konakart.helper.CommonUtility;
import com.konakart.pages.CommonMethods;
import com.konakart.pages.ValidationMethodForReview;

public class KonaKartScriptScenarioSecond extends DriverClass {
	FindLocator loc = new FindLocator();
@Test(priority = 3)	
public void konaKartClickImage()
{
	CommonUtility.clickElement(driver,loc.getlocator("clickonImage") );
	
	CommonUtility.scrollDownPage(driver,FileConstant.scrolling_resolution);
}
@Test(priority = 4,  dataProvider = "productContent", dataProviderClass = DataProviderData.class)
public void validateContentInsideTab(String productcontent, String specificationcontent)
{
	System.out.println(productcontent);
	System.out.println(specificationcontent);
	//CommonMethods.validateProductContent(loc, driver, productcontent);
	CommonUtility.clickElement(driver, loc.getlocator("clickonspecification"));
//	CommonMethods.validateSpecificationContent(loc, driver, specificationcontent);
    CommonUtility.clickElement(driver, loc.getlocator("clickoncustomerreview"));
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2,"Oldest first");
    ValidationMethodForReview.validateDate(1, loc, driver);
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2,"Oldest first");
    ValidationMethodForReview.validateDate(2, loc, driver);
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2,"Most recent first");
    ValidationMethodForReview.validateDate(1, loc, driver);
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2,"Most recent first");
    ValidationMethodForReview.validateDate(2, loc, driver);
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2, "Rating: high to low");
    ValidationMethodForReview.validateDate(1, loc, driver);
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2, "Rating: high to low");
    ValidationMethodForReview.validateDate(2, loc, driver);
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2, "Rating: low to high");
    ValidationMethodForReview.validateDate(1, loc, driver);
    CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 2, "Rating: low to high");
    ValidationMethodForReview.validateDate(2, loc, driver);
	   
    
  	
}

}
