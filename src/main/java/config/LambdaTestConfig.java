package config;

public class LambdaTestConfig {

    // public static String status = "failed";
    // public static RemoteWebDriver driver;

    // public static void platformBrowserConfiguration(String browserName, String browserVersion, String platform, String testname) throws MalformedURLException {

    //     String username = System.getenv("LT_USERNAME") == null ? "saurabhgunturkar07" : System.getenv("LT_USERNAME");
    //     String authkey = System.getenv("LT_ACCESS_KEY") == null ? "J3D9dVPixy0cg3u7f7CaRtwYlhj2bvMXAS3XqhwQMOyokFEtkA" : System.getenv("LT_ACCESS_KEY");
    //     String hub = "@hub.lambdatest.com/wd/hub";

    //     // Define capabilities
    //     DesiredCapabilities caps = new DesiredCapabilities();
    //     caps.setCapability("browserName", browserName);
    //     caps.setCapability("browserVersion", browserVersion);
    //     caps.setCapability("platformName", platform);

    //     // LambdaTest specific capabilities
    //     Map<String, Object> ltOptions = new HashMap<>();
    //     ltOptions.put("build", "BookCart");
    //     ltOptions.put("name", testname);
    //     ltOptions.put("plugin", "git-testng");
    //     ltOptions.put("tags", new String[]{"Feature", "Falcon", "Severe"});
    //     caps.setCapability("LT:Options", ltOptions);

    //     driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
    // }
}
