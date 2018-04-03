package net.serenitybdd.starter.starter.gluecode;

import org.junit.After;

import com.experitest.client.Client;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.starter.stepdefinitions.CreateCustomerSteps;
import net.thucydides.core.annotations.Steps;

public class ScanQRCodeStepDefinitions {
	@Steps
	CreateCustomerSteps createCustomerSteps;
	
	 private String host = "localhost";
	    private int port = 8889;
	    private String projectBaseDirectory = "C:\\Users\\hk185080\\workspace\\project2";
	    protected Client client = null;
	    
	@Given("^User is in welcome page$")
	public void user_is_in_welcome_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   setUp();
	   client.setDevice("adb:SM-G930F");
       client.launch("com.mdcinternational.ncr.myiscan/com.mdcinternational.myiscan.MyiScan", true, false);
	   
	}
	@And("^Scans the QRcode$")
	public void scans_the_QRcode() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\empty.png");
        client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\start.png");
	}

	@When("^User clicks on scan button$")
	public void user_clicks_on_scan_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(client.waitForElement("NATIVE", "xpath=//*[@id='tabImage' and ./parent::*[@id='tabsLayout']]", 0, 30000)){
            // If statement
			client.click("NATIVE", "xpath=//*[@id='tabImage' and ./parent::*[@id='tabsLayout']]", 0, 1);
        }
        
	}
	
        



	@Then("^I should be able to Login to the store$")
	public void i_should_be_able_to_Login_to_the_store() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 if(client.waitForElement("NATIVE", "xpath=//*[@id='closeButton']", 0, 30000)){
	            // If statement
			 client.click("NATIVE", "xpath=//*[@id='closeButton']", 0, 1);
	        }
	     client.generateReport(false);
	        // Releases the client so that other clients can approach the agent in the near future. 
	        client.releaseClient();   
	}
	 @After
	    public void tearDown(){
	        // Generates a report of the test case.
	        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
	   
	    }
	
      
	 public void setUp(){
	        client = new Client(host, port, true);
	        client.setProjectBaseDirectory(projectBaseDirectory);
	        client.setReporter("xml", "reports", "baseandroidv1");
	    }

}
