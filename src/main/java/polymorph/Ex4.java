package polymorph;

// NO "access control" aka "default access" or "package access"
// is visible anywhere in the *same package*
// Oddly "protected" is more visible / less protected
// it adds access from subclasses (even if they are in
// different packages
class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}
class Sub extends Base {
//  @Override
  // inherited void doBaseStuff() ...
  void doBaseStuff(int x) { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}
/*
Q5)
A) doOtherStuff in Sub can be marked private without causing errors
B) doOtherStuff in Sub can be marked public without causing errors
C) doBaseStuff in Sub can be modified to return int without causing errors
D) doBaseStuff in Sub can be modified to take an int and return an int without causing errors
E) doBaseStuff in Sub can be modified to take an int and be private without causing errors

Where a base method returns an object type, an overriding method
must return something "assignment compatible"
 */

/*
Q4?
  In the Base and Sub classes, which are true in isolation?
    A) doBaseStuff in Base can be marked public without causing errors
    B) doBaseStuff in Base can be marked private without causing errors
    C) doBaseStuff in Sub can be marked public without causing errors
    D) doBaseStuff in Sub can be marked protected without causing errors
    E) doBaseStuff in Sub can be marked private without causing errors
*/


public class Ex4 {
}
