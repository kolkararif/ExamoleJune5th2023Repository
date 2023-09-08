package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyUser {
	public  ModifyUser(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	private WebElement username;
	WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement LoginButton;
	public WebElement getLoginButton()
	{
		return  LoginButton;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement Createuser;
	public WebElement getCreateuser()
	{
		return Createuser;
	}
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement Adduser;
	public WebElement  Adduser()
	{
		return  Adduser;
	}
	private WebElement firstName;
	public WebElement getFirstname()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement getLastname()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getRepassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement UserCreated;
	public WebElement getUserCreated()
	{
		return UserCreated;
	}
	@FindBy(xpath="//span[text()='kolkar, arif']")
	private WebElement CreatedUserName;
	public WebElement getCreatedUserName()
	{
		return CreatedUserName;
	}
	private WebElement password ;
	public WebElement getmodifiedpassword1()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement getmodifiedtRepassword()
	{
		return passwordCopy;
	}
	private WebElement userDataLightBox_commitBtn;
	public WebElement savechanges()
	{
		return userDataLightBox_commitBtn;
	}
	@FindBy(xpath="//span[text()='kolkar, arif']")
	private WebElement CreatedUserName1;
	public WebElement getCreatedUserName2()
	{
		return CreatedUserName;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deleteuser()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(linkText="Logout")
	private WebElement LogoutButton;
	public WebElement LogoutButton()
	{
		return LogoutButton;
	}


	private WebElement close;
	public WebElement Close()
	{
		return Close();
	}
}






