package experiments;

/******************************************************************************
 * This class is used to demonstrate various aspects of Java reflection. 
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Simple {

  public int a = 10;
  private int b = 20;

  public Simple() {
  }

  public Simple(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void squareA() {
    this.a *= this.a;
  }

  private void squareB() {
    this.b *= this.b;
  }

  public int getA() {
    return a;
  }

  private void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public String toString() {
    return String.format("(a:%d, b:%d)", a, b);
  }
}
