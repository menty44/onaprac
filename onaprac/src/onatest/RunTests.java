/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onatest;

/**
 *
 * @author oluoch
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTests {

    public static void main(String[] args) {
        Result result;
        //Test WaterPoint
        result = JUnitCore.runClasses(WaterPointTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("WaterPointTests || PASSED THE TEST");
        }

        //Test Community
        result = JUnitCore.runClasses(CommunityTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("CommunityTests || PASSED THE TEST");
        }
        
        //Test DataProcessor
        result = JUnitCore.runClasses(DataProcessorTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("DataProcessorTests || PASSED THE TEST");
        }
    }
}
