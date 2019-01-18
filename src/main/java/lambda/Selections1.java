package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Selections1 {
  public static List<String> findLongStrings(List<String> ls, int threshold) {
    List<String> res = new ArrayList<>();
    // ls.iterator();
    // ls.add("x");
    // ls.get(0);
    for (String s : ls) {
      if (s.length() > threshold) {
        res.add(s);
      }
    }
    return res;
  }
  public static List<String> findEarlyStrings(List<String> ls, char threshold) {
    List<String> res = new ArrayList<>();
    for (String s : ls) {
      if (s.charAt(0) < threshold) {
        res.add(s);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> al = new ArrayList<>(
        Arrays.asList("Fred", "Jim", "Sheila", "Alice", "Bob", "Maverick")
    );
    // print out long names
    System.out.println(findLongStrings(al, 4));
    System.out.println(findLongStrings(al, 3));
    System.out.println(findEarlyStrings(al, 'N'));
  }
}
