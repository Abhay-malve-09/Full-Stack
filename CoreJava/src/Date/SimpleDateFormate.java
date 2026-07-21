package Date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SimpleDateFormate {

	public static void main(String[] args) throws ParseException{
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(d));
		
		System.out.println("------------------------------");
		
		String dob = "2005-06-05";
		
		System.out.println("String dob = " + dob);
		Date date = sdf.parse(dob);
		
		System.out.println(date);
	}
	
}
