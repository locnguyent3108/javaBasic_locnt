package domainobject;

public class TestAppEnv {
    public static final String DOMAIN = "google.com";
    public static final String PORT = "12.0.0.1";

    public static String getDomain() {
        return DOMAIN;
    }

    public static String getPort() {
        return PORT;
    }

    public static String getUrl() {
        return "http://" + DOMAIN + PORT;
    }

}
