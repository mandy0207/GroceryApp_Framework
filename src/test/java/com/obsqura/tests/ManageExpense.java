package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.DateUtility;

public class ManageExpense extends BaseTest {

	
	@Test
	public void ManageExpenseTest() {
		lp.Login();
		hp.NavigateToManageExpense();
		
		String currentDate= DateUtility.getCurrentDate();
		String alertText = ecp.CreateExpense(currentDate);
		System.out.println(alertText);
		/**
		 * Validation for Expense Creation
		 */
		Assert.assertEquals(alertText, "Alert!", "Alert validation failed");
		ecp.DeleteExpense(currentDate);
		
		
	}
}
