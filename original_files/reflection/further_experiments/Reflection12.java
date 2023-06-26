package further_experiments;

import java.lang.reflect.*;

/******************************************************************************
 * This code finds the return types of all methods in the class and prints 
 * them.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Reflection12 {
  public static void main(String[] args) {
    AnnotatedSimple s = new AnnotatedSimple();
    Class c = s.getClass();

    Method[] methods = c.getDeclaredMethods();

    for (Method m : methods) {
      System.out.printf("%s %s", m.getReturnType(), m.getName());
      System.out.println();
    }
  }
}
