package experiments;

/******************************************************************************
 * This experiment demonstrates the use of access modifiers in Java. They are
 * Java's way of implementing data hiding and restricting which methods are
 * accessible outside the class.
 * 
 * If you were to remove the comments this code would try to access the private
 * members squareB and b. The compiler will complain about this.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Reflection02 {
  public static void main(String[] args) {
    Simple s = new Simple();
    s.squareA();
    // s.squareB(); // if you uncomment this you will get a compiler error
    int a = s.a;
    // int b = s.b; // if you uncomment this you will get a compiler error
    System.out.println("s=" + s);
  }
}
