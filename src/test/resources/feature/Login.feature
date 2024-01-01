
Feature: Login functionality
  As a user I should be able to Login successfully

  Background:
    Given I am on homepage and verify the homepage URL
#Test Case 1
  @author_SG @sanity
  Scenario:Verify that user can register successfully
    When   Click 'Signup' button
    And    Verify 'New User Signup!' is visible
    Then   Enter name and email address
    And    Click 'signup' Link
    And    Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And    I fill all details in signup page "Mrs" "Friends244@gmail.com" "10" "June" "1998" "Friends" "Smith" "Raja Park" "Jaipur" "India" "Rajasthan" "Jaipur" "302004" "0985645678"
    And    Click 'Create Account button'
    And    Verify that 'ACCOUNT CREATED!' is Displayed
    And    Click Continue button
    And    Verify that 'Logged in as username' is displayed
#    And    I click On 'Delete Account' button
#    And    Verify that 'ACCOUNT DELETED!'text is displayed
#    And    click 'Continue' LINK
#Test Case 2
  @author_SG @sanity @smoke
  Scenario: User should login successfully with correct email and password
   When       Click on 'Login' link
   And        Verify 'Login to your account' is displayed
   And        I Enter correct 'email' for login
   And        I enter correct 'password' for login
   And        Click 'login' tab

#Test Case 3
   @author_SG @smoke
   Scenario: User should not login successfully with incorrect email and password
    When    click on 'signup' link
    Then    Verify 'Login to your account' text is visible
    And     I Enter incorrect 'email' for login
    And     I enter incorrect 'password' for login
    And     I click on 'Login' link
    And     Verify error 'Your email or password is incorrect!' is visible
# Test Case 4
    @author_SG @sanity @smoke
    Scenario: User should logout successfully
     When   I click on 'signup' tab
     Then   'Login To your Account' message is visible
     And    I am able to enter correct 'emailId' on login field
     And    I am able to enter correct 'password'
     And    I am able to click on 'login' button
     Then   'Logged in as username' message is displayed
     And    I am able to click on 'logout' tab
     And    And I am on login page and verify the login URL

# Test Case 23
  @author_SG @sanity
  Scenario: User can verify address details successfully
    When   Click 'Signup' button
    And    Verify 'New User Signup!' is visible
    Then   Enter name and email address
    And    Click 'signup' Link
    And    Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And    I fill all details in signup page "Mrs" "Friends244@gmail.com" "10" "June" "1998" "Friends" "Smith" "Raja Park" "Jaipur" "India" "Rajasthan" "Jaipur" "302004" "0985645678"
    And    Click 'Create Account button'
    And    Verify that 'ACCOUNT CREATED!' is Displayed
    And    Click Continue button
    And    Verify that 'Logged in as username' is displayed
    And    I click on 'cart' option
    And    I click on Proceed to Checkout button
    Then   Then I should see the delivery address is same address filled at the time registration of account "Raja Park"
    And    I should see billing address is same address filled at the time registration of account "Raja Park"







