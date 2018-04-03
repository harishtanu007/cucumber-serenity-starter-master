package net.serenitybdd.starter.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.demo.guru99.com/v4/index.php")
public class LoginPage extends PageObject{

	private static final String USER_ID = "uid";
	private static final String PASS_WORD = "password";
	private static final String LOGIN = "btnLogin";
	
	@FindBy(name = USER_ID)
	WebElement userId;
	@FindBy(name = PASS_WORD)
	WebElement passWord;
	@FindBy(name = LOGIN)
	WebElement login;
	
	public void openGuru99LoginPage() {
		open();
		getDriver().manage().window().maximize();
	}
	
	public void enterUserID(String userId) {
		this.userId.sendKeys(System.getProperty("userId"));
	}
	
	public void enterPassWord(String passWord) {
		if(passWord == null) {
			passWord = System.getProperty("passWord");
		}
		this.passWord.sendKeys(passWord);
	}
	
	public void clickLoginBtn() {
		login.click();
	}
}
