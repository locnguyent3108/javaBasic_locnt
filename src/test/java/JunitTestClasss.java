import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitTestClasss {
    @Test
    public void test() {
        String str = "hello world";
        assertEquals(str, "helloz world");
    }
}
