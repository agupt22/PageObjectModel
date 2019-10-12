package com.amit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.base.Page;
import com.amit.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	
	
	public void goToConnect() {
		
		driver.findElement(By.xpath("//span[@class ='zicon-apps-connect zicon-apps-96']"));

	}

	public void goToBooks() {

	}

	public void goToCalendar() {

	}

	public void goToCliq() {

	}

	public CRMHomePage goToCRM() {
		
		click("crmlink");
		
		return new CRMHomePage();

	}

	public void goToDesk() {

	}

	public void goToMail() {

	}

}
