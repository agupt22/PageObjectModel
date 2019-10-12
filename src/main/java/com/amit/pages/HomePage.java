package com.amit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.base.Page;


public class HomePage extends Page{

	
	public void goToSignUp() {

		driver.findElement(By.xpath("//a[@class = 'zh-signup']")).click();
	}

	public LoginPage goToLogin() {

		click("loginLink");
		
		return new LoginPage();
	}

	public void goToSupport() {
		driver.findElement(By.xpath("//a[@class = 'zh-support']")).click();

		
	}

	public void goToContactSales() {
		driver.findElement(By.xpath("//a[@class ='zh-contact']")).click();

	}

	public void goToLearnMore() {
		driver.findElement(By.xpath("//a[@class ='learn-more']")).click();

	}

	public void validateFooterLinks() {
		driver.findElement(By.xpath("//a[@href= '/contactus.html'] [1]")).click();

	}
}
