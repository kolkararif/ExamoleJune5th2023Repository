package com.sgtesting.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	public static WebDriver oBrowser=null;
	/**
	 * I launch the Chrome Browser
	 */
	@Given("^I launch the Chrome Browser$")
	public void I_launch_the_Chrome_Browser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I navigate the Application
	 */
	@And("^I navigate the Application$")
	public void I_navigate_the_Application()
	{
		try
		{
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the username in username text field
	 */
	@When("^I enter the username in username text field$")
	public void I_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the password in password text field
	 */
	@And("^I enter the password in password text field$")
	public void I_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on Login button
	 */
	@And("^I click on Login button$")
	public void I_click_on_Login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I find the Home page
	 */
	@Then("^I find the Home page$")
	public void I_find_the_Home_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I minimize flyout window
	 */
	@And("^I minimize flyout window$")
	public void I_minimize_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on Logout link
	 */
	@When("^I click on Logout link$")
	public void I_click_on_Logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I find the login page
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I close the Application
	 */
	@And("^I close the Application$")
	public void I_close_the_Application()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on Users link
	 */
	
	@When("^I click on Users link$")
	public void I_click_on_Users_link()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I find the User List page
	 */
	
	@Then ("^I find the User List page$")
	public void I_find_the_User_List_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='User List']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on Add User button
	 */
	
	@When ("^I click on Add User button$")
	public void I_click_on_Add_User_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()=\"Add User\"]")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I find the Account Information page
	 */
	
	@Then ("^I find the Account Information page$")
	public void I_find_the_Account_Information_page()
	{
		try
		{
			WebElement oEle1=oBrowser.findElement(By.id("userDataLightBox_accountInformationSection"));
			Assert.assertTrue(oEle1.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the First Name in First Name text field
	 */
	
	@And ("^I enter the First Name in First Name text field$")
	public void I_enter_the_First_Name_in_First_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the Last Name in Last Name text field
	 */
	
	@And ("^I enter the Last Name in Last Name text field$")
	public void I_enter_the_Last_Name_in_Last_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the Email Id in Email text field
	 */
	
	@And ("^I enter the Email Id in Email text field$")
	public void I_enter_the_Email_Id_in_Email_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("email")).sendKeys("arif.kolkar@gmail.com");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the Username in Username text field under Login Details
	 */
	
	@And ("^I enter the Username in Username text field under Login Details$")
	public void I_enter_the_Username_in_Username_text_field_under_Login_Details()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1demo1");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the Password in Password text field under Login Details
	 */
	
	@And ("^I enter the Password in Password text field under Login Details$")
	public void I_enter_the_Password_in_Password_text_field_under_Login_Details()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("mani1234");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the Password in Retype Password text field under Login Details
	 */
	
	@And ("^I enter the Password in Retype Password text field under Login Details$")
	public void I_enter_the_Password_in_Retype_Password_text_field_under_Login_Details()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("mani1234");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on Create User button
	 */
	
	@And ("^I click on Create User button$")
	public void I_click_on_Create_User_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()=\"Create User\"]")).click();
			Thread.sleep(5000);			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I find the created user in User List
	 */
	
	@Then ("^I find the created user in User List$")
	public void I_find_the_created_user_in_User_List()
	{
		try
		{
			WebElement oEle2=oBrowser.findElement(By.xpath("//span[text()=\"Demo1, User1\"]"));
			Assert.assertTrue(oEle2.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on user from User List which I want to delete
	 */
	
	@When ("^I click on user from User List which I want to delete$")
	public void I_click_on_user_from_User_List_which_I_want_to_delete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()=\"Demo1, User1\"]")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on Delete User button
	 */
	
	@When ("^I click on Delete User button$")
	public void I_click_on_Delete_User_button()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I find (Are you sure you want to delete this user account?) alert
	 */
	
	@Then ("^I find Are you sure you want to delete this user account alert$")
	public void I_find_Are_you_sure_you_want_to_delete_this_user_account_alert()
	{
		String expected,actual;
		try
		{
			expected="Are you sure you want to delete this user account?";
			Alert oAlert=oBrowser.switchTo().alert();
			actual=oAlert.getText();
			Assert.assertEquals(expected, actual);
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I accept the Alert
	 */
	
	@When ("^I accept the Alert$")
	public void I_accept_the_Alert()
	{
		try
		{
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I do not find the deleted user in User List
	 */
	
	@Then ("^I do not find the deleted user in User List$")
	public void I_do_not_find_the_deleted_user_in_User_List()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()=\"Demo1, User1\"]"));
			Assert.assertFalse(oEle.isDisplayed());
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on user from User List which I want to modify
	 */
	
	@When ("^I click on user from User List which I want to modify$")
	public void I_click_on_user_from_User_List_which_I_want_to_modify()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()=\"Demo1, User1\"]")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the New Password in Password text field under Login Details
	 */
	
	@When ("^I enter the New Password in Password text field under Login Details$")
	public void I_enter_the_New_Password_in_Password_text_field_under_Login_Details()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("mani2345");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I enter the New Password in Retype Password text field under Login Details
	 */
	
	@And ("^I enter the New Password in Retype Password text field under Login Details$")
	public void I_enter_the_New_Password_in_Retype_Password_text_field_under_Login_Details()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("mani2345");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * I click on Save Changes button
	 */
	
	@Then ("^I click on Save Changes button$")
	public void I_click_on_Save_Changes_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()=\"Save Changes\"]")).click();
			Thread.sleep(5000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click the Task Button
	 */
	@Then("^I click the Task Button$")
	public void I_click_the_Task_Button()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I click the Add New button
	 */
	@And("^I click the Add New button$")
	public void I_click_the_Add_New_button()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  I find New Customer clickon it
	 */
	@Then("^I find New Customer clickon it$")
	public void I_find_New_Customer_clickon_it()
	{
		try {
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I enter the customerName
	 */
	@Then("^I enter the customerName$")
	public void I_enter_the_customerName()
	{
		try {
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("sampath");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I enter Description details
	 */
	@And("^I enter Description details$")
	public void I_enter_Description_details()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_descriptionField\"]")).sendKeys("customer created successfully");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I save The CreateCustomer successfully
	 */
	@And("^I save The CreateCustomer successfully$")
	public void I_save_The_CreateCustomer_successfully()
	{
		try {
			oBrowser.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I click on customer Name
	 */
	@Then("^I click on customer Name$")
	public void I_click_on_customer_Name()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  I enter the Action button
	 */
	@And("^I enter the Action button$")
	public void I_enter_the_Action_button()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I get delete button
	 */
	@And("^I get delete button$")
	public void I_get_delete_button()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I get the delete permanently button
	 */
	@And("^I get the delete permanently button$")
	public void I_get_the_delete_permanently_button()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * I click On Customer name
	 */
	@And("^I click On Customer name$")
	public void I_click_On_Customer_name()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I clear the Description
	 */
	@And("^I clear the Description$")
	public void I_clear_the_Description()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I enter the New Description
	 */
	@And("^I enter the New Description$")
	public void I_enter_the_New_Description()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("nhgytrgfa");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I Modify the customer details successfully
	 */
	@And("^I Modify the customer details successfully$")
	public void I_Modify_the_customer_details_successfully()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[1]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *I click Addnew Button
	 */
	@Then("^I click Addnew Button$")
	public void I_click_Addnew_Button()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I create a New Project
	 */
	@And("^I create a New Project$")
	public void  I_click_on_New_Project()
	{
		try {
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I enter project name
	 */
	@And("^I enter project name$")
	public void I_enter_the_Project_name()
	{
		try {
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("ChikkabalapuraProject");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I enter project description
	 */
	@And("^I enter project description$")
	public void I_enter_project_description()
	{
		try {
			oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("Isha foundation Project");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *I save the Project successfully
	 */
	@And("^I saved the project succesfully$")
	public void I_save_the_Project_successfully()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I click on the Project Name
	 */
	@Then("^I click on the Project Name$")
	public void  I_click_on_the_Project_Name()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Action option
	 */
	@And("^I click on Action option$")
	public void  I_click_on_Action_option()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I click on delete button
	 */
	@And("^I click on delete button$")
	public void  click_on_delete_button()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I click on delete permanently
	 */
	@And("^I click on delete permanently$")
	public void  I_click_on_delete_permanently()
	{
		try {
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Customer Name
	 */
	@Then("^I click on Customer Name$")
	public void I_click_on_Customer_Name()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  I click on the Action option
	 */
	@And("^I click on the Action option$")
	public void I_click_on_the_Action_option()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * I get Delete project option
	 */
	@And("^I get Delete project option$")
	public void I_get_Delete_project_option()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * I get the Delete project Permanently option
	 */
	@And("^I get the Delete project Permanently option$")
	public void  I_get_the_Delete_project_Permanently_option()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  I click on the ProjectName
	 */
	@Then("^I click on the ProjectName$")
	public void  I_click_on_the_ProjectName()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			 Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I click on the ProjectName
	 */
	@And("^I clear project description$")
	public void  I_clear_project_description()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
			 Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  I enter new project description
	 */
	@And("^I enter new project description$")
	public void  I_enter_new_project_description()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("Institute Project");
			 Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  I click on create project successfully
	 */
	@And("^I click on create project successfully$")
	public void  I_mclick_on_create_project_successfully()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")).click();
			 Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}