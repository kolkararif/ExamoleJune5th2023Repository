package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MOdifyUser_Mainclass {
	public static WebDriver oBrowser=null;
	public static ModifyUser oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createuser();
		ModifyUser();
		DeleteUser();
		// Logout();
		// Close();
	}

	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oPage=new ModifyUser(oBrowser);
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
	private static void Createuser()
	{
		try
		{
			oPage.getCreateuser().click();
			Thread.sleep(2000);
			oPage.Adduser().click();
			Thread.sleep(2000);
			oPage.getFirstname().sendKeys("arif");
			Thread.sleep(2000);
			oPage.getLastname().sendKeys("kolkar");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("arif.kolkar@gmail.com");
			Thread.sleep(2000);
			oPage. getusername().sendKeys("arif1");
			Thread.sleep(2000);
			oPage. getpassword().sendKeys("kolkar1");
			Thread.sleep(2000);
			oPage.getRepassword().sendKeys("kolkar1");
			Thread.sleep(2000);
			oPage.getUserCreated().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void ModifyUser()
	{
		try
		{
			oPage.getCreatedUserName().click();
			Thread.sleep(2000);
			oPage.getmodifiedpassword1().sendKeys("simmu");
			Thread.sleep(2000);
			oPage.getmodifiedtRepassword().sendKeys("simmu");
			Thread.sleep(2000);
			oPage.savechanges().click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try
		{
			oPage.getCreatedUserName2().click();
			Thread.sleep(2000);
			oPage.deleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			Thread.sleep(2000);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			oPage.LogoutButton().click();
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


		
			
			
			
			
				
			
		




