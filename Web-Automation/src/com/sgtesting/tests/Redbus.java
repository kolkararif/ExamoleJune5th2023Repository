package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Account();
		//Login();
		Trainlogo();
		TrainTicket();
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
			oBrowser.get("https://www.redbus.in/");
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Account()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Account']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/script[1]")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Trainlogo()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//span[text()='Train Tickets']")).click();
			oBrowser.findElement(By.className("Trainlogo()"));
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void TrainTicket()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Train Tickets']")).click();
			//oBrowser.findElement(By.className("Trainlogo()"));
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
