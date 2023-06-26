package experiments;

/******************************************************************************
 * This is the first experiment in the series that explores the Reflection API.
 * It demonstrates how to find out which class an object is an instance of. Here
 * getClass returns an object belonging to the class called Class. The getName
 * method of the Class object is called to find out just the class name. It
 * would be a good exercise to look at the Java API documentation to see what
 * other interesting methods the Class class provides.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2017
 ******************************************************************************/

public class Reflection03 {
	public static void main(String[] args) {
		Simple s = new Simple();
		System.out.println("class = " + s.getClass());
		System.out.println("class name = " + s.getClass().getName());
	}
}
