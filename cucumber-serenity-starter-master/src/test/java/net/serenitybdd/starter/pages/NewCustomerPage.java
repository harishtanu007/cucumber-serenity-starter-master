package net.serenitybdd.starter.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class NewCustomerPage extends PageObject{

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	@FindBy(name = "name")
	WebElement customerName;
	@FindBy(xpath = "//input[@value='m']")
	WebElement maleRB;	
	@FindBy(name = "//input[@value='f']")
	WebElement femaleRB;	
	@FindBy(id = "dob")
	WebElement dob;
	@FindBy(name = "addr")
	WebElement addr;
	@FindBy(name = "city")
	WebElement city;
	@FindBy(name = "state")
	WebElement state;
	@FindBy(name = "pinno")
	WebElement pinno;
	@FindBy(name = "telephoneno")
	WebElement telephoneno;
	@FindBy(name = "emailid")
	WebElement emailid;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "sub")
	WebElement submit;
	@FindBy(xpath = "//table[@id='customer']//p[@class='heading3']")
	WebElement customerRegisteredTableHeading;
	
	public void verifyNewCustomerPageTitle() {
		Assert.assertEquals("Guru99 Bank New Customer Entry Page", getDriver().getTitle());
	}

	public void fillCustomerValues() {
		customerName.sendKeys("TempCustomerhhuhi");
		maleRB.click();
		dob.sendKeys("09/09/1999");
		addr.sendKeys("Temp Addr");
		city.sendKeys("City");
		state.sendKeys("State");
		pinno.sendKeys("123456");
		telephoneno.sendKeys("99999999");
		emailid.sendKeys(randomAlphaNumeric(10)+"@yufy.com");
		password.sendKeys("123456");
	}
	
	public void fillCustomerValues(String customerName,
			String gender, String dob, String addr, String city, String state,
			String pin, String mobileNumber, String eMail, String passWord) {
		this.customerName.sendKeys(customerName);
		if("Male".equals(gender)) {
			maleRB.click();
		} else {
			femaleRB.click();
		}
		this.dob.sendKeys(dob);
		this.addr.sendKeys(addr);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		pinno.sendKeys(pin);
		telephoneno.sendKeys(mobileNumber);
		emailid.sendKeys(eMail);
		password.sendKeys(passWord);
	}
	
	public void saveCustomer() {
		submit.click();
	}
	
	public String getCustomerRegisteredSuccessfullyTableHeading() {
		return customerRegisteredTableHeading.getText();
	}
	
	public static String randomAlphaNumeric(int count) {
	StringBuilder builder = new StringBuilder();
	while (count-- != 0) {
	int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
	builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	}
	return builder.toString();
	}
}
