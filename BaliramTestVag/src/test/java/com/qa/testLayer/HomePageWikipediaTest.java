package com.qa.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.ContentPageWikipedia;
import com.qa.pageLayer.HomePageWikipedia;
import com.qa.testBase.TestBase;

public class HomePageWikipediaTest extends TestBase{
	HomePageWikipedia homepageWiki;
	ContentPageWikipedia contentpageWiki;

	public HomePageWikipediaTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		start();
		homepageWiki=new HomePageWikipedia();

	}

	@Test()
	public void ValidateSearchFunctionality()
	{
		contentpageWiki=homepageWiki.EnterInSearchBox();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
