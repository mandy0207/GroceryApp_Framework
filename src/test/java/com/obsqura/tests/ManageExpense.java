package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class ManageExpense extends BaseTest {

	
	@Test
	public void ManageExpenseTest() {
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		ExpenseCategoryPage ecp = new ExpenseCategoryPage(driver);
	
		lp.Login();
		hp.NavigateToManageExpense();
		ecp.CreateExpense();
		
	}
}
