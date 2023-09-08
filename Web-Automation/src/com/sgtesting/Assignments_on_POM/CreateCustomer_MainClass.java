package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer_MainClass {
	public static WebDriver oBrowser=null;
	public static CreateCustomer oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer();
		deletecustomer();
		Logout();
		Close();
	}
		private static void launchBrowser()
		{
			try
			{
				oBrowser=new ChromeDriver();
				oPage=new  CreateCustomer(oBrowser);
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
		private static void deletecustomer()
		{
			try {
				oPage.getedit().click();
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



