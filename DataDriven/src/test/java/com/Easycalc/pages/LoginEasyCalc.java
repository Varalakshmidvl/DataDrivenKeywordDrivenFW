package com.Easycalc.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginEasyCalc {

    WebDriver driver;

	     By email = By.id("log_email");

	     By password = By.name("log_password");

	     By login = By.xpath("//input[@name='log_submi']");

	     public LoginEasyCalc(WebDriver driver) {

	         this.driver = driver;

	       }
 
	     public void typeEmail()

	     {

	         driver.findElement(email).sendKeys("9740673180");
   

	     }

	     public void typePassword()

	     {

	         driver.findElement(password).sendKeys("raghubn@123");
    

	     }

	     public void loginBtn()

	     {

	         driver.findElement(login).click();
    

	     }



}