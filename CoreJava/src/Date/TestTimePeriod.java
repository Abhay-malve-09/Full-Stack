package Date;

import java.time.LocalDate;

import java.time.Period;

public class TestTimePeriod {

	public static void main(String[] args) {
		
		LocalDate todayDate = LocalDate.now();
		
		System.out.println("Today's date is = " + todayDate);
		
		LocalDate birthDate = LocalDate.of(2005, 8, 02);
		System.out.println("Your BirthDate = " + birthDate);
		
		Period period = Period.between(birthDate, todayDate);
		
		System.out.println(period.getYears() + " Year " + period.getMonths() + " Month " + period.getDays() + " Day ");
	}
}
