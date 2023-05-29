package com.Easycalc.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.ExcelDataReader;


public class BaseClass {
public WebDriver driver;
public ExcelDataReader excel;
public ConfigDataProvider config;

@BeforeSuite
public void SetUp() {
	excel = new ExcelDataReader();
	config = new ConfigDataProvider();

}
@BeforeClass
public void BrowserTest() {
	driver = BrowserFactory.BrowserOptions(driver , config.getBrowser(),config.getAppURL());
}

@AfterClass
public void tearDown() {
	BrowserFactory.closeBrowser(driver);
}


}
