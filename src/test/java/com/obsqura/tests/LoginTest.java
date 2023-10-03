package com.obsqura.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	
	@Test
	public void MyLoginTest() {
		System.out.println(" I AM IN TEST CASE");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}
	
}
