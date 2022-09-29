package com.qa.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.ContentPageWikipedia;
import com.qa.pageLayer.HomePageIMDB;
import com.qa.pageLayer.HomePageWikipedia;
import com.qa.testBase.TestBase;

public class ContentPageWikipediaTest extends TestBase {
	HomePageWikipedia homepageWiki;
	ContentPageWikipedia contentpageWiki;
	HomePageIMDB homepageImdb;
	public ContentPageWikipediaTest()
	{
		super();
	}
	@BeforeMethod
	public void SetUp()
	{
		start();
		homepageWiki=new HomePageWikipedia();
		contentpageWiki=new ContentPageWikipedia();
		homepageImdb=new HomePageIMDB();
		homepageWiki.EnterInSearchBox();

	}
	
	@Test()
	public void ValidateReleaseDateFunctinality()
	{
		contentpageWiki.ReleaseDate();
	}
	@Test()
	public void ValidateReleaseCountryFunctinality()
	{
		contentpageWiki.Country();
	}
	@Test()
	public void ValidateNavigateToIMDB()
	{
		homepageImdb=contentpageWiki.NavigateToIMDB();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
