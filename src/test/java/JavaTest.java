import junit.framework.TestCase;

public class JavaTest extends TestCase {
    protected int value1, value2;

    //assign the value
    protected void setup() {
        value1 = 1;
        value2 = 2;
    }

    // test method to add two values
    public void testAddTwo() {
        double result = value1 + value2;
        assertTrue(result == 3);
    }
}
