package com.expleo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.expleo.qa.utility.BDDTestUtil;

public class BDDTestBase {

public static WebDriver driver;
public static Properties Prop;
	
	public BDDTestBase(){
		try {
			Prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\dhivya\\eclipse-workspace"
					+ "\\BDDData\\src\\main\\java\\com\\expleo\\qa\\config\\config.properties");
			Prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}}
	
	public static void initialization(){
		String browserName = Prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhivya\\Downloads"
					+ "\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.out.println("Driver not found");
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(BDDTestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(BDDTestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(Prop.getProperty("url"));
				

}
}

	




