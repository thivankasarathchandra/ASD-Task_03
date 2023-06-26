import java.lang.reflect.*;

public class Reflection04 {
  public static void main(String[] args) throws Exception {
    Primary obj = new Primary();
    Field[] fields = obj.getClass().getFields();
    System.out.printf("There are %d fields\n", fields.length);
    for (Field f : fields) {
      System.out.printf("field name=%s type=%s value=%f\n", f.getName(),
          f.getType(), f.getDouble(obj));
    }
  }
}
