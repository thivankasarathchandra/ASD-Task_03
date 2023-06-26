public class Reflection02 {
  public static void main(String[] args) {
    Primary obj = new Primary();
    obj.doubleX(); 
    // obj.doubleY(); // private method
    double x = obj.x;
    // double y = obj.y; // private field
    System.out.println("Primary Object : " + obj);
  }
}