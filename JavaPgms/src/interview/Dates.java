package interview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {
	public static void main(String[] args) {
		Date d=new Date();
		
		System.out.println(d.toString());
		SimpleDateFormat s= new SimpleDateFormat("d/MM/YYYY");
		System.out.println(s.format(d));
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
	}

}
