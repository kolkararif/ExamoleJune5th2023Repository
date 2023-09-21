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
When I click on Users link
Then I find the User List page
When I click on Add User button
Then I find the Account Information page
And I enter the First Name in First Name text field
And I enter the Last Name in Last Name text field
And I enter the Email Id in Email text field
And I enter the Username in Username text field under Login Details
And I enter the Password in Password text field under Login Details
And I enter the Password in Retype Password text field under Login Details
And I click on Create User button
Then I find the created user in User List
When I click on user from User List which I want to delete
Then I find the Account Information page
When I click on Delete User button
Then I find Are you sure you want to delete this user account alert
When I accept the Alert
Then I do not find the deleted user in User List
And I find the User List page
When I click on Logout link
Then I find the login page
And I close the Application
