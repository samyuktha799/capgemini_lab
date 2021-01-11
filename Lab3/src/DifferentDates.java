/*
 * Create a method to accept date and print the duration in days, months 
 * and years with regards to current system date.
 * 
 */

import java.time.LocalDate;
import java.time.Period;

public class DifferentDates {

	public static void main(String[] args)
    {
        LocalDate pastDate = LocalDate.of(1998,12, 07);
        LocalDate presentDate = LocalDate.now();
 
        Period diff = Period.between(pastDate, presentDate);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
  }

}
