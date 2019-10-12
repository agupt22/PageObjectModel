package com.amit.pages.crm.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amit.base.Page;

public class Accountspage extends Page{
	
	
	
public CreateAccountPage goToCreateAccounts() {
	
	click("createaccountstab");
		
	return new CreateAccountPage();
	
	}
	
	public void goToImportAccounts() {
		
	//Select clickOnPlus = new Select(driver.findElement(By.xpath("//span[@class ='svgIcons icon-add-menu lyteMenuSelected']")));
	driver.findElement(By.xpath("//span[@class ='svgIcons icon-add-menu lyteMenuSelected']")).click();
	
	driver.findElement(By.xpath("//a[@id ='submenu_Accounts']")).click();
		
	}

}
