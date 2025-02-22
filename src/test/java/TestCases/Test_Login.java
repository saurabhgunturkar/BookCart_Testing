// package TestCases;

// import java.net.MalformedURLException;

// import org.testng.Assert;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.AfterSuite;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.Test;

// import Utilities.Base;
// import Utilities.Reporter;

// public class Test_Login extends Base{

//      public String testname;

//      @BeforeSuite
//      public void suite(){
//         Reporter.setUpReport();
//      }
     

//     @BeforeClass
//     public void reporr(){
//         Reporter.startTest("LOGIN");
//     }

//     @BeforeMethod
//     public void setup() throws MalformedURLException {
//         driver = localBrowser("Chrome");
//     }

//     @AfterMethod
//     public void tearDown() {
//           driver.quit();
//     }

//         @AfterSuite
//     public void flush(){
//         Reporter.tearDown();
//     }




//     @Test
//     public void verifyRegisterButtonVisibility() {
//         testname="Verify Register Button Visibility";
//         try {
//              Assert.assertTrue(true);
//         Reporter.logPass(testname);
//         } catch (Exception e) {
//             Reporter.logFail(testname);
//         }
        
//     }

//     @Test
//     public void verifyRegisterButtonAccessibility() {
//         // Reporter.startTest("verifyRegisterButtonAccessibility");
//         // Your test code here
//         Reporter.logPass("Verify Register Button Accessibility test passed");
//     }

    
// }
