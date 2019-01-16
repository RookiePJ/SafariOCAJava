package datetime;

import java.time.LocalDate;
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

    LocalDate aLittleLater = ld.plus(12, ChronoUnit.HOURS);
    System.out.println(aLittleLater);

//    String s = "Hello";
//    s = s.concat(" world");
//    System.out.println(s);

  }
}
