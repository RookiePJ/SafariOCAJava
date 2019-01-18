package exceptions;

import java.io.IOException;

class Base {
  void doBaseStuff() throws Exception {
    System.out.println("doBaseStuff");
  }
}

class Sub extends Base {
  void doBaseStuff() throws IOException {
    System.out.println("doSubStuff");
    throw new RuntimeException("");
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Base b = new Sub();
//    b.doBaseStuff();
  }
}
/*

A) Great!
B) Wait!!!
*/
