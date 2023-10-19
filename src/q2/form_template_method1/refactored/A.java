package q2.form_template_method1.refactored;

public class A {
	// Main entry point of the application.
   public static void main(String[] args) {
      System.out.println("After");
      System.out.println("m1:" + (new A().m1(0, 3)));
      System.out.println("m2:" + (new A().m2(0, 3)));
   }

   int m1(int min, int max) {
      return new M1().common(min, max);
   }

   int m2(int min, int max) {
      return new M2().common(min, max);
   }
}

// Abstract class that allows for summation of the output f(x) 
// where x is all integers from min to max, and f(x) is implemented as an override of apply()
abstract class Template {
   int common(int min, int max) {
      int sum = 0;
      for (int i = min; i <= max; i++) {
         sum += apply(i);
      }
      return sum;
   }

   abstract int apply(int i);
}

// Return the input integer to be added to the sum
class M1 extends Template {
   @Override
   int apply(int i) {
      return i;
   }
}

// Return the the square of input integer to be added to the sum
class M2 extends Template {
   @Override
   int apply(int i) {
      return i * i;
   }
}
