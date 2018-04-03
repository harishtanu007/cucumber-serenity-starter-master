package net.serenitybdd.starter.stepdefinitions;

import org.junit.Assert;

import net.serenitybdd.starter.pages.LoginPage;
import net.serenitybdd.starter.pages.ManagerPage;
import net.serenitybdd.starter.pages.NewCustomerPage;
import net.thucydides.core.annotations.Step;

public class CreateCustomerSteps {

	protected LoginPage loginPage;
	protected ManagerPage managerPage;
	protected NewCustomerPage newCustomerPage;

	@Step
	public void i_enter_all_customer_data() {
		newCustomerPage.fillCustomerValues();
	}

	@Step
	public void save_the_Customer() {
		newCustomerPage.saveCustomer();
	}

	public void i_should_be_able_to_see_Customer_Registered_Successfully() {
		Assert.assertEquals("Customer Registered Successfully!!!",
				newCustomerPage.getCustomerRegisteredSuccessfullyTableHeading());
	}

	@Step
	public void i_am_in_Add_New_Customer_Page() {
		loginPage.openGuru99LoginPage();
		loginPage.enterUserID(null);
		loginPage.enterPassWord(null);
		loginPage.clickLoginBtn();
		
	}
	
	@Step
	public void i_click_on_New_Customer_Link() {
		managerPage.clickOnNewCustomerLink();
	}
}
