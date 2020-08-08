package unittesting;

import org.junit.*;

public class TestRunner {
    // Create a Bug:

    // Dev team: Tech Lead >> Developer >>
    // QA Team: QA Lead
    // QA Tester: create a Bug
    // Bug Fixed:
    // ReTesting by QA

    // For Testing we do not need main method any more

    // Test Case:

    @Before
    public  void welcome(){
        System.out.println("Welcome to Testing World");
    }

    @Test
    public void testDoSummationUsingTwoParameter() {

        // Calculator.doSummation(30,50);
        // Expected Result: 80
        // Actual Result:
        // Assertion: Validate your test case
        int actualResult = Calculator.doSummation(30, 50);
        int expectedResult = 80;
        Assert.assertEquals("Test Case not pass", expectedResult, actualResult);
    }

    // TestCase
    @Test()
    public void testDoSummationUsingThreeParameter() {
        int actualResult = Calculator.doSummation(30, 50,70);
        int expectedResult = 150;
        Assert.assertEquals("Test Case not pass", expectedResult, actualResult);
    }






    @After
    public  void goodBye(){
        System.out.println("Good Bye from Testing World");
    }


}








