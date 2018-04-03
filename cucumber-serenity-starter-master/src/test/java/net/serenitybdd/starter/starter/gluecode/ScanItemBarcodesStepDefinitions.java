package net.serenitybdd.starter.starter.gluecode;
import java.util.List;

import com.experitest.client.Client;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.starter.stepdefinitions.CreateCustomerSteps;
import net.thucydides.core.annotations.Steps;


public class ScanItemBarcodesStepDefinitions{
	
	 private String host = "localhost";
	    private int port = 8889;
	    private String projectBaseDirectory = "C:\\Users\\hk185080\\workspace\\project2";
	    protected Client client = null;
	    
	@Given("^User is in cart page$")
	public void user_is_in_cart_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   setUp();
	   client.setDevice("adb:SM-G930F");
    client.launch("com.mdcinternational.ncr.myiscan/com.mdcinternational.myiscan.MyiScan", true, false);
	   
	}


	@When("^User clicks on the scan button$")
	public void user_clicks_on_the_scan_button() throws Exception {
		
	    // Write code here that turns the phrase above into concrete actions
		if(client.waitForElement("NATIVE", "xpath=//*[@id='tabImage' and ./parent::*[@id='tabsLayout']]", 0, 30000)){
            // If statement
			client.click("NATIVE", "xpath=//*[@id='tabImage' and ./parent::*[@id='tabsLayout']]", 0, 1);
        }
	}
//	@When("^Scans the (.*)$")
//	public void scans_the(String arg1, DataTable arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//		//Write the code to handle Data Table
//		List<List<String>> data = arg2.raw();
// 
//		//This is to get the first data of the set (First Row + First Column)
//		for(int i=1;i<=data.size();i++)
//		{
//		if(data.get(i).get(0).equals("snickers"))
//		{   client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\empty.png");
//			client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item1.png");
//		}
//		else if(data.get(i).get(0).equals("orbit")) {
//			client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item2.png");
//		}
//		
//		else
//		{
//			System.out.println("wrong");
//		}
//		}
		
	 
//	}
//	
		@When("^Scans the \"([^\"]*)\"$")
		public void scans_the_Start_of_trip_Qr_code(String Code) throws Exception {
		    // Write code here that turns the phrase above into concrete actions
			if(Code.equals("QRcode"))
			 {
				 if(client.waitForElement("NATIVE", "xpath=//*[@id='closeButton']", 0, 30000)){
			            // If statement
					 client.click("NATIVE", "xpath=//*[@id='closeButton']", 0, 1);
			        }
			 }
			else if(Code.equals("snickers"))
			{   client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\empty.png");
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item1.png");
			}
			else if(Code.equals("orbit"))
			{  
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item2.png");
			}
			else if(Code.equals("redbull"))
			{   
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item3.png");
			}
			else if(Code.equals("monster zero"))
			{  
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item4.png");
			}
			else if(Code.equals("sprite"))
			{ 
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item5.png");
			}
			else if(Code.equals("7up"))
			{   
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item6.png");
			}
			else if(Code.equals("barqs beer"))
			{  
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item7.png");
			}
			else if(Code.equals("kraft ketchup"))
			{   
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item8.png");
			}
			else if(Code.equals("amstel bier"))
			{   
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item9.png");
			}
			else if(Code.equals("dvd frozen"))
			{   
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item10.png");
			}
			else if(Code.equals("toy car"))
			{   
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item11.png");
			}
			else if(Code.equals("champagne"))
			{  
				client.simulateCapture("C:\\Users\\hk185080\\Desktop\\NCR images\\item12.png");
			}
			else
			{
				System.out.println("wrong");
			}
		}
		@Then("^Item must be added into cart$")
		public void item_must_be_added_into_cart() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
			 if(client.waitForElement("NATIVE", "xpath=//*[@id='closeButton']", 0, 10000)){
		            // If statement
				 client.click("NATIVE", "xpath=//*[@id='closeButton']", 0, 1);
		        }
		        
		}
		public void setUp(){
	        client = new Client(host, port, true);
	        client.setProjectBaseDirectory(projectBaseDirectory);
	        client.setReporter("xml", "reports", "baseandroidv1");
	    }
}
