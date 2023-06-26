package data;


		
import static data.ShapeUnit.checkEquals;
import static data.ShapeUnit.checkNotEquals;
import static data.ShapeUnit.report;
	
public class TestShape {

 public void checkConstructorAndAccess(){
	    Shape shape = new Shape(5.5, 5.5);
	    checkEquals(shape.getLength(),shape.getWidth());
	    checkEquals(shape.getLength(), 5);
	    checkEquals(shape.getWidth(), 4);
	    checkNotEquals(shape.getWidth(), 5);    
	    checkNotEquals(shape.getWidth(), 5);    
	  }

public  void checkPerimeter(){
	    Shape shape = new Shape(5.5, 5.5);
	    shape.perimeter();
	    checkEquals(shape.getPerimeter(), 22.0); //passes
	    checkEquals(shape.getPerimeter(), 16.5);//fails
	  }

public static void main(String[] args) {
	    TestShape ts = new TestShape();
	    ts.checkConstructorAndAccess();
	    ts.checkPerimeter();
	    report();
	  }
}
