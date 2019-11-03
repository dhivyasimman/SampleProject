package com.expleo.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expleo.qa.base.BDDTestBase;

public class LoginPage extends BDDTestBase {

	//PageFactory
			@FindBy(xpath ="//a[@href='/login']")
			WebElement SigninBtn;
			
			
			@FindBy(name="UserName")
			WebElement UserName;
			
			@FindBy(name="Password")
			WebElement Password;
			
			@FindBy(xpath="//input[@type=\"submit\"]")
			WebElement LoginBtn;
		
			//initialise page objects
			public LoginPage() {
				PageFactory.initElements(driver,this);
			}

			//public void sigin() {
				//SigninBtn.click();
			//}
			public HomePage Login(String un, String pwd) {
				SigninBtn.click();
				UserName.sendKeys(un);
				Password.sendKeys(pwd);
				LoginBtn.click();
				//JavascriptExecutor js =(JavascriptExecutor) driver;
				//js.executeScript("argument[0].click();",LoginBtn);
		
				return new HomePage();
			
			}
}
			

