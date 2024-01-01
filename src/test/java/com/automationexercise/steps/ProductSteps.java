package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSteps {
    @When("I click on products tab")
    public void iClickOnProductsTab() {
        new ProductPage().clickOnProductsTab();

    }

    @Then("I should see text {string} on product page")
    public void iShouldSeeTextOnProductPage(String expectedText) {
        Assert.assertEquals(new ProductPage().getAllProductText(), expectedText);
    }

    @And("I click on view product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String pName) {
        new ProductPage().clickOnViewProductWithProductName(pName);
    }

    @And("I am on product details page and verify the URL")
    public void iAmOnProductDetailsPageAndVerifyTheURL() {
        Assert.assertTrue(new ProductDetailsPage().verifyTheURL().contains("https://automationexercise.com/product_details/1"));
    }

    @And("I should see product name {string}")
    public void iShouldSeeProductName(String pName) {
        Assert.assertEquals(new ProductDetailsPage().getProductName(), pName);
    }

    @And("I should see category {string}")
    public void iShouldSeeCategory(String category) {
        Assert.assertEquals(new ProductDetailsPage().getProductCategory(), category);
    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String price) {
        Assert.assertEquals(new ProductDetailsPage().getProductPrice(), price);
    }

    @And("I should see availability {string}")
    public void iShouldSeeAvailability(String avail) {
        Assert.assertEquals(new ProductDetailsPage().getProductAvailability(), avail);
    }

    @And("I should see condition {string}")
    public void iShouldSeeCondition(String condition) {
        Assert.assertEquals(new ProductDetailsPage().getProductCondition(), condition);
    }

    @And("I should see brand {string}")
    public void iShouldSeeBrand(String brand) {
        Assert.assertEquals(new ProductDetailsPage().getProductBrand(), brand);
    }

    @When("I am able to click on {string}")
    public void iAmAbleToClickOnProduct(String product) {
        new ProductPage().clickOnProductsTab();
    }

    @Then("I am able to see {string} is displayed")
    public void iAmAbleToSeeALLProductsIsDisplayed(String expectedText) {
        Assert.assertEquals(new ProductPage().getAllProductText(), expectedText);
    }

    @And("I enter Product name 'Men t-shirt on  search field")
    public void iEnterProductNameMenTShirtOnSearchField(String pName) {
        new ProductPage().sendTextToSearchBar(pName);
    }

    @And("I click on 'search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();
    }

    @And("Verify {string} on the Page")
    public void verifySEARCHPRODUCTSOnThePage(String  expectedText) {
        Assert.assertEquals(new ProductPage().getSearchedProductsText(), expectedText);
    }

    @And("I am able to see product {string}")
    public void iAmAbleToSeeProductMenTShirt(String pName ) {
        Assert.assertEquals(new ProductPage().getSearchedProductName(), pName);
    }


    @Then("I add product {string} to the cart")
    public void iAddProductToTheCart(String product) {
        new ProductPage() .mouseHoverAndClickAddToCartOnProduct(product);
    }

    @And("I click on continue shopping link")
    public void iClickOnContinueShoppingLink() {
        new ShoppingCartPage().clickOnContinueShoppingLink(); 
    }

    @And("I click on view cart in popup")
    public void iClickOnViewCartInPopup() {
        new ShoppingCartPage().clickOnViewCartLink(); 
    }

    @Then("I verify the product {string} in shopping cart")
    public void iVerifyTheProductInShoppingCart(String pName ) {
        new ShoppingCartPage().getProductNameFromCart(pName);
    }

    @And("I increase the quantity {string}")
    public void iIncreaseTheQuantity(String quantity) {
        new ProductDetailsPage().sendQuantity(quantity );
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage().clickOnAddToCartButton(); 
    }

    @And("I click on view cart link in success message")
    public void iClickOnViewCartLinkInSuccessMessage() {
        new ProductDetailsPage().clickOnViewCartLinkInSuccessMessage();
        
    }

    @And("I should see quantity {string}")
    public void iShouldSeeQuantity(String arg0) {
    }

    @Then("I click on cross button to remove the product from the cart")
    public void iClickOnCrossButtonToRemoveTheProductFromTheCart() {
        new ShoppingCartPage().clickOnCrossButtonAcrossProductToRemove();
    }

    @Then("I click on {string} category")
    public void iClickOnCategory(String category ) {
        new ShoppingCartPage().clickOnCategory(category);

    }

    @And("I click on {string} in women category")
    public void iClickOnInWomenCategory(String subCategory ) {
        new ProductPage().clickOnSubCategoryOfWomen(subCategory);
    }

    @And("I should see {string} page title")
    public void iShouldSeePageTitle(String expectedTitle) {
        Assert.assertEquals(new ProductPage().getSubMenuPageTitle(), expectedTitle);
    }

    @And("I click on {string} in men category")
    public void iClickOnInMenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfMen(subCategory);
    }

    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar(String expectedTitle) {
        Assert.assertEquals(new ProductPage().getBrandsText(),expectedTitle);
    }

    @And("Click on {string} brand name")
    public void clickOnBrandName(String Polo ) {
        new ProductPage().clickOnBrandName();
    }

    @And("On left side bar, click on {string} brand link")
    public void onLeftSideBarClickOnBrandLink(String Biba) {
    }

    @And("I enter product name {string} in search bar")
    public void iEnterProductNameInSearchBar(String pName) {
        new ProductPage().sendTextToSearchBar(pName);
    }


    @And("I should see the text {string} on the page")
    public void iShouldSeeTheTextOnThePage(String expectedText) {
        Assert.assertEquals(new ProductPage().getSearchedProductsText(), expectedText);
    }

    @And("I click on review submit button")
    public void iClickOnReviewSubmitButton() {
        new ProductDetailsPage().clickOnReviewSubmitButton();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        Assert.assertEquals(new ProductDetailsPage().getThankYouForReviewMessage(), message);
    }
    @When("I scroll down up to recommended items text")
    public void iScrollDownUpToRecommendedItemsText() {
        new HomePage().scrollDownToRecommendedItems();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new HomePage().getRecommendedItemText(), expectedText);
    }

    @And("I add to cart {string} product from recommended items")
    public void iAddToCartProductFromRecommendedItems(String pName ) {
        new HomePage().clickAddToCartOnRecommendedItems(pName);
    }

    @And("I click on register link")
    public void iClickOnRegisterLink() {
        new ShoppingCartPage().clickOnRegisterLoginLink();
    }

    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new CheckOutPage() .clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I scroll up")
    public void iScrollUp() {
        new HomePage().scrollUp();
    }
}
