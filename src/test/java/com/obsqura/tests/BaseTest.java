package com.obsqura.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManagePaymentMethods;
import com.obsqura.utilities.TestProperties;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	@BeforeClass
	public void InitializeDriver() throws IOException {
        prop = TestProperties.GetProperties();
        String browserName =  prop.getProperty("browserName");
        String Environment = prop.getProperty("Environment");
        String URL=prop.getProperty(Environment);
        
//		System.out.println("Executing in browser ="+browserName);
//		System.out.println("Executing in environment ="+ Environment);
		
		if (browserName.equals("Chrome")) {
		  driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Choose Right Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		InitializePages();
	
	}
	public LoginPage lp;
	public 	HomePage hp;
	public ExpenseCategoryPage ecp;
	public  ManagePaymentMethods up;
	
	
	public void InitializePages() {
		 lp = new LoginPage(driver);
		 hp = new HomePage(driver);
		 ecp = new ExpenseCategoryPage(driver);
		 up= new  ManagePaymentMethods(driver);
	}
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
}
