package com.sgtesting.Assignments_on_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceSenario_01_MainClass {
	public static WebDriver oBrowser=null;
	public static Advance_Senario_01 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createuser123();
		Logout_01();
		loginasUser1();Logout_02();
		loginasUser2();Logout_03();
		 loginasUser3(); Logout_04();
		 login3();
		 Modifyu1();Logout_05();
		 loginasUser11();Logout_06();
		 loginasUser22();Logout_07();
		 loginasUser33();Logout_08();
		 LoginasAdmin();Logout_09();
		 
		 
		//Delete();
		 //Logout();
		// Close();
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
	private static void Createuser123()
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
			/////////////////////////////////////////////////////
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
			//////////////////////////////////
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
	private static void Logout_02()
	{
		try {
			oPage.LogoutButton_02().click();
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
	private static void Logout_03()
	{
		try {
			oPage.LogoutButton_03().click();
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
	private static void login3()
	{
		try
		{
			oPage.getuserad().sendKeys("admin");
			oPage.getPasswo().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void Modifyu1()
	{
		try {
			oPage.getuser1().click();
			Thread.sleep(2000);
			oPage.getuserco().click();
			Thread.sleep(2000);
			oPage.getUSER1password().clear();
			Thread.sleep(2000);
			oPage.getpassword4().sendKeys("5678");
			Thread.sleep(2000);
			oPage.passwordCopy3().sendKeys("5678");
			Thread.sleep(2000);
			oPage.getSavecopy3().click();
			Thread.sleep(4000);
			///////////////////////////////////////////////////////
			oPage.getuserco1().click();
			Thread.sleep(2000);
			oPage.getpassword6().clear();
			Thread.sleep(2000);
			oPage.getpassword5().sendKeys("5678");
			Thread.sleep(2000);
			oPage.passwordCopy4().sendKeys("5678");
			Thread.sleep(2000);
			oPage.getSavecopy4().click();
			Thread.sleep(4000);
		//////////////////////////////////////////////////////////////	
			oPage.getuserco1().click();
			Thread.sleep(2000);
			oPage.getpassword6().clear();
			Thread.sleep(2000);
			oPage.getpassword5().sendKeys("xyz");
			Thread.sleep(2000);
			oPage.passwordCopy4().sendKeys("xyz");
			Thread.sleep(2000);
			oPage.getSavecopy4().click();
			Thread.sleep(4000);
		/////////////////////////////////////////////////////
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
			oPage.LogoutButton_05().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasUser11()
	{
		try
		{
			oPage.getUserName111().sendKeys("arif1");
			oPage.getPassword111().sendKeys("kolkar1");
			oPage.getLoginButton111().click();
			Thread.sleep(4000);
			oPage.getexp111().click();
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
	private static void loginasUser22()
	{
		try
		{
			oPage.getUserName222().sendKeys("HARI1");
			oPage.getPassword222().sendKeys("PRASAD1");
			oPage.getLoginButton222().click();
			Thread.sleep(4000);
			oPage.getexp222().click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Logout_07()
	{
		try {
			oPage.LogoutButton_06().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasUser33()
	{
		try
		{
			oPage.getUserName333().sendKeys("VIJAY1");
			oPage.getPassword333().sendKeys("KUMAR1");
			oPage.getLoginButton333().click();
			Thread.sleep(4000);
			oPage.getexp333().click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Logout_08()
	{
		try {
			oPage.LogoutButton_08().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LoginasAdmin()
	{
		try {
			oPage.getuserad11().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getPasswo44().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin11().click();
			Thread.sleep(2000);	


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void deleteu1()
	{
		try {
			oPage.getuser2().click();
			Thread.sleep(2000);
			oPage.getuserco3().click();
			Thread.sleep(2000);
			oPage.getdelete().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			oPage.getuserco4().click();
			Thread.sleep(2000);
			oPage.getdelete1().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			oPage.getuserco5().click();
			Thread.sleep(2000);
			oPage.getdelete2().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Logout_09()
	{
		try {
			oPage.getLogoutButton_09().click();
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

			

	