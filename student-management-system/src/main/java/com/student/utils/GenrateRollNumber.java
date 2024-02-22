package com.student.utils;

import java.time.Year;

public class GenrateRollNumber {
	public static String getRollNumber()
	{
		Year year=Year.now();
		int min=100;
		int max=999;
		// Generate three digit random number
	    int randomthreedigitnumber=(int)Math.floor(Math.random()*(max-min+1)+min);
	    String rollnumber="CSE"+year+randomthreedigitnumber;
	    return rollnumber;	
	}
}
