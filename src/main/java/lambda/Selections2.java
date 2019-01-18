package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Criterion {
  boolean test(String s);
}

class LongStrings implements Criterion {
  @Override
  public boolean test(String s) {
    return s.length() > 4;
  }
}
class EarlyStrings implements Criterion {
  @Override
  public boolean test(String s) {
    return s.charAt(0) < 'N';
  }
}
class FiveChars implements Criterion {
  @Override
  public boolean test(String s) {
    return s.length() == 5;
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
    System.out.println(findStrings(al, new LongStrings()));
    System.out.println(findStrings(al, new EarlyStrings()));
    System.out.println(findStrings(al, new FiveChars()));
  }
}
