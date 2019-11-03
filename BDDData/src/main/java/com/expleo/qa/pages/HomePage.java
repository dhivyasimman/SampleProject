package com.expleo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expleo.qa.base.BDDTestBase;

public class HomePage extends BDDTestBase {

	@FindBy(xpath="//*[contains(text(),'Make a Trade')]")
	WebElement Trade;
	
	
	//@FindBy(xpath="//*[contains(text(),'Trade Stocks/ETFs')]")
	@FindBy(xpath="/html/body/div[2]/nav/div[1]/ul/li[3]/ul/li[1]/a")
	WebElement Tradestock;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifytradelabel() {
		return Trade.isDisplayed();
	}
	
	
	public String validateTradePagetitle() {
		 return driver.getTitle(); 

	}
	
	public void selectTradestock() {
		 //driver.findElement(By.xpath("//*[contains(text(),'Trade Stocks/ETFs')]"))
		Trade.click();
		Tradestock.click();
		 //return new TradePage();
	}
	
	
	

}
