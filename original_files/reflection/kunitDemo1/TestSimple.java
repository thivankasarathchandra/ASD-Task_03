package kunitDemo1;
import static kunit1.KUnit.*;

/******************************************************************************
 * This code demonstrates the use of the KUnit testing tool. It produces a
 * report that contains messages generated from the check methods.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class TestSimple {

  void checkConstructorAndAccess(){
    Simple s = new Simple(3, 4);
    checkEquals(s.getA(), 4);
    checkEquals(s.getB(), 4);
    checkNotEquals(s.getB(), 4);    
    checkNotEquals(s.getB(), 5);    
  }

  void checkSquareA(){
    Simple s = new Simple(3, 4);
    s.squareA();
    checkEquals(s.getA(), 9);
  }

  public static void main(String[] args) {
    TestSimple ts = new TestSimple();
    ts.checkConstructorAndAccess();
    ts.checkSquareA();
    report();
  }
}
