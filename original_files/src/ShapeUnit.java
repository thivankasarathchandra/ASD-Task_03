package data;

import java.util.LinkedList;
import java.util.List;

/*
 * The point of this task, especially this class is to show how one can implement
 * their own unit testing functionality
 * This is our equivalent of JUnit
 * 
 * My data class, Shape, is an example of an application class that is to be tested
 * My TestShape is my JUnit test case.
 */

public class ShapeUnit {
	
	  private static List<String> checks; // store checks in a list
	  private static int checksMade = 0; // number of checks/tests made
	  private static int passedChecks = 0;//how many tests passed
	  private static int failedChecks = 0;//how many tests passed
	  
	  /*
	   * 
	   *this mimicks the output of a Unit test output
	   *it is a utility method to be used by assertions
	   */
	  
	  private static void addToReport(String txt) {
		    if (checks == null) {
		      checks = new LinkedList<String>();
		    }
		    checks.add(String.format("%04d: %s", checksMade++, txt));
		  }
	  
	  /*
	   * similar to the straightforward assertEquals() of the JUnit framework
	   * Will be used to check whether Length and Width have equal values
	   * If they are equal increase passedChecks by 1
	   * If they are not equal, increased failedChecks by 1
	   */
	  public static void checkEquals(double l, double w) {
		    if (l == w) {
		      addToReport(String.format("  %.2f == %.2f", l, w));
		      passedChecks++;
		    } else {
		      addToReport(String.format("* %.2f == %.2f", l, w));
		      failedChecks++;
		    }
		  }
	  
	  /*
	   * this is similar to assertNotEquals() in JUnit framework
	   * We check whether Length is not equal to Width
	   * If they are not equal, increase passedChecks
	   * If they are equal, increased failedChecks
	   */
	  public static void checkNotEquals(double l, double w) {
		    if (l != w) {
		      addToReport(String.format("  %.2f != %.2f", l, w));
		      passedChecks++;
		    } else {
		      addToReport(String.format("* %.2f != %.2f", l, w));
		      failedChecks++;
		    }
		  }
	  
	  /*
	   * we generate messages from the report of the checks
	   */
	  public static void report() {
		    System.out.printf("%d checks passed\n", passedChecks);
		    System.out.printf("%d checks failed\n", failedChecks);
		    System.out.println();
		    
		    for (String check : checks) {
		      System.out.println(check);
		    }
		  }

}
