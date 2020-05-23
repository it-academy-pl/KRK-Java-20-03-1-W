package pl.itacademy.java.lesson11.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) {
        int testsBeenRan = 0;
        int failedTests = 0;
        Method[] methods = ApplicationTest.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                if (!test.ignore()) {
                    testsBeenRan++;
                    try {
                        method.invoke(null);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        System.out.println(e.getCause().getMessage());
                        failedTests++;
                    }
                }
            }
        }
        System.out.printf("Executed tests: %d, failed tests: %d", testsBeenRan, failedTests);
    }
}
