package experiments;

import java.lang.reflect.*;

/******************************************************************************
 * The illusive private method setA is called in this example. This demonstrates
 * that all the rules of encapsulation that you learned in your introduction to
 * object oriented programming can be broken. Why would we want to do this?
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Reflection10 {
  public static void main(String[] args) throws Exception {
    Simple s = new Simple();
    Method m = s.getClass().getDeclaredMethod("setA", int.class);
    m.setAccessible(true);
    m.invoke(s, 76);
    System.out.println(s);
  }
}
