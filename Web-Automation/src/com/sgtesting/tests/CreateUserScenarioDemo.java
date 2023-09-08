package com.sgtesting.tests;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateUserScenarioDemo {
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createUser();
			//deleteUser();
			//logout();
			//closeApplication();
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
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
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
				Thread.sleep(3000);
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
				Thread.sleep(1000);
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
				oBrowser.findElement(By.name("firstName")).sendKeys("arjun");
				oBrowser.findElement(By.name("lastName")).sendKeys("allu");
				oBrowser.findElement(By.name("email")).sendKeys("user@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("Demo1");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
				//oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		private static void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='User1, Demo']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				Thread.sleep(2000);
				oAlert.accept();
				Thread.sleep(2000);
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
		
		private static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	




	}


