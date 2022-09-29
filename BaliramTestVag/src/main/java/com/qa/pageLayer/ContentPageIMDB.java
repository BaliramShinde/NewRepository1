package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ContentPageIMDB extends TestBase {
	public ContentPageIMDB()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[contains(text(),'India')])[1]")
	private WebElement country;
	@FindBy(xpath="//a[contains(text(),'December 17, 2021 (United States)')]")
	private WebElement ReleaseDate;
	
	public String ReleaseDate()
	{
		return ReleaseDate.getText();
	}
	public String Country()
	{
		return country.getText();
	}

}
