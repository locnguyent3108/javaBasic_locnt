import static org.junit.Assert.assertEquals;
import org.junit.Test;

import domainobject.TestAppEnv;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {
        assertEquals("the url name is correct",
                TestAppEnv.getUrl(), "https://www.google.com/");
    }

    @Test
    public void canGetDomainStatically() {
        assertEquals("can get success domain",
                   "google.com",
                    TestAppEnv.getDomain());
    }

    @Test
    public void canGetPortStatically() {
        assertEquals("can get success port",
                    "1234",
                    TestAppEnv.getPort());
    }
}
