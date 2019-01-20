package lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ListAndGeneric {
  public static void main(String[] args) {
    // Arrays have fixed size after creation
//    String [] sa = {"Fred", "Jim", "Sheila"}; // length is 3...
//    String [] sa = new String[10]; // sa[0] is first, sa[sa.length -1] is last
//    String [] sa2 = new String[20];
//    System.arraycopy(sa, 0, sa2, 0, sa.length);
//    sa = sa2; // appearance that sa "grew"
    // Arrays are kinda ugly

    // Instead we use object containers... Collection is an interface
    // List is an ordered, indexed, collection (like an array)
    // can grow...

    ArrayList<String> al = new ArrayList<>();
    System.out.println("list contains " + al.size() + " items");
    al.add("Fred");
    al.add("Sheila");
    System.out.println("list contains " + al.size() + " items");
    System.out.println(al);
    al.add(1, "Jim");
    System.out.println("list contains " + al.size() + " items");
    System.out.println(al);

    System.out.println("item 1 is " + al.get(1));

//    al.add(1, LocalDate.now());
    System.out.println("item 1 is " + al.get(1));
    String s = /*(String)*/al.get(1);

    for (String st : al) {
      System.out.println("> " + st);
    }
  }
}
