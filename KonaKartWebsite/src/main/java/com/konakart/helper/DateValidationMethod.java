package com.konakart.helper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.testng.Assert;

public class DateValidationMethod {
	
	


	
	public static void convertDate(List<String> expectedDate, String options) throws ParseException {
	ArrayList<Date> expectedDateList=new ArrayList();

	for (String dateText : expectedDate) {
	String arr[] = dateText.split(" ");
	String month = null;
	switch (arr[2])
	{
	case "January":
	month = "01";
	break;

	case "February":
	month = "02";
	break;

	case "March":
	month = "03";
	break;

	case "April":
	month = "04";
	break;

	case "May":
	month = "05";
	break;

	case "June":
	month = "06";
	break;

	case "July":
	month = "07";
	break;

	case "August":
	month = "08";
	break;

	case "September":
	month = "09";
	break;

	case "October":
	month = "10";
	break;

	case "November":
	month = "11";
	break;

	case "December":
	month = "12";
	break;

	}
	String day = arr[1];
	String year = arr[3];
	String dateString = year + "-" + month + "-" + day;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = sdf.parse(dateString);
	//Extent.messagePrint(sdf.format(date));
	expectedDateList.add(date);
	}
	if(options.equals("recent"))
	    checkDescendingOrder(expectedDateList);
	else if (options.equals("oldest"))
	checkAscendingOrder(expectedDateList);

	}
	public static void checkDescendingOrder(ArrayList<Date> expectedDateList)
	{
	for(int index=0;index < expectedDateList.size()-1;index++)
	{
	Assert.assertTrue(expectedDateList.get(index).compareTo(expectedDateList.get(index+1))>0);
	}
	//Extent.messagePrint("The date are in most recent order");
	}
	public static void checkAscendingOrder(ArrayList<Date> expectedDateList)
	{
	for(int index=0;index < expectedDateList.size()-1;index++)
	{
	Assert.assertTrue(expectedDateList.get(index).compareTo(expectedDateList.get(index+1))<0);
	}
	//Extent.messagePrint("The date are in most recent order");
	}

	}


