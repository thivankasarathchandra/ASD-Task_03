package further_experiments;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/******************************************************************************
 * This code gets and prints details of annotations of methods.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Reflection17 {
  public static void main(String[] args) {
    AnnotatedSimple s = new AnnotatedSimple();
    Class c = s.getClass();

    System.out.println("class = " + c);
    System.out.println("class name = " + c.getName());
    
    Method[] methods = c.getDeclaredMethods();

    for (Method m : methods) {
      for (Annotation a : m.getDeclaredAnnotations()) {
        System.out.printf("%s ", a);
      }
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
