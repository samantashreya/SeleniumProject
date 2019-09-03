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

public class ConferenceTestCases {
	ChromeDriver driver;

	@Given("^browser is now  has opened$")
	public void StartBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^User is logged-in  into the application$")
	public void OpenUrl() {
		driver.get("Reg.html");
	}


	@When("^I enter below details and Click Next$")
  public void User_enterdetails(DataTable dt) {
		List<List<String>>Data=dt.raw();

	 List<String> FirstName=Data.get(0);
	 List<String> LastName=Data.get(1);
	 List<String> EmailName=Data.get(2);
	 List<String> ContactnoName=Data.get(3);
	 List<String> People=Data.get(4);
	 List<String> Address=Data.get(5);
	 List<String> Area=Data.get(6);
	 List<String> State=Data.get(7);
	 List<String> ConferencefullAccess=Data.get(8);
	}
	 @Then("^A page with Payment Details is Opened$")
	 public void Check_BehaviourOfPesrsonalDetails(String ExpectedTitle) 
	   {
	        
	      
		   String CurrentPageTitle = null;
		   assertThat(CurrentPageTitle,is(ExpectedTitle));
	        }
	        
	   
	         @After
	        public void Close() {
	        	//Driver.quit();
	        	
	        }
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}


