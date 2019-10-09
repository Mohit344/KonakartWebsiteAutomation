package com.konakart.pages;

import java.time.Month;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.konakart.constant.FindLocator;
import com.konakart.dataprovider.ValidatingData;
import com.konakart.helper.CommonUtility;
import com.konakart.helper.DateValidationMethod;
import com.konakart.validation.ValidationMethod;

public class CommonMethods {
	/**
	 * 
	 * @param expectedtitle
	 * @param driver
	 */

	ValidatingData data = new ValidatingData();
	public static void pageTitleValidation( WebDriver driver , FindLocator loc) {

		//	System.out.println("mmm");
		String productName1 = CommonUtility.getText(driver, loc.getlocator("heroImageProductName"));
		System.out.println(productName1);

		if (productName1.equalsIgnoreCase(ValidatingData.getValidatingData("image1"))) {
			String content = CommonUtility.getText(driver, loc.getlocator("productdescription"));
			System.out.println(content);
			System.out.println(ValidatingData.getValidatingData("product_description1"));
			Assert.assertTrue(content.contains(ValidatingData.getValidatingData("product_description1")),
					"Product description is wrong");
			CommonUtility.clickElement(driver, loc.getlocator("specificationtab"));
			String specificationcontent=CommonUtility.getText(driver,loc.getlocator("specificationcontent"));
			Assert.assertTrue(specificationcontent.contains(ValidatingData.getValidatingData("product_specification")),
					"Product description is wrong");

		}
		else {
			if (productName1.equalsIgnoreCase(ValidatingData.getValidatingData("image2"))) {
				String content = CommonUtility.getText(driver, loc.getlocator("productdescription"));
				Assert.assertTrue(content.contains(ValidatingData.getValidatingData("product_description2")),
						"Product description is wrong");

				CommonUtility.clickElement(driver, loc.getlocator("specificationtab"));
				String specificationcontent=CommonUtility.getText(driver,loc.getlocator("specificationcontent"));
				Assert.assertTrue(specificationcontent.contains(ValidatingData.getValidatingData("product_specification")),
						"Product description is wrong");

				System.out.println("Product description is right");
			}}
	}
	public static  void validateSpecificationContent(WebDriver driver,FindLocator loc) {
		String content =  CommonUtility.getText(driver, loc.getlocator("productSpecification"));
		Assert.assertTrue(content.contains(ValidatingData.getValidatingData("product_specification")),
				"Product specification is wrong");
		System.out.println("Product specification is right");
	}



	// the
	// title
	// of
	// each
	// pages


	/**
	 * method for validating productname
	 * @param loc
	 * @param driver
	 * @param productname
	 */
	public static void validateName(FindLocator loc, WebDriver driver, String productname) {
		String actual_name = CommonUtility.getText(driver, loc.getlocator("itemname").replace("xxxx", productname));
		System.out.println(actual_name);
		ValidationMethod.verify(actual_name, productname, "not matched");
	}

	/**
	 * method for validating productprice
	 * @param loc
	 * @param driver
	 * @param productprice
	 */

	public static void validatePrice(FindLocator loc, WebDriver driver, String productprice) {
		String actual_price = CommonUtility.getText(driver, loc.getlocator("itemprice").replace("xxxx", productprice));
		System.out.println(actual_price);
		ValidationMethod.verify(actual_price, productprice, "not matched");

	}

	/**
	 * method for validating errormessage
	 * @param loc
	 * @param driver
	 * @param message
	 */
	public static void validateMessage(FindLocator loc, WebDriver driver, String message) {
		String actual_message = CommonUtility.getText(driver, loc.getlocator("errormessage").replace("xxxx", message));
		System.out.println(actual_message);
		ValidationMethod.verify(actual_message, message, "message is not correct");
	}

	/**
	 * method for validating productdetails
	 * @param loc
	 * @param driver
	 * @param tabcontent
	 */

	public static void validateTabContent(FindLocator loc, WebDriver driver, String tab[]) {
		int index = 1;

		String actual_content = CommonUtility.getText(driver,
				loc.getlocator("productdetail").replace("xxxx", index + " "));
		System.out.println(actual_content);
		System.out.println(tab[1]);
		//	ValidationMethod.verifyContent(actual_content, tab[1], "not correct");
		ValidationMethod.verifyContent(actual_content,  tab[1], "not correct");
		index++;
	}


}
