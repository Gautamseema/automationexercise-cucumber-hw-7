package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSteps {
    @When("I scroll down up to subscription link")
    public void iScrollDownUpToSubscriptionLink() {
        new HomePage().scrollDownToSubscriptionLink();
    }
    @Then("I enter email on email field")
    public void iEnterEmailOnEmailField(String email) {
        new HomePage().sendDataToSubscriptionEmail("Friends244@gmail.com");
    }

//    @Then("I enter email {string}")
//    public void iEnterEmail(String email) {
//        new HomePage().sendDataToSubscriptionEmail(email);
//
//    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @And("I should see the success subscription message {string}")
    public void iShouldSeeTheSuccessSubscriptionMessage(String expectedMessage) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);
    }


    @When("I click on {string} option")
    public void iClickOnCartOption(String option ) {
        new HomePage().clickOnHeaderTab(option);
    }

    @Then("I click on {string} button")
    public void iClickOnSubscriptionButton(String subscription) {
        new HomePage().scrollDownToSubscriptionLink();
    }

    @And("I able to enter {string} on email field")
    public void iAbleToEnterEmailOnEmailField(String email) {
        new HomePage().sendDataToSubscriptionEmail("Friends244@gmail.com");
    }

    @And("I able to click on arrow button")
    public void iAbleToClickOnArrowButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @And("{string} text is displayed")
    public void textIsDisplayed(String expectedMessage ) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);
    }

    @Then("I should see the subscription {string} text")
    public void iShouldSeeTheSubscriptionText(String expectedText) {
        Assert.assertEquals(new HomePage().getSubscriptionText(), expectedText);

    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }
}
