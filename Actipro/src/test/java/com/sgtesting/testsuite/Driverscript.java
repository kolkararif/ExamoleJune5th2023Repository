package com.sgtesting.testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
@CucumberOptions(
		features = "src/test/resource/featurefile",
		glue = "com.sgtesting.stepdefinition"
		
		)
public class Driverscript 
{
	private static TestNGCucumberRunner testngCucumberRunner=null;
	@BeforeClass(alwaysRun = true)
	public void setUpClass()
	{
		try
		{
			testngCucumberRunner=new TestNGCucumberRunner(this.getClass());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature)
	{
		testngCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features()
	{
		if(testngCucumberRunner==null)
		{
			testngCucumberRunner=new TestNGCucumberRunner(this.getClass());
		}
		return testngCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass()
	{
		try
		{
			testngCucumberRunner.finish();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
