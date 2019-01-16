package datetime;

import java.time.LocalDate;
import java.time.Period;

public class TryAPeriod {
  public static void main(String[] args) {
    Period longTime = Period.of(1, 14, 465);
    Period normalized = longTime.normalized();
    System.out.println(longTime);
    System.out.println(normalized);

    /* what is the second line of output?
    A) P1Y14M465D
    B) P3Y5M20D // Assume math is right!!!
    C) P2Y2M465D
    D) Exception!!
     */

    LocalDate ld = LocalDate.of(2000, 1, 1);
    LocalDate later = ld.plus(longTime);

    LocalDate ld2 = LocalDate.of(2001, 1, 1);
    LocalDate later2 = ld2.plus(longTime);

    System.out.println("later is " + later);
    System.out.println("later2 is " + later2);
  }
}
