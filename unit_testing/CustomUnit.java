import java.util.*;
import java.lang.reflect.*;

public class CustomUnit {
    private static List<String> checks;
    private static int checksMade = 0;
    private static int passedChecks = 0;
    private static int failedChecks = 0;

    private static void addToReport(String txt) {
        if (checks == null) {
            checks = new LinkedList<>();
        }
        checks.add(String.format("%04d: %s", checksMade++, txt));
    }

    public static void checkEquals(Object value1, Object value2) {
        try {
            if (value1.equals(value2)) {
                addToReport(String.format("  %s == %s", value1, value2));
                passedChecks++;
            } else {
                addToReport(String.format("* %s == %s", value1, value2));
                failedChecks++;
            }
        } catch (Exception e) {
            addToReport(String.format("* Exception occurred: %s", e.getMessage()));
        }
    }

    public static void checkNotEquals(Object value1, Object value2) {
        try {
            if (!value1.equals(value2)) {
                addToReport(String.format("  %s != %s", value1, value2));
                passedChecks++;
            } else {
                addToReport(String.format("* %s != %s", value1, value2));
                failedChecks++;
            }
        } catch (Exception e) {
            addToReport(String.format("* Exception occurred: %s", e.getMessage()));
        }
    }

    public static void report() {
        System.out.printf("%d checks passed\n", passedChecks);
        System.out.printf("%d checks failed\n", failedChecks);
        System.out.println();

        for (String check : checks) {
            System.out.println(check);
        }
    }

    public static void executeChecks(Object obj) throws Exception {
        for (Method m : obj.getClass().getDeclaredMethods()) {
            if (m.getName().startsWith("test")) {
                m.setAccessible(true);
                m.invoke(obj);
            }
        }
    }

    public static void checkPrivateFieldEquals(Object obj, String fieldName, Object expectedValue) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        Object actualValue = field.get(obj);
        checkEquals(actualValue, expectedValue);
    }

    public static void checkPrivateMethodReturns(Object obj, String methodName, Object expectedValue, Object... args) throws Exception {
        Method method = obj.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        Object actualValue = method.invoke(obj, args);
        checkEquals(actualValue, expectedValue);
    }

}
