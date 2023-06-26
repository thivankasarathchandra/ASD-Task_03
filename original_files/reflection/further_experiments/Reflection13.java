package further_experiments;

import java.lang.reflect.*;

/******************************************************************************
 * This code prints all method names as well as parameter names and types. Note
 * that the original identifier names are lost.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Reflection13 {
  public static void main(String[] args) {
    AnnotatedSimple s = new AnnotatedSimple();
    Class c = s.getClass();
    
    Method[] methods = c.getDeclaredMethods();

    for (Method m : methods) {
      System.out.printf("%s %s(", m.getReturnType(), m.getName());
      int count = 0;
      for (Parameter p : m.getParameters()) {
        if (count != 0) {
          System.out.print(", ");
        }
        System.out.printf("%s %s", p.getType(), p.getName());
        count++;
      }
      System.out.println(")");
    }
  }
}
