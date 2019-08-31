

package com.cg;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	LoginPage pg1;
	String pageTitle;

	@Given("^Start the browser$")
	public void startBrowser() {
		pg1 = new LoginPage();
		pg1.startBrowser("chrome");
	}

	@Given("^navigating to website$")
	public void navigateBrowser() {
		pg1.openUrl("Reg.html");
		pg1.initializeElements();
	}

	@When("^site loads$")
	public void siteLoadTitle() {
		pageTitle = pg1.getTitle();
	}

	@Then("^title should be (.*)$")
	public void titleCheck(String title) {
		assertEquals(pageTitle, "");
	}

	// User ID Alert check
	@When("^I submit empty userid$")
	public void userIdError() {
		pg1.clickSubmit();
	}

	@Then("^alert box should display error$")
	public void confirmIdAlert() {
		pg1.checkAlert("User Id should not be empty / length be between 5 to 12");
	}

	// Password Input check
	@When("^I submit empty password$")
	public void passError() {
		pg1.setUserId("kumarAkshay");
		pg1.clickSubmit();
	}

	@Then("^password alert box should display error$")
	public void confirmPassAlert() {
		pg1.checkAlert("Password should not be empty / length be between 7 to 12");
	}

	// Name input check
	@When("^I submit empty name$")
	public void nameError() {
		pg1.setUserId("kumarAkshay");
		pg1.setPass("gasdhdaj");
		pg1.clickSubmit();
	}

	@Then("^name alert box should display error$")
	public void confirmNameAlert() {
		pg1.checkAlert("Name should not be empty and must have alphabet characters only");
	}

	// Address input check
	@When("^I submit empty address$")
	public void addressError() {
		pg1.setUserId("kumarAkshay");
		pg1.setPass("gasdhdaj");
		pg1.setName("Akshay");
		pg1.clickSubmit();
	}

	@Then("^address alert box should display error$")
	public void confirmAddressAlert() {
		pg1.checkAlert("User address must have alphanumeric characters only");
	}

	// Country input check
	@When("^I submit empty country$")
	public void countryError() {
		pg1.setUserId("kumarAkshay");
		pg1.setPass("gasdhdaj");
		pg1.setName("Akshay");
		pg1.setAddress("Kolahpur");
		pg1.clickSubmit();
	}

	@Then("^country alert box should display error$")
	public void confirmCountryAlert() {
		pg1.checkAlert("Select your country from the list");
	}

	// ZIP input check
	@When("^I submit empty zip$")
	public void zipError() {
		pg1.setUserId("kumarAkshay");
		pg1.setPass("gasdhdaj");
		pg1.setName("Akshay");
		pg1.setAddress("Kolahpur");
		pg1.setCountry("india");
		pg1.clickSubmit();
	}

	@Then("^zip alert box should display error$")
	public void confirmZipAlert() {
		pg1.checkAlert("ZIP code must have numeric characters only");
	}

	// Email input check
	@When("^I submit empty email$")
	public void emailError() {
		pg1.setUserId("kumarAkshay");
		pg1.setPass("gasdhdaj");
		pg1.setName("Akshay");
		pg1.setAddress("Kolahpur");
		pg1.setCountry("india");
		pg1.setZip("654213");
		pg1.clickSubmit();
	}

	@Then("^email alert box should display error$")
	public void confirmEmailAlert() {
		pg1.checkAlert("You have entered an invalid email address!");
	}

	// Gender input check
	@When("^I submit empty gender$")
	public void genderError() {
		pg1.setUserId("kumarAkshay");
		pg1.setPass("gasdhdaj");
		pg1.setName("Akshay");
		pg1.setAddress("Kolahpur");
		pg1.setCountry("india");
		pg1.setZip("654213");
		pg1.setEmail("saddasf@cd.co");
		pg1.clickSubmit();
	}

	@Then("^gender alert box should display error$")
	public void confirmGenderAlert() {
		pg1.checkAlert("Please Select gender");
	}

	// All inputs check
	@When("^I submit all valid input$")
	public void submitSuccess() {
		pg1.setUserId("kumarAkshay");
		pg1.setPass("gasdhdaj");
		pg1.setName("Akshay");
		pg1.setAddress("Kolahpur");
		pg1.setCountry("india");
		pg1.setZip("654213");
		pg1.setEmail("saddasf@cd.co");
		pg1.setGender("female");
		pg1.setLanguage("non engLish");
		pg1.setAbout("Welcome to the world of Data Science\nHope you will enjoy Learning");
		pg1.clickSubmit();
	}

	@Then("^Success alert box should appear$")
	public void confirmSuccessAlert() {
		pg1.checkAlert("Your Registration with JobsWorld.com has successfully done plz check your registred email addres "
				+ "to activate your profile");
	}
	
	@After
	public void close()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pg1.close();
	}

}
