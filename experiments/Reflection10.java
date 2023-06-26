import java.lang.reflect.*;

public class Reflection10 {
  public static void main(String[] args) throws Exception {
    Primary obj = new Primary();
    Method m = obj.getClass().getDeclaredMethod("setX", double.class);
    m.setAccessible(true);
    m.invoke(obj, 76.0);
    System.out.println(obj);
  }
}
