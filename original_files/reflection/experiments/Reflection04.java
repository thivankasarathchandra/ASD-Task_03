package experiments;

import java.lang.reflect.Field;

/******************************************************************************
 * In this experiment a reference to a Simple object is obtained then used to
 * retrieve a collection of Fields that belong to its class. A field is another
 * name for instance variable.
 * 
 * When this code is run it prints details of a single field, an integer called
 * a with value 10. The private access modifier has stopped details of the b
 * field from being revealed. This shows data hiding is working an Java is good
 * at maintaining data integrity. 
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Reflection04 {
  public static void main(String[] args) throws Exception {
    Simple s = new Simple();
    Field[] fields = s.getClass().getFields();
    System.out.printf("There are %d fields\n", fields.length);
    for (Field f : fields) {
      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
          f.getType(), f.getInt(s));
    }
  }
}
