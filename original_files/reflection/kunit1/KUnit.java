package kunit1;

import java.util.*;

/******************************************************************************
 * This code is a prototype of a unit testing system. It is very primitive and 
 * contains only a reporting system and a means of checking assertions.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class KUnit {
  private static List<String> checks;
  private static int checksMade = 0;
  private static int passedChecks = 0;
  private static int failedChecks = 0;

  /******************************************************************************
   * A report is formed from a list of strings. This method adds a message to the
   * report. 
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/

  private static void addToReport(String txt) {
    if (checks == null) {
      checks = new LinkedList<String>();
    }
    checks.add(String.format("%04d: %s", checksMade++, txt));
  }

  /******************************************************************************
   * This method is similar to an assertion in JUnit. It checks that two integers
   * are equal and adds an appropriate message to the report.
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/
  
  public static void checkEquals(int value1, int value2) {
    if (value1 == value2) {
      addToReport(String.format("  %d == %d", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %d == %d", value1, value2));
      failedChecks++;
    }
  }

  /******************************************************************************
   * This method is similar to an assertion in JUnit. It checks that two integers
   * are not equal and adds an appropriate message to the report.
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/

  public static void checkNotEquals(int value1, int value2) {
    if (value1 != value2) {
      addToReport(String.format("  %d != %d", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %d != %d", value1, value2));
      failedChecks++;
    }
  }

  /******************************************************************************
   * Outputs the messages that form the report.
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/

  public static void report() {
    System.out.printf("%d checks passed\n", passedChecks);
    System.out.printf("%d checks failed\n", failedChecks);
    System.out.println();
    
    for (String check : checks) {
      System.out.println(check);
    }
  }
}
