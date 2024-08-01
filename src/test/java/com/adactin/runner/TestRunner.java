package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.core.backend.CucumberBackendException;
import io.github.bonigarcia.wdm.WebDriverManager;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/adactin.feature"
,glue = "com.adactin.stepdefinition"
,monochrome = true
,dryRun = false
,tags = "@first"
,publish = true
,plugin= {"pretty","html:Report/Cucumber_Report"}
)
public class TestRunner {

	public static WebDriver driver;
	@BeforeClass
	public static void launch()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	
	@AfterClass
	public static void close()
	{
		//driver.close();
	}
}
