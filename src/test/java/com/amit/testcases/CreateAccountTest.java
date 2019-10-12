package com.amit.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.amit.base.Page;
import com.amit.pages.ZohoAppPage;
import com.amit.pages.crm.accounts.Accountspage;
import com.amit.pages.crm.accounts.CreateAccountPage;
import com.amit.utilities.Utilities;

public class CreateAccountTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class , dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		Accountspage account = 	Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccounts();
		cap.createAccount(data.get("accountname"));
	}

}
