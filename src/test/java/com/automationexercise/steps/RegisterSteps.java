package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("I am on homepage and verify the URL")
    public void iAmOnHomepageAndVerifyTheURL() {
        Assert.assertEquals(new RegisterPage().getCurrentURL(), "https://automationexercise.com/");
    }

    @When("click on {string}")
    public void clickOnSignup(String signup) {
        new RegisterPage().clickOnSignUpLink();
    }

    @When("click on header menu {string}")
    public void clickOnHeaderMenuSignup(String signup) {
        new RegisterPage().clickOnSignUpLink();
    }

    @Then("Identify {string} text is present")
    public void identifyNewUserSignupTextIsPresent(String text) {
        String actualText = new RegisterPage().verifyNewUserSignUpText();
        Assert.assertEquals(actualText, "New User Signup!");
    }

    @And("I send name {string} to name field")
    public void iSendNameFriendsToNameField(String name) {
        new RegisterPage().enterName("Friends");
    }

    @And("I send existing {string} to email field")
    public void iSendExistingEmailToEmailField(String email) {
        new RegisterPage().enterEmailId("Friends244@gmail.com");
    }


    @And("I able to click on signup button")
    public void iAbleToClickOnSignupButton() {
        new LoginPage().clickOnSignUpLink();
    }

    @And("Verify error {string} is displayed")
    public void verifyErrorEmailAddressAlreadyExistIsDisplayed(String text1) {
        String actualText = new RegisterPage().verifyEmailExistMessage();
        Assert.assertEquals(actualText, "Email Address already exist!");


    }

    @When("Click on {string} button")
    public void clickOnContactUsButton(String contact) {
        new ContactUsPage().clickOnContactUs();
    }

    @And("Verify {string} text is displayed")
    public void verifyContactUsTextIsDisplayed(String text) {
        String actualText = new ContactUsPage().verifyContactUsText();
        Assert.assertEquals(actualText, "CONTACT US");
    }

    @Then("Verify {string} should see")
    public void verifyGETINTOUCHShouldSee(String text) {
        String actualText = new ContactUsPage().verifyGetInTouchMessage();
        Assert.assertEquals(actualText, "GET IN TOUCH");
    }

    @And("I enter {string} to name field")
    public void iEnterNameToNameField(String name) {
        new ContactUsPage().sendDataToNameField("Friends");

    }

    @And("I enter {string} to email field")
    public void iEnterEmailToEmailField(String email) {
        new ContactUsPage().sendDataToEmailField("Friends244@gmail.com");
    }

    @And("I enter {string} to subject field")
    public void iEnterSubjectToSubjectField(String subject) {
        new ContactUsPage().sendDataToSubjectField("About Product");
    }

    @And("I enter {string} to message field")
    public void iEnterMessageToMessageField(String message) {
        new ContactUsPage().sendDataToMessageField("Product is good");
    }

    @And("I upload file")
    public void iUploadFile() {
        new ContactUsPage().uploadFile();
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I click on ok button popup")
    public void iClickOnOkButtonPopup() {
        new ContactUsPage().acceptPopupMessage();
    }

    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String expectedText) {
        Assert.assertEquals(new ContactUsPage().getDetailsSubmittedMessage(), expectedText);
    }

    @And("I click on home button")
    public void iClickOnHomeButton() {
        new ContactUsPage().clickOnHomeButton();
    }

    @When("I click on {string}")
    public void iClickOnTestCases(String click) {
        new TestCasePage().clickOnTestCases();
    }


    @Then("I am on text cases page and verify the test-cases URL {string}")
    public void iAmOnTextCasesPageAndVerifyTheTestCasesURL(String expectedURL) {
        Assert.assertEquals(new TestCasePage().getCurrentURL(), expectedURL);
    }


    @And("I should see the welcome text on shopping cart page {string}")
    public void iShouldSeeTheWelcomeTextOnShoppingCartPage(String expectedText) {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartWelcomeText(), expectedText);
    }

    @And("I click on Proceed to Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutButton();
    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
        new ShoppingCartPage().clickOnRegisterLoginLinkOnCheckoutPopup();
    }

    @And("I should see the text on checkout page {string}")
    public void iShouldSeeTheTextOnCheckoutPage(String expectedText) {
        Assert.assertEquals(new CheckOutPage().verifyTextOnCheckoutPage(expectedText), expectedText);
    }

    @And("I enter details into comment area {string}")
    public void iEnterDetailsIntoCommentArea(String comment) {
        new CheckOutPage().sendTextToCommentArea(comment);
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        new CheckOutPage().clickOnPlaceOrderButton();
    }

    @And("I enter payment details {string} {string} {string} {string} and {string}")
    public void iEnterPaymentDetailsAnd(String name, String CardNo, String CVC, String month, String year) {
        new CheckOutPage().sendPaymentDetails(name, CardNo, CVC, month, year);
    }

    @And("I click on Pay and Confirm Order button")
    public void iClickOnPayAndConfirmOrderButton() {
        new CheckOutPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("I should see the order confirmation message {string}")
    public void iShouldSeeTheOrderConfirmationMessage(String expectedMessage) {
        Assert.assertEquals(new CheckOutPage().getOrderConfirmationMessage(), expectedMessage);
    }

    @And("I click on header menu option {string}")
    public void iClickOnHeaderMenuOption(String option) {
        new HomePage().clickOnHeaderTab(option);
    }

    @Then("I should see the account deleted message {string}")
    public void iShouldSeeTheAccountDeletedMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getAccountDeletedMessage(), expectedText);
    }

    @Then("I click on continue button after deleting account")
    public void iClickOnContinueButtonAfterDeletingAccount() {
        new HomePage().clickOnContinueButtonAfterAccountDeletedMessage();
    }
}
//    @And("I send {string} and {string} to signup")
//    public void iSendAndToSignup(String name, String email) {
//    }

