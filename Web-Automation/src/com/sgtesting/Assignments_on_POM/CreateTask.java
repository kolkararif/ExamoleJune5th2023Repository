package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTask {
	public CreateTask(WebDriver oBrowser)
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
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement addTask;
	public WebElement getaddTask()
	{
		return addTask;
	}
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createTask;
	public WebElement getcreateTask()
	{
		return createTask;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement createTaskname1;
	public WebElement getcreateTaskname1()
	{
		return createTaskname1;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")
	private WebElement createTaskname2;
	public WebElement getcreateTaskname2()
	{
		return createTaskname2;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[3]/td[1]/input")
	private WebElement createTaskname3;
	public WebElement getcreateTaskname3()
	{
		return createTaskname3;
	}
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement TaskCreated;
	public WebElement getTaskCreated()
	{
		return TaskCreated;
	}
	// delete task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")
	private WebElement deletetask1;
	public WebElement getdeletetask1()
	{
		return deletetask1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement action1;
	public WebElement getaction1()
	{
		return action1;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement delete1;
	public WebElement getdelete1()
	{
		return delete1;
	}
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getdeleteper1()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement deletetask2;
	public WebElement getdeletetask2()
	{
		return deletetask2;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement action2;
	public WebElement getaction2()
	{
		return action2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement delete2;
	public WebElement getdelete2()
	{
		return delete2;
	}
	@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement deleteper2;
	public WebElement getdeleteper2()
	{
		return deleteper2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
	private WebElement deletetask3;
	public WebElement getdeletetask3()
	{
		return deletetask3;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement action3;
	public WebElement getaction3()
	{
		return action3;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement delete3;
	public WebElement getdelete3()
	{
		return delete3;
	}
	@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")
	private WebElement deleteper3;
	public WebElement getdeleteper3()
	{
		return deleteper3;
	}
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
	


