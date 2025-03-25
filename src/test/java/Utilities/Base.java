package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
    public static WebDriver driver;

    public static WebDriver localBrowser(String browsername) {
        
        try {
            String url = System.getProperty("url"); //PropertyReader.getProperty("url");

            switch (browsername.toLowerCase()) {
                case "chrome":
                    System.out.println(url + "_____________________________");
                    driver = new ChromeDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    break;

                default:
                    throw new IllegalArgumentException("Browser \"" + browsername + "\" is not supported.");
            }

            if (driver != null) {
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                System.out.println(url+"_____________________________");
                driver.get(url);
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
        } catch (Exception e) {
            System.err.println("Error initializing browser: " + e.getMessage());
            e.printStackTrace();
        }

        return driver; // Return the initialized WebDriver
    }
}