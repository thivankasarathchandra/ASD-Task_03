package further_experiments;

import java.lang.reflect.*;

/******************************************************************************
 * This code shows a quick way of printing method declarations. However, it does
 * not include annotations. 
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Reflection18 {
  public static void main(String[] args) {
    AnnotatedSimple s = new AnnotatedSimple();
    Class c = s.getClass();
   
    Method[] methods = c.getDeclaredMethods();

    for (Method m : methods) {
      System.out.println(m.toGenericString());
    }
  }
}
