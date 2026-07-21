package Date;

import java.time.LocalDate;

public class TestLocalDate {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now(); 
		
		System.out.println("Today's : " + now);
		
		System.out.println("Day of week : " + now.getDayOfWeek());
		System.out.println("Day of month : " + now.getDayOfMonth());
		System.out.println("Month : " + now.getMonth());
		System.out.println("Day of year : " + now.getDayOfYear());
		System.out.println("Year : " + now.getYear());
		
		
		System.out.println("---------------------------");
		
		
		LocalDate dob = LocalDate.of(2005, 8, 02);
		
		System.out.println("dob : " + dob);
		
		System.out.println("dob of week: " + dob.getDayOfWeek());
		System.out.println("dob of month: " + dob.getDayOfMonth());
		System.out.println("dob month: " + dob.getMonth());
		System.out.println("dob of year: " + dob.getDayOfYear());
		System.out.println("dob year: " + dob.getYear());
		
		System.out.println("---------------------------");
		
		System.out.println("age: " + (now.getYear() - dob.getYear()));
	}
}
