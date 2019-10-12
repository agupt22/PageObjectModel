package com.amit.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.amit.pages.HomePage;
import com.amit.pages.LoginPage;
import com.amit.pages.ZohoAppPage;
import com.amit.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class , dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data) {
	
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		login.doLogin(data.get("username"), data.get("password"));
	}

}
