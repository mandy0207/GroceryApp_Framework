package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseCategoryPage {

	WebDriver driver;
	public ExpenseCategoryPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	private WebElement newBtn;
	
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement title;
	
	@FindBy(xpath="//button[@name='Create']")
	private WebElement saveBtn;
	
	

	public void CreateExpense() {
		newBtn.click();
		title.sendKeys("Aparna");
		saveBtn.click();
	}
}
