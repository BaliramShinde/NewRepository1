package com.qa.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.ContentPageWikipedia;
import com.qa.pageLayer.HomePageIMDB;
import com.qa.pageLayer.HomePageWikipedia;
import com.qa.pageLayer.SearchPageIMDB;
import com.qa.testBase.TestBase;

public class HomePageImdbTest extends TestBase {
	HomePageWikipedia homepageWiki;
	ContentPageWikipedia contentpageWiki;
	HomePageIMDB homepageImdb;
	SearchPageIMDB searchpageImdb;
	public HomePageImdbTest()
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
		searchpageImdb=new SearchPageIMDB();
		contentpageWiki.NavigateToIMDB();
		homepageImdb.EnterInSearchBox();	
	}
	@Test()
	public void VerifySearchFunctionalityOfIMDB()
	{
		searchpageImdb=homepageImdb.EnterInSearchBox();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
