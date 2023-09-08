package com.sgtesting.Assignments_on_Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_Senarrio_01 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		logout();
		loginasuser2();
		 logout1();
		 loginasuser1();
		 logout2();
		 loginasuser3();
		 logout3();
		 loginAsAdmin();
		 modifyuser();
		 logout4();
		 loginasuser11();logout11();loginasuser22();logout22();
         loginasuser33();logout33();loginAsAdmin1();Deleteuser();
         LogoutasAdmin();
         CloseApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		private static void navigate()
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

		private static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(5000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		private static void minimizeFlyOutWindow()
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
		private static void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//table[@id='topnav']/tbody/tr/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
				oBrowser.findElement(By.name("lastName")).sendKeys("User1");
				oBrowser.findElement(By.name("email")).sendKeys("arif.kolkar@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//table[@id='topnav']/tbody/tr/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
				oBrowser.findElement(By.name("lastName")).sendKeys("User2");
				oBrowser.findElement(By.name("email")).sendKeys("arif.kolkar@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser2");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//table[@id='topnav']/tbody/tr/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
				oBrowser.findElement(By.name("lastName")).sendKeys("User3");
				oBrowser.findElement(By.name("email")).sendKeys("arif.kolkar@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser3");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void logout()
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
		private static void loginasuser1()
		{
			try {
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
			private static void logout1()
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
		
		private static void loginasuser2()
		{
			try {
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void logout2()
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
		private static void loginasuser3()
		{
			try {
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void logout3()
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
		private static void loginAsAdmin()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(5000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void modifyuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			    Thread.sleep(2000);
			    oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("arif1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("arif1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			    Thread.sleep(2000);
			    oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("arif2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("arif2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			    Thread.sleep(2000);
			    oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("arif3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("arif3");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
				
			}
			catch (Exception e)
			{
				e.printStackTrace();	

			}

		}
		private static void logout4()
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
		private static void loginasuser11()
		{
			try {
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("arif1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(3000);
				//oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				//Thread.sleep(2000);
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
			private static void logout11()
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
		
		private static void loginasuser22()
		{
			try {
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("arif2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(3000);
				//oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				//Thread.sleep(2000);
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void logout22()
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
		private static void loginasuser33()
		{
			try {
				oBrowser.findElement(By.name("username")).sendKeys("DemoUser3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("arif1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(3000);
				//oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				//Thread.sleep(2000);
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void logout33()
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
		private static void loginAsAdmin1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(5000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void Deleteuser()
		{
			try {
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
				Thread.sleep(2000);
				oBrowser.switchTo().alert().accept();
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
				oBrowser.switchTo().alert().accept();
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
				Thread.sleep(2000);
				oBrowser.switchTo().alert().accept();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void LogoutasAdmin()
		{
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void CloseApplication()
		{
			try {
				oBrowser.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		

}      
		          
		           
				
		
		



