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

Then I click Addnew Button
And I create a New Project
And I enter project name
And I enter project description
And I saved the project succesfully

Then I click on the ProjectName
And I clear project description
And I enter new project description
And I click on create project successfully



Then I click on the Project Name
And I click on Action option
And I click on delete button
And I click on delete permanently

Then I click on Customer Name
And I click on the Action option
And I get Delete project option
And I get the Delete project Permanently option
When I click on Logout link
Then I find the login page
And I close the Application
