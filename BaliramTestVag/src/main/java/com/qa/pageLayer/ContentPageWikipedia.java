package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ContentPageWikipedia extends TestBase {
	public ContentPageWikipedia()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//td[@class='infobox-data'])[10]")
	private WebElement ReleaseDate;
	@FindBy(xpath="//td[contains(text(),'India')]")
	private WebElement country;
	
	
	public String ReleaseDate() {
		 return ReleaseDate.getText();
	}
	public String Country()
	{
		return country.getText();
	}
	public HomePageIMDB NavigateToIMDB()
	{
		driver.navigate().to(prop.getProperty("url2"));
		return new HomePageIMDB();
	}


}
