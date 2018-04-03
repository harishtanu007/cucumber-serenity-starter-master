package net.serenitybdd.starter.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ManagerPage extends PageObject{

	private static final String NEW_CUSTOMER = "New Customer";
	
	@FindBy(linkText = NEW_CUSTOMER)
	WebElement newCustomerLink;
	
	public void clickOnNewCustomerLink() {
		newCustomerLink.click();
	}
}
