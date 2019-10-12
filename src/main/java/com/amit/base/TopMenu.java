package com.amit.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.pages.crm.accounts.Accountspage;
import com.mysql.cj.jdbc.Driver;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public Accountspage goToAccounts() {
		
		Page.click("accountstab");

		return new Accountspage();
	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToReports() {

	}

	public void goToAnalytics() {

	}
	
	public void goToProjects() {

	}
	
	public void signOut() {
		
		
	}
}
