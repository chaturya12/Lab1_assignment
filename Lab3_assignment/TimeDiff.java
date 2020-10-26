/**
Author: chaturya
Date  : 26/10/2020
Desc  : to give difference of time with regards to current time
*/
import java.time.*;
public class TimeDiff {

	public static void main(String[] args) {
		LocalDate prev=LocalDate.of(1999,07,12);
		LocalDate current=LocalDate.now();
		//calculating diffrence
		Period diff=Period.between(prev, current);
		int years=diff.getYears();
		int months=diff.getMonths();
		int days=diff.getDays();
		//displaying the difference
		System.out.println("The difference of yrs is "+years);
		System.out.println("The difference of months is "+months);
		System.out.println("The difference of days is "+days);

	}

}
