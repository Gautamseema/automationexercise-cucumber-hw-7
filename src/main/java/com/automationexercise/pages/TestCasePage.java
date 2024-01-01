package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends Utility {
    private static final Logger log = LogManager.getLogger(TestCasePage .class.getName());
    @CacheLookup
    @FindBy(css = "a[href='/test_cases']")
    WebElement TestCases;

    public void clickOnTestCases(){
        try {
            TestCases .click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("a[href='/test_cases']")));
        }
        clickOnElement(TestCases);
        log.info("Clicking on TestCases: " + TestCases .toString());
    }
    public String getCurrentURL(){
        waitUntilVisibilityOfElementLocated(By.xpath("//b[normalize-space()='Test Cases']"), 3);
        log.info("Getting Home Page URL : ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
}
