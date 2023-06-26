package experiments;

import java.lang.reflect.*;

/******************************************************************************
 * Not only can the value of a private field be accessed, but this experiment
 * shows that it can be altered!!
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Reflection08 {
  public static void main(String[] args) throws Exception {
    Simple s = new Simple();
    Field[] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    for (Field f : fields) {
      f.setAccessible(true);
      int x = f.getInt(s);
      x++;
      f.setInt(s, x);
      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
          f.getType(), f.getInt(s));
    }
  }
}
