package chap006domainentities.examples;

import chap006domainentities.domainentities.User;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void canConstructNewUser() {
        User user = new User("test","abc");
    }

    @Test
    public void moreTernary() {
        String url = "eviltester.com";
        url = url.startsWith("http://") ? url : "http";
    }

}
