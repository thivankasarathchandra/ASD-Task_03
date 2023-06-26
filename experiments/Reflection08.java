import java.lang.reflect.*;

public class Reflection08 {
  public static void main(String[] args) throws Exception {
    Primary obj = new Primary();
    Field[] fields = obj.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);

    for (Field f : fields) {
      f.setAccessible(true);
      double x = f.getDouble(obj);
      x++;
      f.setDouble(obj, x);
      System.out.printf("field name=%s type=%s value=%f\n", f.getName(),
          f.getType(), f.getDouble(obj));
    }
  }
}
