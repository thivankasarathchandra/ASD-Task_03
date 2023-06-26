package further_experiments;

import java.lang.reflect.*;

/******************************************************************************
 * This code introduces how to get the modifier (e.g. public, private) of a 
 * method as a String. 
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Reflection15 {
  public static void main(String[] args) {
    AnnotatedSimple s = new AnnotatedSimple();
    Class c = s.getClass();
    
    Method[] methods = c.getDeclaredMethods();

    for (Method m : methods) {
      System.out.printf("%s ", Modifier.toString(m.getModifiers()));
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
