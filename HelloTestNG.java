import org.testng.annotations.*;

public class HelloTestNG {
    // Run once at the beginning of the test
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("Before all");
    }

    // Run once at the end of the test
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("After all");
    }

    // Run before each method
    @BeforeMethod
    public void runBeforeTestMethod() {
        System.out.println("@Before - run before @Test method");
    }

    // Run after each method
    @AfterMethod
    public void runAfterTestMethod() {
        System.out.println("@After - run after @Test method");
    }

    @Test()
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
}