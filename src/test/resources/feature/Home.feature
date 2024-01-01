
Feature: Homepage feature
  As a User I am able to subscribe in homePage

#  Test Case 10
  Background:
    Given I am on homepage and verify the homepage URL
@author_SG @smoke @regression
Scenario: User should Verify Subscription in home page
When      I scroll down up to subscription link
Then      I enter email on email field
And       I click on arrow button
And       I should see the success subscription message "You have been successfully subscribed!"

#  Test Case 11
@author_SG @sanity @smoke
Scenario: User should verify Subscription in Cart page
When      I click on 'cart' option
Then      I click on 'subscription' button
And       I able to enter 'email' on email field
And       I able to click on arrow button
And       "You have been successfully subscribed!" text is displayed

#  Test Case 25
@author_SG @smoke @sanity
Scenario: User should scroll down and scroll up using Arrow button at bottom right corner
When      I scroll down up to subscription link
Then      I should see the subscription "SUBSCRIPTION" text
And       I able to click on arrow button
And       I should see the message "Full-Fledged practice website for Automation Engineers"

#  Test Case 26
@author_SG @sanity
Scenario:User should scroll down and scroll up without Arrow button
When     I scroll down up to subscription link
Then     I should see the subscription "SUBSCRIPTION" text
And      I scroll up
And      I should see the message "Full-Fledged practice website for Automation Engineers"


