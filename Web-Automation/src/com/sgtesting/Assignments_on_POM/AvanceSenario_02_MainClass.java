package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvanceSenario_02_MainClass {
	public static WebDriver oBrowser=null;
	public static Advance_Senario_01 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createuser1();
		Logout_01();
		loginasUser1();
		createuser2();
		Logout_02();
		 loginasUser2();
		 createuser3();
		 Logout_03();
		 loginasUser3();
		 Logout_04();
		 loginasUser22();
		 modifypassword();Logout_05();
		 loginasUser4();Logout_06();
		
	}
		private static void launchBrowser()
		{
			try
			{
				oBrowser=new ChromeDriver();
				oPage=new Advance_Senario_01(oBrowser);
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
		private static void Createuser1()
		{
			try
			{
				oPage.getCreateuser().click();
				Thread.sleep(2000);
				oPage.Adduser().click();
				Thread.sleep(2000);
				oPage.getFirstname().sendKeys("ARIF");
				Thread.sleep(2000);
				oPage.getLastname().sendKeys("KOLKAR");
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
			}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		private static void Logout_01()
		{
			try {
				oPage.LogoutButton().click();
				Thread.sleep(2000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void loginasUser1()
		{
			try
			{
				oPage.getUserName().sendKeys("arif1");
				oPage.getPassword().sendKeys("kolkar1");
				oPage.getLoginButton().click();
				Thread.sleep(4000);
				oPage.getexp().click();
				Thread.sleep(4000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void createuser2()
		{
			try
			{
		oPage.Adduser2().click();
		Thread.sleep(2000);
		oPage.getFirstname2().sendKeys("HARI");
		Thread.sleep(2000);
		oPage.getLastname2().sendKeys("PRASAD");
		Thread.sleep(2000);
		oPage.getemail2().sendKeys("arif.kolkar@gmail.com");
		Thread.sleep(2000);
		oPage. getusername2().sendKeys("HARI1");
		Thread.sleep(2000);
		oPage. getpassword2().sendKeys("PRASAD1");
		Thread.sleep(2000);
		oPage.getRepassword2().sendKeys("PRASAD1");
		Thread.sleep(2000);
		oPage.getUserCreated2().click();
		Thread.sleep(2000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void Logout_02()
		{
			try {
				oPage.LogoutButton().click();
				Thread.sleep(2000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void loginasUser2()
		{
			try
			{
				oPage.getUserName().sendKeys("HARI1");
				oPage.getPassword().sendKeys("PRASAD1");
				oPage.getLoginButton().click();
				Thread.sleep(4000);
				oPage.getexp2().click();
				Thread.sleep(4000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void createuser3()
		{
			try
			{
		oPage.Adduser3().click();
		Thread.sleep(2000);
		oPage.getFirstname3().sendKeys("VIJAY");
		Thread.sleep(2000);
		oPage.getLastname3().sendKeys("KUMAR");
		Thread.sleep(2000);
		oPage.getemail3().sendKeys("arif.kolkar@gmail.com");
		Thread.sleep(2000);
		oPage. getusername3().sendKeys("VIJAY1");
		Thread.sleep(2000);
		oPage. getpassword3().sendKeys("KUMAR1");
		Thread.sleep(2000);
		oPage.getRepassword3().sendKeys("KUMAR1");
		Thread.sleep(2000);
		oPage.getUserCreated3().click();
		Thread.sleep(2000);
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
			
		
private static void Logout_03()
{
	try {
		oPage.LogoutButton().click();
		Thread.sleep(2000);

	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void loginasUser3()
{
	try
	{
		oPage.getUserName().sendKeys("VIJAY1");
		oPage.getPassword().sendKeys("KUMAR1");
		oPage.getLoginButton().click();
		Thread.sleep(4000);
		oPage.getexp3().click();
		Thread.sleep(4000);
		
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
private static void Logout_04()
{
	try {
		oPage.LogoutButton_04().click();
		Thread.sleep(2000);

	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void loginasUser22()
{
	try
	{
		oPage.getUserName().sendKeys("HARI1");
		oPage.getPassword().sendKeys("PRASAD1");
		oPage.getLoginButton().click();
		Thread.sleep(4000);
		oPage.getexp2().click();
		Thread.sleep(4000);
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
private static void modifypassword()
{
	try
{
	oPage.getuserco2().click();
	Thread.sleep(2000);
	oPage.getpasswor3().clear();
	Thread.sleep(2000);
	oPage.getpasswor4().sendKeys("manj");
	Thread.sleep(2000);
	oPage.passwordCop3().sendKeys("manj");
	Thread.sleep(2000);
	oPage.getSavecop3().click();
	Thread.sleep(4000);
} catch (Exception e) {
	e.printStackTrace();
}

}
private static void Logout_05()
{
	try {
		oPage.LogoutButton_04().click();
		Thread.sleep(2000);

	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void loginasUser4()
{
	try
	{
		oPage.getUserName().sendKeys("VIJAY1");
		oPage.getPassword().sendKeys("KUMAR1");
		oPage.getLoginButton().click();
		Thread.sleep(4000);
		oPage.getexp3().click();
		Thread.sleep(4000);
		
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
private static void Logout_06()
{
	try {
		oPage.LogoutButton_06().click();
		Thread.sleep(2000);

	} catch (Exception e) {
		e.printStackTrace();
	}
}

	
}
	