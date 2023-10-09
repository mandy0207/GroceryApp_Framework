package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.utilities.GenerateRandomNumber;

public class UpdatePaymentTest extends BaseTest{

	@Test
	public void UpdateCreditPayment() {
		lp.Login();
		hp.NavigateToManagePaymentSection();
		int randomNumber=GenerateRandomNumber.GetRandomNumber();
		up.UpdateCreditDetail(randomNumber);
		up.ValidateCreditisUpdated();
		/**
		 * Perform Validation
		 */
		
	}
}

