package com.expleo.cucumber.def;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.expleo.cucmber.transform.Exceltodatatable;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class cucumberDef {
	 private static WebDriver driver;
	
	@Given("^user logs into VSE$")
	public void user_logs_into_VSE() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
String chromedriver="C:\\Users\\dhivya\\Downloads"
		+ "\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromedriver);
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://www.virtual-stock-exchange.com/");
		driver.findElement(By.xpath("/html/body/section/div[2]/a[2]")).click();
	    
	    
	}

	@When("^User inputs the valid username and password with data in excel at \"([^\"]*)\"$")
	public void user_inputs_the_valid_username_and_password_with_data_in_excel_at(@Transform(Exceltodatatable.class) DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
System.out.println(table.toString());
		
		List<String> dataList = table.asList(String.class);
		
		for(String str : dataList){
			System.out.println(str);
		}
	   
	}


}
