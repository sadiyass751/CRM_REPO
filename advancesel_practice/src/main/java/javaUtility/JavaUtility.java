package javaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	
	//generating random number
	public int getRandomNum() {
		Random random=new Random();
		int rInt = random.nextInt(5000);
		return rInt;
	}
	
	//generating date
	public String getRequiredDate(int days) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.format(date);
		Calendar cal=sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days);
		String dateRequired = sdf.format(cal.getTime());
		return dateRequired;
		
		/*
		 * //get date after 30 days
		Date date= new Date();   //current date
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); //date in particular format
		sdf.format(date); //got date but curent date should also be in same format so we are using this
		Calendar cal = sdf.getCalendar();// to get calendar to calculate date
		cal.add(Calendar.DAY_OF_MONTH, 30); //calculate date after 30 days(days of month)
		String requiredDate = sdf.format(cal.getTime());//format into our specifed format
		 * */
	}
	
	
	public String getCurrentDate() {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String currentdate = sdf.format(d);
		return currentdate;
	}
}
