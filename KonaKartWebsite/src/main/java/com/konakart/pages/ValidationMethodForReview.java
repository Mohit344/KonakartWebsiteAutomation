package com.konakart.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.konakart.constant.FindLocator;
import com.konakart.helper.CommonUtility;

public class ValidationMethodForReview {
	
	//public static void validateRating(int sortOrder,FindLocator loc,WebDriver driver) {
//		
//		
//	 int index=1;
//	 List<WebElement> elements= CommonUtility.getElementsList(driver,loc.getlocator("reviewbox"));	
//		int loopCount = elements.size();
//	while (index < loopCount) {
//	int count_star1=CommonUtility.getElementsList(driver, loc.getlocator("rating").replace("xxxx",index + "")).size();
//	int count_star2=CommonUtility.getElementsList(driver, loc.getlocator("rating").replace("xxxx", index + "")).size();		
//	int difference = count_star1 - count_star2;
//
//			if (sortOrder == 3) {
//			Assert.assertTrue(difference >= 0);
//			}
//			if (sortOrder == 4) {
//			Assert.assertTrue(difference <= 0);
//			}
//			}	
//		
//	}
//	
//	
//	
	
	
	
	
	/**
	 * 
	 * @param selectoption
	 * @param loc
	 * 
	 * @param driver
	 */
	
	public  static void validateDate(int selectoption , FindLocator loc,WebDriver driver) {
		
		 int index=1;
	  
         List <WebElement> elements = CommonUtility.getElementsList(driver,loc.getlocator("reviewbox"));
		int loopCount = elements.size();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);
		while (index < loopCount)
		{
		String string = CommonUtility.getText(driver, loc.getlocator("datelocator").replace("xxx", index + " "));
			
			String split[] = string.split(" ", 2);
		System.out.println("split 1" + split[1].substring(1, 2));
		if (split[1].substring(1, 2).equals(" ")) {
		split[1] = "0" + split[1];
		}
		LocalDate localDate = LocalDate.parse(split[1], formatter);

		String string1 = CommonUtility.getText(driver, loc.getlocator("datelocator").replace("xxx", index + ""));
		
		String split1[] = string1.split(" ", 2);
		System.out.println(split1[1]);
		System.out.println("split 1" + split1[1].substring(1, 2));
		if (split1[1].substring(1, 2).equals(" ")) {
		split1[1] = "0" + split1[1];
		}
		System.out.println(split1[1]);

		LocalDate localDate1 = LocalDate.parse(split1[1], formatter);
		int difference = localDate.compareTo(localDate1);
		if (selectoption == 1) {
		Assert.assertTrue(difference >= 0);
		}
		if (selectoption == 2) {
		Assert.assertTrue(difference <= 0);
		}
		index++;
		}

	
	}
}
