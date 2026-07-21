package Date;

import java.util.Calendar;

public class Maintainance {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		for(int i=1; i<=12; i++) {
			 
			cal.add(Calendar.DATE, 10);
			
			// Date nextEvent = cal.getTime();
						
			System.out.println(cal.getTime());
		}
	}
}
