public class Reflection03 {
  public static void main(String[] args) {
    Primary obj = new Primary();
    System.out.println("class = " + obj.getClass());
    System.out.println("class name = " + obj.getClass().getName());
  }
}
