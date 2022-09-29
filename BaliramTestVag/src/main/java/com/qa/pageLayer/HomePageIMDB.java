package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePageIMDB extends TestBase {
	public HomePageIMDB() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id=\"suggestion-search\"]")
	private WebElement SearchBox;
	@FindBy(xpath="//button[@id=\"suggestion-search-button\"]")
	private WebElement SearchButton;
	
	public SearchPageIMDB EnterInSearchBox()
	{
		SearchBox.sendKeys(prop.getProperty("movieName"));
		SearchButton.click();
		return new SearchPageIMDB();
	}


}
