package com.capgemini.vrs.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capgemini.vrs.model.VehicleBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VehicleTestStep {

	private WebDriver driver;
	private VehicleBean vehicle;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Users//shrsaman//Desktop//VehicleregistartionBDDProject//drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^User is on vehicleRegistration Page$")
	public void user_is_on_vehicleRegistration_Page() throws Throwable {
		driver.get("file:///C://Users//shrsaman//Desktop//VehicleregistartionBDDProject//WebPages-BDD MPT//VehicleRegistrationForm.html");
		vehicle = PageFactory.initElements(driver, VehicleBean.class);
		driver.manage().window().maximize();
	}
	
	@Given("^'Welcome to VehicleRegistration' is the title$")
	public void welcome_to_VehicleRegistration_is_the_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle = driver.getTitle();
		// Here we are keeping the title empty because there is no title given in the
		// HTML Page provided
		String expectedTitle = "Welcome to VehicleRegistration";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title Matched");
	}

	@When("^user is trying to submit data without entering title$")
	public void user_is_trying_to_submit_data_without_entering_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		vehicle.clickSubmit();
	}

	@Then("^'Select title from the list' alert message should be displayed$")
	public void select_title_from_the_list_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String actualmessage = driver.switchTo().alert().getText();
		String expectedmessage = "Select title from the list";
		Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without entering owner name$")
	public void user_is_trying_to_submit_data_without_entering_owner_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.clickSubmit();
	}

	@Then("^'Owner Name should not be empty and must have alphabet characters with in the range of (\\d+) to (\\d+)' alert message should be displayed$")
	public void owner_Name_should_not_be_empty_and_must_have_alphabet_characters_with_in_the_range_of_to_alert_message_should_be_displayed(
			int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="Owner Name should not be empty and must contain alphabets with in the range of 5 to 20";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without selecting gender$")
	public void user_is_trying_to_submit_data_without_selecting_gender() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.clickSubmit();
	}

	@Then("^'Please Select gender'alert message should be displayed$")
	public void please_Select_gender_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="Please Select gender";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without entering Address$")
	public void user_is_trying_to_submit_data_without_entering_Address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.clickSubmit();
	}

	@Then("^'address should not be empty must have alphanumeric characters with in the range of (\\d+) to (\\d+)'alert message should be displayed$")
	public void address_should_not_be_empty_must_have_alphanumeric_characters_with_in_the_range_of_to_alert_message_should_be_displayed(
			int arg1, int arg2) throws Throwable {
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="address should not be empty and must be alphanumeric with in the range of 5 to 20";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without entering City$")
	public void user_is_trying_to_submit_data_without_entering_City() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.clickSubmit();
	}

	@Then("^'city should not be empty and must have alphabet characters only'alert message should be displayed$")
	public void city_should_not_be_empty_and_must_have_alphabet_characters_only_alert_message_should_be_displayed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="city should not be empty and must have alphabet characters only";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without entering State$")
	public void user_is_trying_to_submit_data_without_entering_State() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.setCity("Hyderabad");
		vehicle.clickSubmit();
	}

	@Then("^'State should not be empty and must have alphabet characters only'alert message should be displayed$")
	public void state_should_not_be_empty_and_must_have_alphabet_characters_only_alert_message_should_be_displayed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="State should not be empty and must have alphabet characters only";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without selecting Country$")
	public void user_is_trying_to_submit_data_without_selecting_Country() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.setCity("Hyderabad");
		vehicle.setState("Telangana");
		vehicle.clickSubmit();
	}

	@Then("^'Select the country from the list'alert message should be displayed$")
	public void select_the_country_from_the_list_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="Select the country from the list";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without entering Zip$")
	public void user_is_trying_to_submit_data_without_entering_Zip() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.setCity("Hyderabad");
		vehicle.setState("Telangana");
		vehicle.setCountry("India");
		vehicle.clickSubmit();
	}

	@Then("^'ZIP code should not be empty and must contain exactly (\\d+) numeric characters only'alert message should be displayed$")
	public void zip_code_should_not_be_empty_and_must_contain_exactly_numeric_characters_only_alert_message_should_be_displayed(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="ZIP code should not be empty and must have 6 numeric characters only";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without selecting Vehicle type$")
	public void user_is_trying_to_submit_data_without_selecting_Vehicle_type() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.setCity("Hyderabad");
		vehicle.setState("Telangana");
		vehicle.setCountry("India");
		vehicle.setZip("522647");
		vehicle.clickSubmit();
	}

	@Then("^'Please Select Vehicle type'alert message should be displayed$")
	public void please_Select_Vehicle_type_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="Please Select Vehicle type";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without selecting Fuel type$")
	public void user_is_trying_to_submit_data_without_selecting_Fuel_type() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.setCity("Hyderabad");
		vehicle.setState("Telangana");
		vehicle.setCountry("India");
		vehicle.setZip("522647");
		vehicle.setVehicleType("4wheeler");
		vehicle.clickSubmit();
	}

	@Then("^'Please Select fuel type'alert message should be displayed$")
	public void please_Select_fuel_type_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="Please Select fuel type";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^user is trying to submit data without selecting year of mfg$")
	public void user_is_trying_to_submit_data_without_selecting_year_of_mfg() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.setCity("Hyderabad");
		vehicle.setState("Telangana");
		vehicle.setCountry("India");
		vehicle.setZip("522647");
		vehicle.setVehicleType("4wheeler");
		vehicle.setFuelType("Petrol");
		vehicle.clickSubmit();
	}

	@Then("^'Select mfg year from the list'alert message should be displayed$")
	public void select_mfg_year_from_the_list_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="Select mfg year from the list";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("^User is trying to submit data after entring valid set of information$")
	public void user_is_trying_to_submit_data_after_entring_valid_set_of_information() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		vehicle.setTitle("Mr.");
		vehicle.setOwnerName("pavankumar");
		vehicle.setGender("Male");
		vehicle.setAddress("Lingampally");
		vehicle.setCity("Hyderabad");
		vehicle.setState("Telangana");
		vehicle.setCountry("India");
		vehicle.setZip("522647");
		vehicle.setVehicleType("4wheeler");
		vehicle.setFuelType("Petrol");
		vehicle.setYearOfMfg("2015");
		vehicle.clickSubmit();
	}

	@Then("^'You are Succesfully registered your vehicle'alert message should be displayed$")
	public void you_are_Succesfully_registered_your_vehicle_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String actualmessage=driver.switchTo().alert().getText();
	    String expectedmessage="You are Succesfully registered your vehicle";
	    Assert.assertEquals(actualmessage, expectedmessage);
	}

	@After
	public void tearDown() throws Exception {
		driver.switchTo().alert().dismiss();
		driver.quit();
	}

}
