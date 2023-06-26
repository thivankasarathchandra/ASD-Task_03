import java.lang.reflect.*;

public class Reflection06 {
  public static void main(String[] args) throws Exception {
    Primary obj = new Primary();
    Field[] fields = obj.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);

    for (Field f : fields) {
      System.out.printf("field name=%s type=%s accessible=%s\n", f.getName(),
          f.getType(), f.isAccessible());
    }
  }
}
