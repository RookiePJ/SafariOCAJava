package trystatic;

class X {
  static int MAX_VAL = 100;
  int value = 99;
  public void setVal(int x) {
    if (x <= MAX_VAL) value = x;
  }
}

public class Q1 {
  public static void main(String[] args) {
    X a = new X();
    X b = new X();
    a.setVal(120);
    System.out.print(a.value + ", ");
    b.MAX_VAL = 150; // EXACTLY EQUIVALENT to X.MAX_VAL!!!!
    a.setVal(140);
    System.out.println(a.value);
  }
}
