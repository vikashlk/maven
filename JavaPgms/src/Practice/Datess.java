package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datess {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat formate= new SimpleDateFormat("dd/MM/yyyy");
		
String a = formate.format(d);
System.out.println(a);

	}

}
