package lambda.equality;

import java.util.function.Predicate;

public class TryEquals {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));

    Integer i1 = new Integer(1);
    Integer i2 = new Integer(1);
    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));

    Predicate<String> ps = (s) -> s.length() % 2 == 0 ? false : true;

  }
}
