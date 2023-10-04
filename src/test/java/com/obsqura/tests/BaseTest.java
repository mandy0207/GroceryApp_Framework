package com.obsqura.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void InitializeDriver() {
		
		System.out.println("I am in Driver Initialization");
		String browserName = "Chrome";
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
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	
	}
	
	@AfterClass
	public void TearDown() {
		System.out.println("I am closing browser");
		//driver.quit();
	}
}
