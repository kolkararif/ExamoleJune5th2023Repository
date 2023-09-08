package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Operator();
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
			oBrowser.get("https://www.ksrtc.in/oprs-web/");
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Operator()
	{
		try
		{
			oBrowser.findElement(By.xpath("window.open('http://awatar.ksrtc.in/ksrtc-oprs/');return false;']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
