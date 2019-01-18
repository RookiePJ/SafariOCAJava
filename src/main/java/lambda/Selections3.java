package lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Selections3 {
  public static <E> List<E> find(List<E> ls, Predicate<E> crit) {
    List<E> res = new ArrayList<>();
    for (E s : ls) {
      if (crit.test(s)) {
        res.add(s);
      }
    }
    return res;
  }

//  public static List<String> findStrings(List<String> ls, Predicate<String> crit) {
//    List<String> res = new ArrayList<>();
//    for (String s : ls) {
//      if (crit.test(s)) {
//        res.add(s);
//      }
//    }
//    return res;
//  }
//
  public static void main(String[] args) {
    List<String> al = new ArrayList<>(
        Arrays.asList("Fred", "Jim", "Sheila", "Alice", "Bob", "Maverick")
    );

    Predicate<String> longNameCrit;
    longNameCrit = (String s) -> { return s.length() > 4; };
    System.out.println(find(al, longNameCrit));

    System.out.println(find(al, (t) -> { return t.charAt(0) > 'M';}));
    Criterion crit2 = t -> t.charAt(0) > 'M';

    LocalDate today = LocalDate.now();

    List<LocalDate> lld = Arrays.asList(today, today.plusDays(2), today.minusDays(1));
    System.out.println(find(lld, d -> d.isAfter(today)));
  }
}
