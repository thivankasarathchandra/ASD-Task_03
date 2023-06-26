import java.lang.reflect.*;


public class Reflection05 {
  public static void main(String[] args) throws Exception {
    Primary obj = new Primary();
    Field[] fields = obj.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);

    for (Field f : fields) {
      f.setAccessible(true); // Allows us to access private fields
      System.out.printf("field name=%s type=%s value=%f\n", f.getName(),
          f.getType(), f.getDouble(obj));
    }
  }
}
