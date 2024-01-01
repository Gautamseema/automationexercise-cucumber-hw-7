package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {


        @Given("I am on homepage and verify the homepage URL")
        public void iAmOnHomepageAndVerifyTheHomepageURL() {
            Assert.assertEquals(new RegisterPage().getCurrentURL(), "https://automationexercise.com/");
        }


    @When("Click {string} button")
    public void clickSignupButton(String signupOrLogin) {
        new RegisterPage().clickOnSignUpLink();
    }

    @And("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String text) {
        String actualText = new RegisterPage().verifyNewUserSignUpText();
        Assert.assertEquals(actualText,"New User Signup!");

    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {
        new RegisterPage().enterName("Friends");
        new RegisterPage().enterEmailId("Friends233@gmail.com");

    }
    @And("Click {string} Link")
    public void clickSignupLink(String button) {
        new LoginPage().clickOnSignUpLink();
    }



    @And("Verify that {string} is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible(String expectedText) {
        String actualText = new RegisterPage().verifyAccountText();
        Assert.assertEquals(actualText,"ENTER ACCOUNT INFORMATION");
    }


    @And("Select checkbox {string}")
    public void selectCheckboxSignUpForOurNewsletter() {
    }
    @And("I fill all details in signup page {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iFillAllDetailsInSignupPage(String title, String pass, String day, String month,
                                            String year, String fName, String lName, String add1, String add2,
                                            String country, String state, String city, String zipcode, String pNumber) {
        new LoginPage().sendDataToSignupForm(title, pass, day, month, year,fName, lName, add1, add2, country, state, city, zipcode, pNumber);


    }



    @And("Click {string}")
    public void clickCreateAccountButton(String createAccountButton) {
        new LoginPage().clickCreateAccountButton();
    }


    @And("Verify that {string} is Displayed")
    public void verifyThatACCOUNTCREATEDIsDisplayed(String expectedText) {
        String actualText = new LoginPage().getAccountCreatedMessage();
        Assert.assertEquals(actualText,"ACCOUNT CREATED!");

    }


    @And("Click Continue button")
    public void clickContinueButton() {
        new LoginPage().clickOnContinueButton();
    }

    @And("Verify that {string} is displayed")
    public void verifyThatLoggedInAsUsernameIsDisplayed(String expectedText) {
        String actualText = new LoginPage().getLoggedInAsUser();
        Assert.assertEquals(actualText,"Logged in as Friends");
    }

    @And("I click On {string} button")
    public void iClickOnDeleteAccountButton() {
        new LoginPage().clickOnDeleteAccount();
    }

    @And("Verify that {string}text is displayed")
    public void verifyThatACCOUNTDELETEDTextIsDisplayed(String expectedText) {
        String actualText = new LoginPage().getAccountDeleted();
        Assert.assertEquals(actualText,"ACCOUNT DELETED!");
    }

    @And("click {string} LINK")
    public void clickContinueLINK() {
        new LoginPage().clickOnContinuelink();
    }

    @When("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String actualText = new RegisterPage().verifyHomePage();
        Assert.assertEquals(actualText,"Home");
    }

    @When("Click on {string} link")
    public void clickOnLoginLink(String loginlink) {
        new RegisterPage().clickOnSignUpLink();
    }

    @And("Verify {string} is displayed")
    public void verifyLoginToYourAccountIsDisplayed(String AccountDisplayed) {
        String actualText = new LoginPage().getLoginToYourAccount() ;
        Assert.assertEquals(actualText,"Login to your account");
    }
    @And("I Enter correct {string} for login")
    public void iEnterCorrectEmailForLogin(String email) {
            new LoginPage().sendEmailToLoginField("Friends244@gmail.com");
    }
    @And("I enter correct {string} for login")
    public void iEnterCorrectPasswordForLogin(String password) {
            new LoginPage().sendPasswordToLoginField("Friends66");
    }

    @Then("Click {string} tab")
    public void clickLoginTab(String Login) {
        new LoginPage().clickOnLoginTab();
    }

    @And("Verify that {string} text is visible")
    public void verifyThatLoggedInAsUsernameTextIsVisible(String text) {
        String actualText = new LoginPage().getLoggedInAsUser();
        Assert.assertEquals(actualText,"Logged in as Friends");
    }

    @When("click on {string} link")
    public void clickOnSignupLink(String signup) {
        new RegisterPage().clickOnSignUpLink();
    }

    @Then("Verify {string} text is visible")
    public void verifyLoginToYourAccountTextIsVisible(String text) {
        String actualText = new LoginPage().getLoginToYourAccount() ;
        Assert.assertEquals(actualText,"Login to your account");
    }


    @And("I Enter incorrect {string} for login")
    public void iEnterIncorrectEmailForLogin(String email) {
        new LoginPage().sendEmailToLoginField("Friends299@gmail.com");
    }

    @And("I enter incorrect {string} for login")
    public void iEnterIncorrectPasswordForLogin(String password) {
        new LoginPage().sendPasswordToLoginField("Friends999");
    }

    @And("I click on {string} link")
    public void iClickOnLoginLink(String link) {
        new LoginPage().clickOnLoginTab();
    }

    @And("Verify error {string} is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String text) {
        String actualText = new LoginPage().getEmailOrPasswordIsIncorrectText() ;
        Assert.assertEquals(actualText,"Your email or password is incorrect!");
    }

    @When("I click on {string} tab")
    public void iClickOnSignupTab(String signup) {
        new RegisterPage().clickOnSignUpLink();
    }

    @Then("{string} message is visible")
    public void loginToYourAccountMessageIsVisible(String text) {
        String actualText = new LoginPage().getLoginToYourAccount() ;
        Assert.assertEquals(actualText,"Login to your account");
    }

    @And("I am able to enter correct {string} on login field")
    public void iAmAbleToEnterCorrectEmailIdOnLoginField(String email) {
        new LoginPage().sendEmailToLoginField("Friends244@gmail.com");
    }

    @And("I am able to enter correct {string}")
    public void iAmAbleToEnterCorrectPassword(String password) {
        new LoginPage().sendPasswordToLoginField("Friends66");
    }

    @And("I am able to click on {string} button")
    public void iAmAbleToClickOnLoginButton(String login) {
        new LoginPage().clickOnLoginTab();
    }

    @Then("{string} message is displayed")
    public void loggedInAsUsernameMessageIsDisplayed(String Text) {
        String actualText = new LoginPage().getLoggedInAsUser();
        Assert.assertEquals(actualText,"Logged in as Friends");
    }

    @And("I am able to click on {string} tab")
    public void iAmAbleToClickOnLogoutTab(String logout) {
            new LoginPage().clickOnLogOut();
    }

    @And("And I am on login page and verify the login URL")
    public void andIAmOnLoginPageAndVerifyTheLoginURL() {
        Assert.assertEquals(new LoginPage().getCurrentURL(), "https://automationexercise.com/login");
    }

    @Then("Then I should see the delivery address is same address filled at the time registration of account {string}")
    public void thenIShouldSeeTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new LoginPage().getDeliveryAddress(), expectedAddress);
    }

    @And("I should see billing address is same address filled at the time registration of account {string}")
    public void iShouldSeeBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new LoginPage().getBillingAddress(), expectedAddress);
    }
}




