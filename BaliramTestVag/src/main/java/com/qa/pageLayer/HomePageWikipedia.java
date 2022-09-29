package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePageWikipedia extends TestBase{
	public HomePageWikipedia() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id=\"searchInput\"]")
	private WebElement SearchBox;
	@FindBy(xpath="//input[@id=\"searchButton\"]")
	private WebElement SearchButton;

	public ContentPageWikipedia EnterInSearchBox()
	{
		SearchBox.sendKeys(prop.getProperty("movieName"));
		SearchButton.click();
		return new ContentPageWikipedia();
	}


}
