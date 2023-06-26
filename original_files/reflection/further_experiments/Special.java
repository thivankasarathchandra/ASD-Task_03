package further_experiments;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

/******************************************************************************
 * This is the declaration of an annotation that can be included in other 
 * source files. It's usage is similar to the @Test annotations used with 
 * JUnit. To use it put @Special before method declarations.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

@Retention(RetentionPolicy.RUNTIME)

public @interface Special {

}
