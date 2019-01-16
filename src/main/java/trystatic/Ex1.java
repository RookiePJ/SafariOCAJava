package trystatic;

public class Ex1 {
  int instanceValue;
  static int staticValue;

  void showInstanceValue() {
    System.out.println(/*this.*/instanceValue);
  }

  static void showInstanceValue(Ex1 object) {
//    int instanceValue = 0;
    System.out.println(object.instanceValue);
  }

  public static void main(String[] args) {
    Ex1 ex1 = new Ex1();
    ex1.instanceValue = 1234;
    showInstanceValue(ex1);
    ex1.showInstanceValue();
  }
}
