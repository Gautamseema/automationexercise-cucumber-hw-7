package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsTab;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    List<WebElement> productName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchBar;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'single-products']/div/p")
    WebElement searchedProductName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-image-wrapper']/div/div/p")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement addToProductButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterOrderSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'Women']/div/ul/li/a")
    List<WebElement> womenSubMenuList;
    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'title text-center']")
    WebElement subMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'Men']/div/ul/li/a")
    List<WebElement> menSubMenuList;

    @CacheLookup
    @FindBy(css = "div[class='brands_products'] h2")
    WebElement Brands;

    @CacheLookup
    @FindBy(css = "a[href='/brand_products/Polo']")
    WebElement Polo;

    @CacheLookup
    @FindBy(css = "a[href='/brand_products/Biba']")
    WebElement Biba;

    public void clickOnProductsTab() {
        clickOnElement(productsTab);
        log.info("Clicking on products tab : " + productsTab.toString());
    }

    public String getAllProductText() {
        return getTextFromElement(allProductText);
    }

    public void clickOnViewProductWithProductName(String pName) {
        for (WebElement p : productName) {
            if (p.getText().equalsIgnoreCase(pName)) {
                driver.findElement(with(By.xpath("//ul[@class = 'nav nav-pills nav-justified']/li/a")).below(p)).click();
                log.info("Clicking on view product tab of " + pName);
                break;
            }
        }
    }

    public void sendTextToSearchBar(String pName) {
        sendTextToElement(searchBar, pName);
        log.info("Sending " + pName + " to search bar : " + searchBar.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        log.info("Clicking on the search button : " + searchButton.toString());
    }

    public String getSearchedProductsText() {
        log.info("Getting Searched Products text : " + searchedProductsText.toString());
        return getTextFromElement(searchedProductsText);
    }

    public String getSearchedProductName() {
        log.info("Getting Searched Product name : " + searchedProductName.toString());
        return getTextFromElement(searchedProductName);
    }

    public void mouseHoverAndClickAddToCartOnProduct(String pName) {
        for (WebElement pr : productList) {
            if (pr.getText().equalsIgnoreCase(pName)) {
                mouseHoverToElement(pr);
                log.info("Hovering mouse over " + pName + " : " + productList.toString());
                try {
                    addToProductButton.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")));
                }
                log.info("Click on " + pName + " Add to Cart button : " + productList.toString());
                break;
            }
        }
    }

    public void clickOnContinueButtonAfterOrderSuccessMessage() {
        clickOnElement(continueButtonAfterOrderSuccessMessage);
        log.info("Click on continue button after order success message : " + continueButtonAfterOrderSuccessMessage.toString());
    }

    public void clickOnSubCategoryOfWomen(String womenSubCategory) {
        for (WebElement s : womenSubMenuList) {
            if (s.getText().equalsIgnoreCase(womenSubCategory)) {
                clickOnElement(s);
                log.info("Clicking on " + womenSubCategory + " of women sub category : " + womenSubMenuList.toString());
                break;
            } else {
                System.out.println("Sub category is not available");
            }
        }
    }

    public String getSubMenuPageTitle() {
        log.info("Getting Sub Menu Page Title : " + subMenuPageTitle.toString());
        return getTextFromElement(subMenuPageTitle);
    }

    public void clickOnSubCategoryOfMen(String menSubCategory) {
        for (WebElement s : menSubMenuList) {
            if (s.getText().equalsIgnoreCase(menSubCategory)) {
                clickOnElement(s);
                log.info("Clicking on " + menSubCategory + " of men sub category : " + menSubMenuList.toString());
                break;
            } else {
                System.out.println("Sub category is not available");
            }
        }
    }

    public String getBrandsText() {
        log.info("Getting Brands Text : " + Brands.toString());
        return getTextFromElement(Brands);
    }

    public void clickOnBrandName() {
        clickOnElement(Polo);
        log.info("Click on brand name : " + Polo.toString());
    }

    public void clickOnBrandName1() {
        clickOnElement(Biba);
        log.info("Click on brand name : " + Biba.toString());
    }


}

