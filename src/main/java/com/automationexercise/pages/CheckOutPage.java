package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility  {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetailsText;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrderText;

    @CacheLookup
    @FindBy (xpath = "//textarea[@name='message']")
    WebElement commentArea;

    @CacheLookup
    @FindBy (xpath = "//a[contains(text() , 'Place Order')]")
    WebElement placeOrderButton;
    @CacheLookup
    @FindBy (xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardField;

    @CacheLookup
    @FindBy (xpath = "//input[@name='card_number']")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='ex. 311']")
    WebElement CVCField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='YYYY']")
    WebElement expirationYearField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='MM']")
    WebElement expirationMonthField;

    @CacheLookup
    @FindBy (xpath = "//button[@id='submit']")
    WebElement payAndConfirmButton;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement orderConfirmationMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoiceButtonAfterOrderSuccessMessage;
    public String verifyTextOnCheckoutPage(String text) {
        if(text.equalsIgnoreCase("Address Details")){
            log.info("Getting " + text + " : " + addressDetailsText.toString());
            return getTextFromElement(addressDetailsText);
        } else if (text.equalsIgnoreCase("Review Your Order")) {
            log.info("Getting " + text + " : " + reviewYourOrderText.toString());
            return getTextFromElement(reviewYourOrderText);
        } else {
            return "Text is not displayed";
        }
    }

    public void sendTextToCommentArea(String comment) {
        sendTextToElement(commentArea, comment);
        log.info("Sending text to comment area : " + commentArea.toString());
    }
    public void clickOnPlaceOrderButton() {
        //clickOnElement(placeOrderButton);
        try {
            placeOrderButton.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text() , 'Place Order')]")));
        }
        log.info("Clicking on Place Order button : " + placeOrderButton.toString());
    }
    public void sendPaymentDetails(String name, String cNumber, String CVCNumber, String eMonth, String eYear){
        sendTextToElement(nameOnCardField, name);
        log.info("Sending " + name + " to Name on Card field : " + nameOnCardField.toString());
        sendTextToElement(cardNumberField, cNumber);
        log.info("Sending " + cNumber + " to Card Number : " + cardNumberField.toString());
        sendTextToElement(CVCField, CVCNumber);
        log.info("Sending " + CVCNumber + " to CVC field : " + CVCField.toString());
        sendTextToElement(expirationMonthField, eMonth);
        log.info("Sending " + eMonth + " to Month field : " + expirationMonthField.toString());
        sendTextToElement(expirationYearField, eYear);
        log.info("Sending " + eYear + " to Year field : " + expirationYearField.toString());
    }
    public void clickOnPayAndConfirmOrderButton() {
        clickOnElement(payAndConfirmButton);
        log.info("Clicking on Pay and Confirm Order button : " + payAndConfirmButton.toString());
    }
    public String getOrderConfirmationMessage(){
        log.info("Getting order confirmation message : " +orderConfirmationMessage.toString());
        return getTextFromElement(orderConfirmationMessage);
    }
    public void clickOnDownloadInvoiceButtonAfterOrderSuccessMessage() {
        clickOnElement(downloadInvoiceButtonAfterOrderSuccessMessage);
        log.info("Click on download invoice button : " + downloadInvoiceButtonAfterOrderSuccessMessage.toString());
    }


}
