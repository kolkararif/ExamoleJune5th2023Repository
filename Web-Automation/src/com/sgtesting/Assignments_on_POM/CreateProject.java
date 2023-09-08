package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProject {
	public CreateProject(WebDriver oBrowser)
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
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
	private WebElement ClickTask;
	public WebElement getTaskButton()
	{
		return  ClickTask;
	}
	@FindBy(xpath="//div[@*='addNewButton']")
	private WebElement AddTask;
	public WebElement getAddTaskButton()
	{
		return  AddTask;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement AddCustomer;
	public WebElement getAddCustomer()
	{
		return  AddCustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getName()
	{
		return customerLightBox_nameField;
	}
	private WebElement customerLightBox_descriptionField;
	public WebElement getDescription()
	{
		return customerLightBox_descriptionField;
	}
	@FindBy(xpath="//div[@*='customerLightBox_commitBtn']")
	private WebElement CustomerCreated;
	public WebElement getCustomerCreated()
	{
		return  CustomerCreated;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addnew;
	public WebElement getaddnew()
	{
		return addnew;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement NewProject;
	public WebElement getProject()
	{
		return NewProject;
	}
	@FindBy(xpath="//*[@id=\"projectPopup_projectNameField\"]")
	private WebElement name;
	public WebElement getname()
	{
		return name;
	}
	@FindBy(xpath="//*[@id=\"projectPopup_projectDescriptionField\"]")
	private WebElement description;
	public WebElement getdesc()
	{
		return description;
	}
	@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
	private WebElement CreateProject;
	public WebElement getproject()
	{
		return CreateProject;
	}
	//create webelement for deleteproject
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement ed;
	public WebElement geted()
	{
		return ed;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement ac;
	public WebElement getac()
	{
		return ac;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement del;
	public WebElement getdel()
	{
		return del;
	}
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getcodel()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	//create webelement for deletecustomer 
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement edi;
	public WebElement getedi()
	{
		return edi;
	}
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement Actionbutton;
	public WebElement getAction()
	{
		return Actionbutton;
	}
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement delete;
	public WebElement getDelete()
	{
		return delete;
	}
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getConfirm()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}
    	
	private WebElement close;
	public WebElement Close()
	{
		return close;
	}
	

}
