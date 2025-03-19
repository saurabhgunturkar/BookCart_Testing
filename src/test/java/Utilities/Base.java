package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {


    public static WebDriver driver;
    
    public static WebDriver localBrowser(String browsername) {
        switch (browsername.toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
                break;
            case "edge":
                driver=new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Driver not initialized");
                break;
        }

        if (driver != null) {
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.amazon.in/");
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver; // Return the initialized WebDriver
    }
}
