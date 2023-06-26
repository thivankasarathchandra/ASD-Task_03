public class Primary {
  public double x = 10.0;
  private double y = 20.0;

  public Primary() {
  }

  public Primary(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void doubleX() {
    this.x *= 2;
  }

  private void doubleY() {
    this.y *= 2;
  }

  public double getX() {
    return x;
  }

  private void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("(x:%f, y:%f)", x, y);
  }
}
