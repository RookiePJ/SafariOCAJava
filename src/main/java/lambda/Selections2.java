package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Criterion {
  boolean test(String s);
}

interface BadCriterion {
  boolean test(String s);
//  void x();
}

class LongStrings implements Criterion {
  private int threshold;
  public LongStrings(int threshold) {
    this.threshold = threshold;
  }
  @Override
  public boolean test(String s) {
    return s.length() > threshold;
  }
}
class EarlyStrings implements Criterion {
  @Override
  public boolean test(String t) {
    return t.charAt(0) < 'N';
  }
}
class FiveChars implements Criterion {
  @Override
  public boolean test(String u) {
    return u.length() == 5;
  }
}

public class Selections2 {
  public static List<String> findStrings(List<String> ls, Criterion crit) {
    List<String> res = new ArrayList<>();
    for (String s : ls) {
      if (crit.test(s)) {
        res.add(s);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> al = new ArrayList<>(
        Arrays.asList("Fred", "Jim", "Sheila", "Alice", "Bob", "Maverick")
    );
    System.out.println(findStrings(al, new LongStrings(4)));
    System.out.println(findStrings(al, new LongStrings(5)));
    System.out.println(findStrings(al, new EarlyStrings()));
    System.out.println(findStrings(al, new FiveChars()));
//    System.out.println(findStrings(al, /*new class BlahBlah implements Criterion {*/
//      /*public boolean test*/(String t)->
//      {
//        return t.charAt(0) < 'N';
//      }
//    /*}*/
//    ));
//
//    System.out.println(findStrings(al,
//        (String s) -> { return s.length() > 4; }
//        ));

    Criterion longNameCrit;
    longNameCrit = (String s) -> { return s.length() > 4; };
    System.out.println(findStrings(al, longNameCrit));

    System.out.println(findStrings(al, (t) -> { return t.charAt(0) > 'M';}));
    System.out.println(findStrings(al, t -> { return t.charAt(0) > 'M';}));
    System.out.println(findStrings(al, t -> /*{ return */t.charAt(0) > 'M'/*;}*/));
    System.out.println(findStrings(al, t -> t.charAt(0) > 'M' ));
    Criterion crit2 = t -> t.charAt(0) > 'M';
  }
}
