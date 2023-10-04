package com.obsqura.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

public class ManageExpense extends BaseTest {

	
	@Test
	public void ManageExpenseTest() {
		LoginPage lp = new LoginPage(driver);
		lp.Login();
	}
}
