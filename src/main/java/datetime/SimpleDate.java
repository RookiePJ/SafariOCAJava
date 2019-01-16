package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SimpleDate {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.now();

    System.out.println(ld);
    LocalDate later = ld.plusDays(3); // creates a NEW LocalDate, derived from the old one!
    System.out.println(ld);
    System.out.println(later);
    /*
    What is the result:
    A) 2019-01-16
    B) 2019-04-16
    C) 2019-01-19
    D) An exception
     */

//    LocalDate aLittleLater = ld.plus(24, ChronoUnit.HOURS);
//    System.out.println(aLittleLater);
    /*
    What is the result:
    A) 2019-01-17
    B) 2019-01-16
    C) An exception
     */

    DateTimeFormatter form =
        DateTimeFormatter.ofPattern("'The date is: 'dd-MMMM-yyyy");
    String theDate = form.format(ld);
    System.out.println(theDate);


//    String s = "Hello";
//    s = s.concat(" world");
//    System.out.println(s);

  }
}
