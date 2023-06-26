import java.lang.reflect.*;

public class Reflection09 {
  public static void main(String[] args) throws Exception {
    Primary obj = new Primary();
    Method[] methods = obj.getClass().getMethods();
    System.out.printf("There are %d methods\n", methods.length);

    for (Method m : methods) {
      System.out.printf("method name=%s type=%s parameters = ", m.getName(),
          m.getReturnType());
      Class<?>[] types = m.getParameterTypes();
      for (Class<?> c : types) {
        System.out.print(c.getName() + " ");
      }
      System.out.println();
    }
  }
}
