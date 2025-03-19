package TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utilities.Base;
import Utilities.Reporter;

public class Test_Signup extends Base {

    public String testname;

    @BeforeSuite
    public void suite() {
        Reporter.setUpReport();
    }

    @BeforeClass
    public void reporr() {
        Reporter.startTest("SIGNUP");
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = localBrowser("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Jenkins setup completed ++++++++++++++++++++++++++++");
    }

    @AfterSuite
    public void flush() {
        Reporter.tearDown();
    }

    @Test
    public void verifyRegisterButtonVisibility() throws IOException {
        testname = "TC_01 Verify Register Button Visibility";
        try {
            
            driver.findElement(By.xpath("//span[text()=' Login ']")).click();
            Boolean registerBtn = driver.findElement(By.xpath("//span[text()='Register']")).isDisplayed();
            Assert.assertTrue(registerBtn);
            Reporter.logPass(testname);
            System.out.println("Test 1 successfull ++++++++++++++++++++++++++++");
        } catch (Exception e) {
            Reporter.logFail(testname + " - Exception: " + e.getMessage());
        }
    }

    

    @Test
    public void verifyRegisterButtonAccessibility() throws IOException {
        testname="TC_02 Verify Register Button Accessibility";
        try {
            driver.findElement(By.xpath("//span[text()=' Login ']")).click();
            driver.findElement(By.xpath("//span[text()='Register']")).click();
            String formTitle = driver.findElement(By.xpath("//mat-card-title[text()=' User Registration ']")).getText();
            Assert.assertEquals(formTitle, "User Registration");
            Reporter.logPass(testname);
        } catch (Exception e) {
            Reporter.logFail(testname +" - "+ e.getMessage());
        }
    }

    @Test
    public void verifySignupPageTitle() throws IOException{
        testname="TC_03 Verify Signup page title";
        try {
            driver.findElement(By.xpath("//span[text()=' Login ']")).click();
            driver.findElement(By.xpath("//span[text()='Register']")).click();
            Thread.sleep(1000);
            String signupPageTitle = driver.getTitle();
            Assert.assertEquals(signupPageTitle, "Register");
            Reporter.logPass(testname);
        } catch (Exception e) {
            Reporter.logFail(testname +" - "+ e.getMessage());
        }
    }

    @Test
    public void verifySignupPageURL() throws IOException{
        testname="TC_04 Verify Signup Page URL";
        try {
            driver.findElement(By.xpath("//span[text()=' Login ']")).click();
            driver.findElement(By.xpath("//span[text()='Register']")).click();
            Thread.sleep(1000);
            Assert.assertTrue(driver.getCurrentUrl().contains("/register"));
            Reporter.logPass(testname);
        }catch(AssertionError a){
            Reporter.logFail(testname+"-"+a.getMessage());
        } catch (Exception e) {
            Reporter.logFail(testname+"-"+e.getMessage());
        }
    }


    // @Test(priority = 1)
    // public void verifySignupPageContent() throws IOException{
    //     testname="TC_05 Verify Signup Page Content";
    //     try {
    //         driver.findElement(By.xpath("//span[text()=' Login ']")).click();
    //         driver.findElement(By.xpath("//span[text()='Register']")).click();
    //         Thread.sleep(1000);
    //         List<WebElement> textfields = driver.findElements(By.tagName("mat-label"));
    //         List<String> fields = new ArrayList<>();
    //         List<String> expectedFields = Arrays.asList("Firstname");
    //         System.out.println(textfields);
    //         for(WebElement textField: textfields){
    //             fields.add(textField.getText());
    //         }
    //         for (String expectedField : expectedFields) {
    //             Assert.assertTrue(fields.contains(expectedField), "Field not found: " + expectedField);
    //         }
    //         Reporter.logPass(testname);
    //     } catch (Exception e) {
    //         Reporter.logFail(testname+"-"+e.getMessage());
    //     }
    // }

}
