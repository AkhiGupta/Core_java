package dateTimeApi;
import java.time.*;

public class dateTime {
	public static void main(String[] args)
	{
		LocalDate currD = LocalDate.now();
		System.out.println("current Date:- "+currD);
		
		LocalDate dateof= LocalDate.of(2022,06,7);
		System.out.println("Date:- "+dateof);
		
		//LocalDate date= LocalDate.parse("2022-6-8");
		//System.out.print("Date:- "+date);
		
		LocalDate currDate = LocalDate.now();
		LocalDate yest = currDate.minusDays(1);
		LocalDate tomorrow = currDate.plusDays(1);

		System.out.println("Current Date:- "+currDate);
		System.out.println("YesterDay:- "+yest);
		System.out.println("Tomorrow:-"+tomorrow);
		
		
		DayOfWeek dayOfWeek = currDate.getDayOfWeek();

		

		int dayOfMonth = currDate.getDayOfMonth();
		int dayOfYear = currDate.getDayOfYear();
		System.out.println("Date"+ currDate);
		System.out.println("Day of week:-" + dayOfWeek);
		System.out.println("Day of Month:-" + dayOfMonth);
		System.out.println("Day of week:-" + dayOfYear);
		
		
	}
}
