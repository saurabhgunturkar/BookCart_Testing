package TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Utilities.Base;
import Utilities.Reporter;


public class SignupTest extends Base {

    public String testname;
    HomePage homePage;
    


    @BeforeClass
    public void testReport() {
        Reporter.startTest("SIGNUP");
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        // driver = localBrowser();
        driver = remoteBrowser();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Jenkins setup completed ++++++++++++++++++++++++++++");
    }



    // @Test
    // public void testfail() throws IOException {
    //     try {
    //         String testname = "Azmon";
    //         String expecttitle = "Amazo244n";
    //         String actualtitle = driver.getTitle();
    //         Assert.assertEquals(actualtitle, expecttitle);
    //         System.out.println("Amazon title testcase passed");
    //         System.out.println("Pull Request creation...");
    //         Reporter.logPass(testname);
    //     } catch (AssertionError e) {
    //         System.out.println("Test case failed: " + e.getMessage());
    //         Reporter.logFail(testname);
    //     }
    // }

    // @Test(dataProvider = "firstNameData")
    // public void createNewUserAccount(String firstname, String testcase) throws Exception{
    //     try {
    //         testname = testcase;
    //         homePage = new HomePage();
    //         homePage.clickOnCreateAnAccount();
    //         homePage.enterFirstName(firstname);
    //         homePage.enterLastName("deo");
    //         homePage.enterEmail("deo@gmail.com");
    //         // homePage.
    //         homePage.clickOnCreateAnAccountButton();
    //         Reporter.logPass(testname);
    //     } catch (Exception e) {
    //         Reporter.logFail(testname + " - " + e.getMessage());
    //     } catch (AssertionError a) {
    //         Reporter.logFail(testname + " - " + a.getMessage());
    //     }
    // }

    @Test
    public void testcheck_with_testPrintEnvVariable(){
        try {
            testname = "testcheck_with_testPrintEnvVariable";
            System.out.println("Test case passed......");
            
            // get env.variable value form workflow file i.e. remote-browser.yml
            String myName = System.getenv("MY_NAME");
            System.out.println("MY_NAME: " + myName);
            Reporter.logPass(testname);
        } catch (Exception e) {
            e.printStackTrace();
            Reporter.logFail(testname + " - " + e.getMessage());
        }
        
    }

    
    













}
