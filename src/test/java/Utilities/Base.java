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

    public static WebDriver localBrowser() {
        
        try {
            String url = PropertyReader.getProperty("url");
            String browsername = PropertyReader.getProperty("browser");
            switch (browsername.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    System.out.println("Chrome browser is initialized");
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    System.out.println("Edge browser is initialized");
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    System.out.println("Firefox browser is initialized");
                    break;
                case "safari":
                    driver = new SafariDriver();
                    System.out.println("Safari browser is initialized");
                    break;
                default:
                    throw new IllegalArgumentException("Browser \"" + browsername + "\" is not supported.");
            }

            if (driver != null) {
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.get(url);
                System.out.println("Navigated to URL: " + url);
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
        } catch (Exception e) {
            System.err.println("Error initializing browser: " + e.getMessage());
            e.printStackTrace();
        }
        return driver; // Return the initialized WebDriver
    }

    public static WebDriver remoteBrowser() {
                
        try {
            String url = System.getProperty("url");
            String browser = System.getProperty("browser");

            switch (browser.toLowerCase()) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless"); // Add headless argument
                    driver = new ChromeDriver(options); // Pass options to ChromeDriver
                    System.out.println("Chrome browser is initialized");
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    System.out.println("Edge browser is initialized");
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    System.out.println("Firefox browser is initialized");
                    break;
                case "safari":
                    driver = new SafariDriver();
                    System.out.println("Safari browser is initialized");
                    break;
                default:
                    throw new IllegalArgumentException("Browser \"" + browsername + "\" is not supported.");
            }

            if (driver != null) {
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.get(url);
                System.out.println("Navigated to URL: " + url);
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