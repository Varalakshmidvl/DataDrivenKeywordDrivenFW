package com.Easycalc.pages;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin extends BaseClass {
	@Test

    public void ValidateLogin() {

        System.setProperty("webdriver.chrome.driver","C:\\Wipro Selenium\\Page Object Model in Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");

        
        LoginEasyCalc login = new LoginEasyCalc(driver);

        login.typeEmail();

        login.typePassword();

        login.loginBtn();

        driver.quit();

    }
	
}
