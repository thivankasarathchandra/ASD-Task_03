package experiments;

/******************************************************************************
 * This experiment creates an instance of Simple and prints it out. It can be
 * observed that Simple's toString method is called implicitly. 
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Reflection01 {
  public static void main(String[] args) {
    Simple s = new Simple();
    System.out.println("s=" + s);
  }
}
