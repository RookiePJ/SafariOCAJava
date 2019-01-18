package equalities;

public class Ex1 {
  public static void main(String[] args) {
    String s1 = new String("Hello"); // new creates a NEW object
    String s2 = new String("Hello"); // Another NEW object
    System.out.println("s1 == s2? (should be false) " + (s1 == s2));

    Integer i1 = new Integer(1);
    Integer i2 = i1;
    System.out.println(i1 == i2);

    s1 = "Hello";
    s2 = "Hello";
    System.out.println("s1 == s2? " + (s1 == s2));
    /*
    A) true
    B) false
    C) something else
     */

    Integer int1 = 1; // if a) Autoboxing, b) -128 +127
    Integer int2 = 1;

    System.out.println("int1 == int2 "  + (int1 == int2));
  }
}
