package com.tutorialspoint.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

    public static void main1(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2010-12-25");
        Date date2 = sdf.parse("2010-12-28");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));
int result=date1.compareTo(date2);
        if (result < 0 && date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (result > 0 &&  date1.after(date2)) {
            System.out.println("Date1 is After Date2");
        } 

    }

    
    
    
    public static void main(String[] args) {
		
    	
    	String s1="" ;
    	
    	
    	  System.out.println(s1.length());
    	
    	
    	
    	
	}
}