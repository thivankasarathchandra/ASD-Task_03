package experiments;

import java.lang.reflect.Field;

/******************************************************************************
 * In this experiment a different method is used to retrieve the fields. This
 * time a reference to the b field is obtained, but when it is used, a runtime
 * exception is thrown that clearly states that members with private modifiers
 * cannot be accessed. Again data integrity stands firm.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Reflection05 {
  public static void main(String[] args) throws Exception {
    Simple s = new Simple();
    Field[] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);

    for (Field f : fields) {
      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
          f.getType(), f.getInt(s));
    }
  }
}
