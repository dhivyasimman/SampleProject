package com.expleo.Definition;


import org.junit.Assert;

import com.expleo.qa.base.BDDTestBase;
import com.expleo.qa.pages.HomePage;
import com.expleo.qa.pages.LoginPage;
import com.expleo.qa.pages.TradePage;
import com.expleo.qa.utility.BDDTestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDStep extends BDDTestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	TradePage tradepage;
	BDDTestUtil BDDTestUtil = new BDDTestUtil();
	
	//public BDDStep() {
		//super();
	//}

	@Given("^User Logs into the VSE website$")
	public void user_Logs_into_the_VSE_website()  {
		BDDTestBase.initialization();    
	}

	@When("^User inputs the valid username and password$")
	public void user_inputs_the_valid_username_and_password()  {
		loginpage= new LoginPage();
		//loginpage.sigin();
		homepage = loginpage.Login(Prop.getProperty("username"), Prop.getProperty("password"));
		System.out.println("Valid Credentials entered");
	   
	}

	@Then("^User verifies the title DASHBOARD$")
	public void user_verifies_the_title_DASHBOARD() {
		//homepage= new HomePage();
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Dashboard");
		System.out.println("Title matched");
		
	    
	}

	@Given("^User selects TRADE STOCKS option in MAKE A TRADE dropdown$")
	public void user_selects_TRADE_STOCKS_option_in_MAKE_A_TRADE_dropdown() {
		//= new HomePage();
		homepage.selectTradestock();
		Assert.assertTrue(homepage.verifytradelabel());
		String Tradetitle = homepage.validateTradePagetitle();
		Assert.assertEquals(Tradetitle ,"Trading - Equities");
		System.out.println("Trade Title matched");
	    
	}

	@When("^User selects the Region, Location and keys in necessary values$")
	public void user_selects_the_Region_Location_and_keys_in_necessary_values() {
		//tradepage = new TradePage();
		
	}

	@When("^Clicks the Preview Button$")
	public void clicks_the_Preview_Button() {
		
	}

	@Then("^Now User Clicks the Confirm Button$")
	public void now_User_Clicks_the_Confirm_Button() {
		
	}

	@Then("^Trade is successfully placed$")
	public void trade_is_successfully_placed() {
		
	}

	@Given("^User is in the VSE website$")
	public void user_is_in_the_VSE_website() {
		
	}

	@When("^Click Logout$")
	public void click_Logout() {
		
	}

	@Then("^User verifies the Virtual Stock Exchange title$")
	public void user_verifies_the_Virtual_Stock_Exchange_title() {
		
	}


	
	
}
