package com.amit.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amit.base.Page;
import com.amit.pages.HomePage;
import com.amit.pages.LoginPage;
import com.amit.pages.ZohoAppPage;
import com.amit.pages.crm.accounts.Accountspage;
import com.amit.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
		
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		ZohoAppPage zp = login.doLogin("amitgupta9530@gmail.com", "Cowgupta44@");
		zp.goToCRM();
		Accountspage account = 	Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccounts();
		cap.createAccount("Amit");

	}

}
