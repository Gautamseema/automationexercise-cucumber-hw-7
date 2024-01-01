package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement homePageLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(xpath ="//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignUpText;
    @CacheLookup
    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
    WebElement name;
    @CacheLookup
    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
    WebElement emailId;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    WebElement enterAccountInformation;

    @CacheLookup
    @FindBy(css = "div.container div.row div.col-sm-4:nth-child(3) div.signup-form form:nth-child(2) > p:nth-child(5)")
    WebElement EmailExistMessage;


    public String verifyHomePage(){
        log.info("Verify HomePageLink " + homePageLink.toString());
        return getTextFromElement(homePageLink);
    }
    public String getCurrentURL(){
        waitUntilVisibilityOfElementLocated(By.xpath("//h2[normalize-space()='Brands']"), 3);
        log.info("Getting Home Page URL : ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
    public void clickOnSignUpLink(){
        log.info("click on signUpLink " + signUpLink.toString());
       clickOnElement(signUpLink);
    }



    public String verifyNewUserSignUpText(){
        log.info("Verify new user signup " + newUserSignUpText.getText());
        return getTextFromElement(newUserSignUpText);
}
    public void enterName(String value) {
        log.info("enterName" + name.toString());
        sendTextToElement(name, value);
    }

    public void enterEmailId(String value) {
        log.info("enterEmailId" + emailId.toString());
        sendTextToElement(emailId, value);
    }



    public String verifyAccountText(){
        log.info("Verify 'ENTER ACCOUNT INFORMATION' " + enterAccountInformation.toString());
        return getTextFromElement(enterAccountInformation);
}
    public String verifyEmailExistMessage(){
        log.info("Verify Email Exist Message  " + EmailExistMessage.getText());
        return getTextFromElement(EmailExistMessage);
    }
}