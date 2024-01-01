
Feature:  Product feature
  As a user,
  I should verify all products and product detail page

  Background:
    Given I am on homepage and verify the homepage URL
# Test Case -8
@author_SG @sanity @smoke
Scenario: User should verify All Products and product detail page
  When   I click on products tab
  Then   I should see text "ALL PRODUCTS" on product page
  And    I click on view product of first product "Blue Top"
  And    I am on product details page and verify the URL
  And    I should see product name "Blue Top"
  And    I should see category "Category: Women > Tops"
  And    I should see price "Rs. 500"
  And    I should see availability "Availability: In Stock"
  And    I should see condition "Condition: New"
  And    I should see brand "Brand: Polo"
#Test case -9
@author_SG @sanity @smoke
Scenario: User should search product
  When    I am able to click on 'Product'
  Then    I am able to see 'ALL Products' is displayed
  And     I enter Product name 'Men t-shirt on  search field
  And     I click on 'search button
  And     Verify 'SEARCH PRODUCTS' on the Page
  And     I am able to see product 'Men t-shirt'
#Test Case 12
@author_SG @sanity @smoke
Scenario: User able to add product in cart
When      I click on products tab
Then      I add product "Men t-shirt" to the cart
And       I click on continue shopping link
And       I add product "Blue Top" to the cart
And       I click on view cart in popup
Then      I verify the product "Blue Top" in shopping cart
Then      I verify the product "Men Tshirt" in shopping cart
#  Test Case 13
@author_SG @sanity @smoke
Scenario: User should verify product quantity in cart
When      I click on view product of first product "Blue Top"
Then      I am on product details page and verify the URL
And       I should see product name "Blue Top"
And       I should see category "Category: Women > Tops"
Then      I should see price "Rs. 500"
And       I should see availability "Availability: In Stock"
And       I should see condition "Condition: New"
And       I should see brand "Brand: Polo"
And       I increase the quantity "4"
And       I click on add to cart button
And       I click on view cart link in success message
And       I should see quantity "4"

#  Test case 18
@author_SG @sanity @smoke
Scenario: User should view category products
When      I click on products tab
Then      I click on "Women" category
And       I click on "Dress" in women category
And       I should see "WOMEN - DRESS PRODUCTS" page title
Then      I click on "Men" category
And       I click on "Tshirts" in men category
And       I should see "MEN - TSHIRTS PRODUCTS" page title

# Test Case 19
@author_SG @sanity @smoke
Scenario: User should view and cart brand products
When      I click on products tab
Then      Verify that Brands are visible on left side bar
And       Click on "Polo" brand name
#And       I should see "BRAND - POLO PRODUCTS" page title
And       On left side bar, click on "Biba" brand link
#And       I should see "BRAND - MADAME PRODUCTS" page title

#  Test case 20
@author_SG @smoke
Scenario: User should search product and verify cart after login
When      I click on products tab
Then      I should see text "ALL PRODUCTS" on product page
And       I enter product name "Men Tshirt" in search bar
And       I click on 'search' button
And       I should see the text "SEARCHED PRODUCTS" on the page
And       I add product "Men Tshirt" to the cart
And       I click on view cart in popup
And       I verify the product "Men Tshirt" in shopping cart
Then      Click 'Signup' button
And       I click on 'cart' option
Then      I verify the product "Men Tshirt" in shopping cart

#  Test Case 21
@author_SG @smoke @sanity
Scenario: User should add review on product
When      I click on products tab
Then      I should see text "ALL PRODUCTS" on product page
And       I click on view product of first product "Blue Top"
And       I send name 'Friends' to name field
And       I send existing 'email' to email field
And       I click on review submit button
Then      I should see "Thank you for your review." message

#  Test Case 22
@author_SG @smoke @sanity
Scenario: User should add to cart from recommended items
When      I scroll down up to recommended items text
Then      I should see "RECOMMENDED ITEMS" text
And       I add to cart "Stylish Dress" product from recommended items
And       I click on view cart in popup
Then      I verify the product "Stylish Dress" in shopping cart
# Test Case 24
@author_SG @smoke @sanity
Scenario: User should able to download Invoice after purchase order
When       I add product "Blue Top" to the cart
Then       I click on 'cart' option
And        I click on Proceed to Checkout button
And        I click on register link
And        I send name 'Friends' to name field
And        I send existing 'email' to email field
And        I able to click on signup button
And        I fill all details in signup page "Mrs" "Friends244@gmail.com" "10" "June" "1998" "Friends" "Smith" "Raja Park" "Jaipur" "India" "Rajasthan" "Jaipur" "302004" "0985645678"
And        Click 'Create Account button'
And        Verify that 'ACCOUNT CREATED!' is Displayed
And        Click Continue button
And        Verify that 'Logged in as username' is displayed
And        I should see the text on checkout page "Review Your Order"
And        I should see the text on checkout page "Address Details"
And        I enter details into comment area "Please deliver it on time."
And        I click on place order button
And        I enter payment details "Friends Smith" "4233382630269399" "887" "02" and "2025"
And        I click on Pay and Confirm Order button
Then       I should see the order confirmation message "Congratulations! Your order has been confirmed!"
And        I click on download invoice after order success

