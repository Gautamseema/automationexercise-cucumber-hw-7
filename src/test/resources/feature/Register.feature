
Feature: Registration functionality
  As a User  I should be able to register successfully

  Background:
    Given I am on homepage and verify the homepage URL
# Test Case 5
@author_SG @sanity
Scenario: User should register successfully
When      click on 'signup'
Then      Identify 'New User Signup!' text is present
And       I send name 'Friends' to name field
And       I send existing 'email' to email field
And       I able to click on signup button
And       Verify error 'Email Address already exist!' is displayed
#Test Case 6
 @author_SG @smoke @sanity
Scenario: User should log the contact us form
When       Click on 'Contact Us' button
And        Verify 'contact us' text is displayed
Then       Verify 'GET IN TOUCH' should see
And         I enter 'name' to name field
And         I enter 'email' to email field
And         I enter 'subject' to subject field
And         I enter 'message' to message field
And         I upload file
And         I click on submit button
And         I click on ok button popup
Then        I should see the success message "Success! Your details have been submitted successfully."
And         I click on home button
#Test Case 7
@author_SG @sanity
Scenario:  User able to verify Test Page
When       I click on 'Test Cases'
Then       I am on text cases page and verify the test-cases URL "https://automationexercise.com/test_cases"

#  Test Case 14
@author_SG @sanity @smoke
Scenario: User should place Order: Register while Checkout
When      I add product "Blue Top" to the cart
And       I click on view cart in popup
And       I should see the welcome text on shopping cart page "Shopping Cart"
And       I click on Proceed to Checkout button
And       I click on register link in the checkout popup
And       I send name 'Friends' to name field
And       I send existing 'email' to email field
And       I able to click on signup button
And       I fill all details in signup page "Mrs" "Friends244@gmail.com" "10" "June" "1998" "Friends" "Smith" "Raja Park" "Jaipur" "India" "Rajasthan" "Jaipur" "302004" "0985645678"
And       Click 'Create Account button'
Then      Verify that 'ACCOUNT CREATED!' is Displayed
And       Click Continue button
And       Verify that 'Logged in as username' is displayed
And       I click on 'cart' option
And       I click on Proceed to Checkout button
And       I should see the text on checkout page "Review Your Order"
And       I should see the text on checkout page "Address Details"
And       I enter details into comment area "Please deliver it on time."
And       I click on place order button
And       I enter payment details "Friends Smith" "4233382630269399" "887" "02" and "2025"
And       I click on Pay and Confirm Order button
Then      I should see the order confirmation message "Congratulations! Your order has been confirmed!"
#And       I click on header menu option "Delete Account"
#Then      I should see the account deleted message "ACCOUNT DELETED!"
#Then      I click on continue button after deleting account

#  Test Case 15
@author_SG @sanity @smoke
Scenario: User should Place Order: Register before Checkout
When      Click 'Signup' button
Then      I send name 'Friends' to name field
And       I send existing 'email' to email field
And       I able to click on signup button
And       I fill all details in signup page "Mrs" "Friends244@gmail.com" "10" "June" "1998" "Friends" "Smith" "Raja Park" "Jaipur" "India" "Rajasthan" "Jaipur" "302004" "0985645678"
And       Click 'Create Account button'
And       Verify that 'ACCOUNT CREATED!' is Displayed
And       Click Continue button
And       Verify that 'Logged in as username' is displayed
And       I add product "Blue Top" to the cart
And       I click on view cart in popup
And       I should see the welcome text on shopping cart page "Shopping Cart"
And       I click on Proceed to Checkout button
And       I should see the text on checkout page "Review Your Order"
And       I should see the text on checkout page "Address Details"
And       I enter details into comment area "Please deliver it on time."
And       I click on place order button
And       I enter payment details "Friends Smith" "4233382630269399" "887" "02" and "2025"
And       I click on Pay and Confirm Order button
Then      I should see the order confirmation message "Congratulations! Your order has been confirmed!"
#And       I click on header menu option "Delete Account"
#Then      I should see the account deleted message "ACCOUNT DELETED!"
#Then      I click on continue button after deleting account

#  Test Case 16 @sanity @smoke
Scenario: User should place the order successfully : Login before Checkout
When      Click 'Signup' button
Then      Verify 'Login to your account' is displayed
And       I Enter correct 'email' for login
And       I enter correct 'password' for login
And       Click 'login' tab
And       Verify that 'Logged in as username' is displayed
And       I add product "Blue Top" to the cart
And       I click on view cart in popup
And       I should see the welcome text on shopping cart page "Shopping Cart"
And       I click on Proceed to Checkout button
And       I should see the text on checkout page "Review Your Order"
And       I should see the text on checkout page "Address Details"
And       I enter details into comment area "Please deliver it on time."
And       I click on place order button
And       I enter payment details "Friends Smith" "4233382630269399" "887" "02" and "2025"
And       I click on Pay and Confirm Order button
Then      I should see the order confirmation message "Congratulations! Your order has been confirmed!"
And       I am able to click on 'logout' tab

#  Test Case 17

@author_SG @sanity
Scenario: User should remove the product from cart
When      I add product "Blue Top" to the cart
And       I click on view cart in popup
And       I should see the welcome text on shopping cart page "Shopping Cart"
Then      I click on cross button to remove the product from the cart