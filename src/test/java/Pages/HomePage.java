package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.WebDriverHelper;

public class HomePage {

    WebDriverHelper helper;

    public HomePage() {
        helper = new WebDriverHelper();
    }

    // locators...
    By createAccount = By.xpath("//header/div/div/ul/li/a[text()='Create an Account']");
    By firstnameTextfield = By.name("firstname");
    By lastnameTextfield = By.name("lastname");
    By emailTextfield = By.name("email");
    By passwordTextfield = By.name("Password");
    By confirmPasswordTextfield = By.name("confirmPassword");
    
    By firstnameErrorMessage = By.id("firstname-error");

    By createAccountButton = By.cssSelector("button[title='Create an Account']");

    // methods...
    public void clickOnCreateAnAccount() {
        helper.click(createAccount);
    }

    // make a methods for each element in the page such as firstname, lastname,
    // email, password, confirm password, create an account button
    // make proper assertions for error messages
    // use the helper class to click on the elements
    // use the helper class to enter text in the elements

    public void enterFirstName(String firstName) {
        helper.click(firstnameTextfield);
        helper.sendkeys(firstnameTextfield, firstName);
    }

    public void enterLastName(String lastname) {
        helper.click(lastnameTextfield);
        helper.sendkeys(lastnameTextfield, lastname);
    }

    public void enterEmail(String email) {
        helper.click(emailTextfield);
        helper.sendkeys(emailTextfield, email);
    }

    public void enterPassword(String password) {
        helper.click(passwordTextfield);
        helper.sendkeys(passwordTextfield, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        helper.click(confirmPasswordTextfield);
        helper.sendkeys(confirmPasswordTextfield, confirmPassword);
    }

    public void clickOnCreateAnAccountButton() {
        helper.scrollToElement(createAccountButton);
        helper.click(createAccountButton);
    }

    public void verifyFirstNameErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = helper.getText(firstnameErrorMessage);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

}
