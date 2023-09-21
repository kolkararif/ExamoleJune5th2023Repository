#Author:
#Functionality:
#Feature Description:
#Feature Name:
Feature: Verify the Create User functionality

Scenario: Create User with valid data
Given I launch the Chrome Browser
And I navigate the Application
When I enter the username in username text field
And I enter the password in password text field
And I click on Login button
Then I find the Home page
And I minimize flyout window

Then I click the Task Button
And I click the Add New button
Then I find New Customer clickon it
And I enter the customerName
And I enter Description details
Then I save The CreateCustomer successfully
Then I click on customer Name
And I enter the Action button
And I get delete button
And I get the delete permanently button
When I click on Logout link
Then I find the login page
And I close the Application
