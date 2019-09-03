package com.CucumberApiExample.ConferenceRegistration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayementDetailsTestcases {
	ChromeDriver driver;
	BasePage pg1
;
	@Given("^browser is now opened$")
	public void StartBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^User is logged-in  in application$")
	public void OpenUrl() {
		driver.get("Reg.html");
	}


	@When("^I enter below details and makepayment$")
  public void User_enterdetails(DataTable dt) {
		List<List<String>>Data=dt.raw();

	 List<String> Cardholdername=Data.get(0);
	 List<String> DebitCarddnumber=Data.get(1);
	 List<String> Cardexpirationmonth=Data.get(2);
	 List<String> Cardexpirationyear=Data.get(3);
	 
		
 
	
		}
	
	@Then("^Page with paymment done is displayed$")
	public void CheckPageTitle() {
		    String CurrentpageTitle = null;
		   
		    assertThat(CurrentpageTitle,is("ExpectedTitle"));
	}

	private void Close1() {
		// TODO Auto-generated method stub
		
	}



}
