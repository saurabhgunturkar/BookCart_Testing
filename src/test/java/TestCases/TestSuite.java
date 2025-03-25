package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.Base;
import Utilities.Reporter;

public class TestSuite extends Base {

    @BeforeSuite
    public void suite() {
        Reporter.setUpReport();
    }

    @AfterSuite
    public void flush() {
        Reporter.tearDown();
    }
    
}
