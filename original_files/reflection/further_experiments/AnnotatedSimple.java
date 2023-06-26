package further_experiments;

/******************************************************************************
 * This class is used to demonstrate various aspects of Java reflection. It
 * uses a few more keywords than the version used in previous explorations.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class AnnotatedSimple {

  public int a = 10;
  private int b = 20;

  public AnnotatedSimple() {
  }

  public AnnotatedSimple(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Special
  public void squareA() {
    this.a *= this.a;
  }

  private void squareB() {
    this.b *= this.b;
  }

  public int getA() {
    return a;
  }

  @Lucky @Special
  private void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  protected void setB(int b, double unused) {
    this.b = b;
  }

  static int returnEight() {
    return 8;
  }

  public static int returnNine() {
    return 9;
  }

  public String toString() {
    return String.format("(a:%d, b:%d)", a, b);
  }
}
