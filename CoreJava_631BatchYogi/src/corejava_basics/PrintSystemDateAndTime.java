package corejava_basics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintSystemDateAndTime {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		System.out.println("===============");
		
		//MMMddyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
		System.out.println(df.format(d));
		
	}

		
	}


