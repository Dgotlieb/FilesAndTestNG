import org.testng.annotations.*;

public class HelloTestNG {
    // Run once at the beginning of the test
    @BeforeClass
    public void runOnceBeforeClass() {
        System.out.println("Before all");
    }

    // Run once at the end of the test
    @AfterClass
    public void runOnceAfterClass() {
        System.out.println("After all");
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
