package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatTask_MainClass {
	public static WebDriver oBrowser=null;
	public static  CreateTask oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer();
		CreateProject();
		Createtask();
		Deletetask();
		deleteproject();
		deletecustomer();
		Logout();
		Close();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oPage=new  CreateTask(oBrowser);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try
		{
			oPage.getTaskButton().click();
			Thread.sleep(2000);
			oPage.getAddTaskButton().click();
			Thread.sleep(2000);
			oPage.getAddCustomer().click();
			Thread.sleep(2000);
			oPage.getName().sendKeys("arif");
			Thread.sleep(2000);
			oPage.getDescription().sendKeys("BWSSB Project");
			Thread.sleep(2000);
			oPage.getCustomerCreated().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.getProject().click();
			Thread.sleep(2000);
			oPage.getname().sendKeys("virtual cloude Project");
			Thread.sleep(2000);
			oPage.getdesc().sendKeys("backup storage device");
			Thread.sleep(2000);
			oPage.getproject().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}private static void Createtask()
	{
		try {
			oPage.getaddTask().click();
			Thread.sleep(2000);
			oPage.getcreateTask().click();
			Thread.sleep(2000);
			oPage.getcreateTaskname1().sendKeys("back up the bbmp files");
			Thread.sleep(2000);
			oPage.getcreateTaskname2().sendKeys("back up the bwssb files");
			Thread.sleep(2000);
			oPage.getcreateTaskname3().sendKeys("back up the bda files");
			Thread.sleep(2000);
			oPage.getTaskCreated().click();
			Thread.sleep(2000);

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Deletetask()
	{
		try {
			oPage.getdeletetask1().click();
			Thread.sleep(2000);
			oPage.getaction1().click();
			Thread.sleep(2000);
			oPage.getdelete1().click();
			Thread.sleep(2000);
			oPage.getdeleteper1().click();
			Thread.sleep(2000);
			oPage.getdeletetask2().click();
			Thread.sleep(2000);
			oPage.getaction2().click();
			Thread.sleep(2000);
			oPage.getdelete2().click();
			Thread.sleep(2000);
			oPage.getdeleteper2().click();
			Thread.sleep(2000);
			oPage.getdeletetask3().click();
			Thread.sleep(2000);
			oPage.getaction3().click();
			Thread.sleep(2000);
			oPage.getdelete3().click();
			Thread.sleep(2000);
			oPage.getdeleteper3().click();
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try {
			oPage.geted().click();
			Thread.sleep(2000);
			oPage.getac().click();
			Thread.sleep(2000);
			oPage.getdel().click();
			Thread.sleep(2000);
			oPage.getcodel().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			oPage.getedi().click();
			Thread.sleep(2000);
			oPage.getAction().click();
			Thread.sleep(2000);
			oPage.getDelete().click();;
			Thread.sleep(2000);
			oPage.getConfirm().click();;
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			oPage.getLogoutButton().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			oBrowser.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

			
		
}
