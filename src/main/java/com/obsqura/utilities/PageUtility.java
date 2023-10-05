package com.obsqura.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageUtility {
	WebDriver driver;
	public PageUtility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickElement(WebElement element) {
		element.click();
	}
	
	public void SetTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public String GetElemenText(WebElement element) {
		return element.getText();
	}
	
	public void AcceptAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
}
