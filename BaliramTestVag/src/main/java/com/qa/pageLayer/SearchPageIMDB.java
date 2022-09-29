package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SearchPageIMDB extends TestBase {
	public SearchPageIMDB()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Pushpa: The Rise - Part 1')]")
	private WebElement MovieTitle;
	
	public ContentPageIMDB ClickOnMovieTitle()
	{
		MovieTitle.click();
		return new ContentPageIMDB();
	}

}
