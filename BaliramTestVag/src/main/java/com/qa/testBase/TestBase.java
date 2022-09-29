package com.qa.testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:/Users/Dell/Desktop/GitWorkSpace/NewRepository1/BaliramTestVag/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void start()
	
	{
		String br=prop.getProperty("browser");
		String url=prop.getProperty("url");

		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
			
		{
			System.out.println("Invalid browser please select correct browser");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	 
	}


}
