package com.konakart.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.konakart.constant.FileConstant;
import com.konakart.constant.FindLocator;
import com.konakart.dataprovider.DataProviderData;
import com.konakart.dataprovider.ValidatingData;
import com.konakart.driver.DriverClass;
import com.konakart.extentReports.ExtentReport;
import com.konakart.helper.CommonUtility;
import com.konakart.pages.CommonMethods;
import com.konakart.pages.ValidationMethodForReview;

public class KonaKartScriptScenarioSecond extends DriverClass {
	FindLocator loc = new FindLocator();
	ValidatingData data = new ValidatingData();
	@Test(priority = 3)	
	// this method is to click  on Image
	public void konaKartClickImage()
	{ Logger log = Logger.getLogger(KonaKartScriptScenarioSecond.class);
		CommonUtility.clickElement(driver,loc.getlocator("clickonImage") );
       log.info("click on the heroimage");
		ExtentReport.reportLog("konaKartClickImage", "this konaKartClickImage method failed ");

		CommonUtility.scrollDownPage(driver,FileConstant.scrolling_resolution);



	}
	
	@Test(priority = 4)
	public void validateContentInsideTab()
	{
		
		Logger log = Logger.getLogger(KonaKartScriptScenarioSecond.class);
		CommonMethods.pageTitleValidation(driver, loc);
		log.info("validated the product description and specification");
		ExtentReport.reportLog("validateContentInsideTab", "this validateContentInsideTab method failed ");

		CommonUtility.clickElement(driver, loc.getlocator("reviewtab"));

	}

	// this method is for validating the Reviewing of product

	@Test(priority = 5,  dataProvider = "productReview", dataProviderClass = DataProviderData.class)
	public void validateProductReview(String sortby) {
		Logger log = Logger.getLogger(KonaKartScriptScenarioSecond.class);
		log.info("validate the rating and date in sorted order");
		CommonUtility.selectDropdown(driver, loc.getlocator("selectsortby"), 3, sortby );
		ExtentReport.reportLog("validateProductReview", "this validateProductReview method failed ");

		// CommonUtility.wait(1000);
		ValidationMethodForReview.validateDate(1, loc, driver);
		log.info("validated the date in sorted order");
		ValidationMethodForReview.validateRating(3, loc, driver);
		log.info("validated the rating  in sorted order");

	}

}
