package further_experiments;

import java.lang.reflect.*;

/******************************************************************************
 * This code lists all modifier codes and what they refer to. What modifiers 
 * does the code 25 refer to? Alter the code to check your answer.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Reflection16 {
  public static void main(String[] args) {
    int n = 1;
    for(int i=0;i<12;i++) {
      System.out.printf("%4d %s", n, Modifier.toString(n));
      System.out.println();
      n <<= 1;
    }
    System.out.println(Modifier.toString(4095));
  }
}
