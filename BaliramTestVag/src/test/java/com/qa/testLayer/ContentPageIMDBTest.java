package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.ContentPageIMDB;
import com.qa.pageLayer.ContentPageWikipedia;
import com.qa.pageLayer.HomePageIMDB;
import com.qa.pageLayer.HomePageWikipedia;
import com.qa.pageLayer.SearchPageIMDB;
import com.qa.testBase.TestBase;

public class ContentPageIMDBTest extends TestBase {
	HomePageWikipedia homepageWiki;
	ContentPageWikipedia contentpageWiki;
	HomePageIMDB homepageImdb;
	SearchPageIMDB searchpageImdb;
	ContentPageIMDB contentpageImdb;
	public ContentPageIMDBTest()
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
		contentpageImdb=new ContentPageIMDB();
	}
	
	@Test(priority=2)
	public void ValidateReleaseDateOfWikipediaAndIMDB()
	{
		homepageWiki.EnterInSearchBox();
		String ReleaseDateWiki=contentpageWiki.ReleaseDate();
		contentpageWiki.NavigateToIMDB();
		homepageImdb.EnterInSearchBox();
		searchpageImdb.ClickOnMovieTitle();
		String ReleaseDateIMDB=contentpageImdb.ReleaseDate();
		Assert.assertEquals(ReleaseDateWiki, ReleaseDateIMDB);
	}
	@Test(priority=1)
	public void ValidateCountryOfWikipediaAndIMDB()
	{
		homepageWiki.EnterInSearchBox();
		String CountryWiki=contentpageWiki.Country();
		contentpageWiki.NavigateToIMDB();
		homepageImdb.EnterInSearchBox();
		searchpageImdb.ClickOnMovieTitle();
		String CountryIMDB=contentpageImdb.Country();
		Assert.assertEquals(CountryWiki, CountryIMDB);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
