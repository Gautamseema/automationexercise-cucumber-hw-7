package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage .class.getName());

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")
    WebElement signUp;

    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement titleAsMrRadioButton;

    @CacheLookup
    @FindBy (id = "id_gender2")
    WebElement titleAsMrsRadioButton;

    @CacheLookup
    @FindBy (id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy (id = "days")
    WebElement dayInDOBDropdown;

    @CacheLookup
    @FindBy (id = "months")
    WebElement monthInDOBDropdown;

    @CacheLookup
    @FindBy (id = "years")
    WebElement yearInDOBDropdown;

    @CacheLookup
    @FindBy (id = "first_name")
    WebElement fNameFieldInAddressInfo;

    @CacheLookup
    @FindBy (id = "last_name")
    WebElement lNameFieldInAddressInfo;

    @CacheLookup
    @FindBy (id = "address1")
    WebElement address1Field;

    @CacheLookup
    @FindBy (id = "address2")
    WebElement address2Field;

    @CacheLookup
    @FindBy (id = "country")
    WebElement countryDropDown;

    @CacheLookup
    @FindBy (id = "state")
    WebElement stateField;

    @CacheLookup
    @FindBy (id = "city")
    WebElement cityField;

    @CacheLookup
    @FindBy (id = "zipcode")
    WebElement zipcodeField;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobileNumberField;

    @CacheLookup
    @FindBy(xpath = "(//button[@type = 'submit'])[1]")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedMessage;


    @CacheLookup
    @FindBy(linkText = "Continue")
    WebElement ContinueButton;

    @CacheLookup
    @FindBy(css = "li:nth-child(10) a:nth-child(1)")
    WebElement LoggedInAsUser;
    @CacheLookup
    @FindBy(xpath = "//header[@id='header']//li[5]")
    WebElement DeleteAccount;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement AccountDeleted;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continuelink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
    WebElement LoginToYourAccount;
    @CacheLookup
    @FindBy(xpath= "//input[@data-qa='login-email']")
    WebElement loginEmailField;

    @CacheLookup
    @FindBy (name = "password")
    WebElement loginPasswordField ;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement Login;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement emailOrPasswordIsIncorrectText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement Logout;

    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_delivery']/li[4]")
    WebElement deliveryAddress;

    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_invoice']/li[4]")
    WebElement billingAddress;


    public void clickOnSignUpLink() {
        log.info("Click on signUp" + signUp.toString());
        clickOnElement(signUp);
    }

    public void sendDataToSignupForm(String title, String password, String day, String month, String year, String fName,
                                     String lName, String add1, String add2, String country, String state, String city,
                                     String zipcode, String mNumber) {
        if (title.equalsIgnoreCase("Mr")){
            clickOnElement(titleAsMrRadioButton);
            log.info("Selecting radio button against Mr.");
        } else {
            clickOnElement(titleAsMrsRadioButton);
            log.info("Selecting radio button against Mrs.");
        }
        sendTextToElement(passwordField, password);
        log.info("Sending " + password + " to password field");
        selectByVisibleTextFromDropDown(dayInDOBDropdown, day);
        log.info("Selecting " + day + " from Day dropdown in DOB");
        selectByVisibleTextFromDropDown(monthInDOBDropdown, month);
        log.info("Selecting " + month + " from Month dropdown in DOB");
        selectByVisibleTextFromDropDown(yearInDOBDropdown, year);
        log.info("Selecting " + year + " from Year dropdown in DOB");
        sendTextToElement(fNameFieldInAddressInfo, fName);
        log.info("Sending " + fName + " to First Name field");
        sendTextToElement(lNameFieldInAddressInfo, lName);
        log.info("Sending " + lName + " to Last Name field");
        sendTextToElement(address1Field, add1);
        log.info("Sending " + add1 + " to Address1 field");
        sendTextToElement(address2Field, add2);
        log.info("Sending " + add2 + " to Address2 field");
        selectByVisibleTextFromDropDown(countryDropDown, country);
        log.info("Selecting " + country + " from Country dropdown");
        sendTextToElement(stateField, state);
        log.info("Sending " + state + " to State field");
        sendTextToElement(cityField, city);
        log.info("Sending " + city + " to City field");
        sendTextToElement(zipcodeField, zipcode);
        log.info("Sending " + zipcode + " to Zipcode field");
        sendTextToElement(mobileNumberField, mNumber);
        log.info("Sending " + mNumber + " to Mobile Numberfield");
}
 public void clickCreateAccountButton(){
     try {
         createAccountButton.click();
     } catch (Exception e) {
         JavascriptExecutor executor = (JavascriptExecutor) driver;
         executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[@type = 'submit'])[1]")));
     }
     log.info("Clicking on create account button : " + createAccountButton.toString());
 }
    public String getAccountCreatedMessage() {
        log.info("Getting account created message : " + accountCreatedMessage.toString());
        return getTextFromElement(accountCreatedMessage);
    }
    public void clickOnContinueButton(){
        clickOnElement(ContinueButton) ;
        log.info("Clicking on continue button after account created : " + ContinueButton.toString());
    }
    public String getLoggedInAsUser() {
        log.info("Getting Logged In As User : " + LoggedInAsUser.toString());
        return getTextFromElement(LoggedInAsUser);
    }
    public void clickOnDeleteAccount(){
        clickOnElement(DeleteAccount) ;
        log.info("Clicking on Delete Account : " + DeleteAccount.toString());
    }
    public String getAccountDeleted() {
        log.info("Getting Account deleted : " + AccountDeleted.toString());
        return getTextFromElement(AccountDeleted);
    }
    public void clickOnContinuelink(){
        clickOnElement(continuelink ) ;
        log.info("Clicking on continue button after account created : " + continuelink .toString());
    }
    public String getLoginToYourAccount() {
        try {
            LoginToYourAccount.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]")));
            }
            log.info("Getting Login to your account : " + LoginToYourAccount.toString());
            return getTextFromElement(LoginToYourAccount);
        }

        public void sendEmailToLoginField(String value) {
       try {
           loginEmailField.click();
       } catch (Exception e) {
           JavascriptExecutor executor = (JavascriptExecutor) driver;
           executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@data-qa='login-email']")));
       }
       log.info("enterEmailId" + loginEmailField.toString());}

    public void sendPasswordToLoginField(String value) {
    try {
        loginPasswordField.click();
    } catch (Exception e) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.name("password")));
    }
    log.info("enterPassword" + loginPasswordField.toString());}
    public void clickOnLoginTab(){
        clickOnElement(Login) ;
        log.info("Clicking on continue button after account created : " + Login.toString());
    }
    public String getEmailOrPasswordIsIncorrectText() {
        try {
            emailOrPasswordIsIncorrectText.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")));
        }
        log.info("Getting Incorrect email or password text : " + emailOrPasswordIsIncorrectText.toString());
        return getTextFromElement(emailOrPasswordIsIncorrectText);
    }
    public void clickOnLogOut(){
        clickOnElement(Logout) ;
        log.info("Clicking on continue button after account created : " + Logout.toString());
    }
    public String getCurrentURL(){
        log.info("Getting Login Page URL ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
    public String getDeliveryAddress(){
        log.info("Getting delivery address : " + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }
    public String getBillingAddress(){
        log.info("Getting billing address : " + deliveryAddress.toString());
        return getTextFromElement(billingAddress);
    }



}
