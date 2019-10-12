package com.amit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.base.Page;

public class LoginPage extends Page{
	
	
	public ZohoAppPage doLogin(String username , String password) {
		
		type("email", username);
		type("password", password);
		click("signbtn");
		
		return new ZohoAppPage();
	}
	
	public void goToSignUpNow() {
		
	}

}
