package com.capgemini.healthcareEnquiry;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capgemini.healthcareEnquiry.pom.HealthEnquiryPageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnquiryStepDefinition {

	private WebDriver driver;
	private HealthEnquiryPageFactory enquiryPageFactory;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users/ashishkp/Downloads/chromedriver.exe");

		driver = new ChromeDriver();
	}

	
	
	
	@Given("^user is on 'HealthCare' page$")
	public void user_is_on_HealthCare_page() throws Throwable {
		Thread.sleep(1500);
		driver.get("C:\\BDD701\\healthcare\\HealthCare.html");
		enquiryPageFactory = new HealthEnquiryPageFactory(driver);
	}

	@When("^page is loaded$")
	public void page_is_loaded() throws Throwable {
	    
	}

	@Then("^check if title of the page is 'HealthCare management'$")
	public void check_if_title_of_the_page_is_HealthCare_management() throws Throwable {
		String expectedTitle = "HealthCare Management";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^check if there is a text 'Enquiry Details Form'$")
	public void check_if_there_is_a_text_Enquiry_Details_Form() throws Throwable {
		boolean expectedResult = true;
		String expectedText = "Enquiry Details Form";
		boolean actualResult = driver.getPageSource().contains(expectedText);
		Assert.assertEquals(expectedResult, actualResult);
		driver.close();
	}

	@When("^user no data is entered in first name$")
	public void user_no_data_is_entered_in_first_name() throws Throwable {
		enquiryPageFactory.setFirstName("");
		enquiryPageFactory.setSubmitButton();
	}

	@Then("^the alert box displays 'First Name must be filled out'$")
	public void the_alert_box_displays_First_Name_must_be_filled_out() throws Throwable {
		String expectedText = "First Name must be filled out";
		String actualText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(expectedText, actualText);
		driver.close();
	}

	@When("^user no data is entered in last name$")
	public void user_no_data_is_entered_in_last_name() throws Throwable {
		enquiryPageFactory.setLastName("");
		enquiryPageFactory.setSubmitButton();
	}

	@Then("^the alert box displays 'Last Name must be filled out'$")
	public void the_alert_box_displays_Last_Name_must_be_filled_out() throws Throwable {
		String expectedText = "Last Name must be filled out";
		String actualText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(expectedText, actualText);
		driver.close();
	}

	@When("^enteres email$")
	public void enteres_email() throws Throwable {
		enquiryPageFactory.setEmail("example@gmail.com");
	}

	@When("^character data entered in the Mobile textbox$")
	public void character_data_entered_in_the_Mobile_textbox() throws Throwable {
		enquiryPageFactory.setMobile("abcdef");
		enquiryPageFactory.setSubmitButton();
	}

	@Then("^the alert box displays the message 'Enter numeric value'$")
	public void the_alert_box_displays_the_message_Enter_numeric_value() throws Throwable {
		String expectedText = "Enter numeric value";
		String actualText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(expectedText, actualText);
		driver.close();
	}

	@When("^invalid data entered in the Mobile text box$")
	public void invalid_data_entered_in_the_Mobile_text_box() throws Throwable {
		enquiryPageFactory.setMobile("789456123");
		enquiryPageFactory.setSubmitButton();
	}

	@Then("^the alert box displays the message 'Enter (\\d+) digit Mobile number'$")
	public void the_alert_box_displays_the_message_Enter_digit_Mobile_number(int arg1) throws Throwable {
		String expectedText = "Enter 10 digit Mobile number";
		String actualText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(expectedText, actualText);
		driver.close();
	}

	@When("^select Type of healthCare required as 'Basic Physican'$")
	public void select_Type_of_healthCare_required_as_Basic_Physican() throws Throwable {
		enquiryPageFactory.setHealthcare("Basic Physican");
	}

	@When("^select Mode of Treatment as 'Homepathic'$")
	public void select_Mode_of_Treatment_as_Homepathic() throws Throwable {
		enquiryPageFactory.setMode("Homepathic");
	}

	@When("^submit the request button$")
	public void submit_the_request_button() throws Throwable {
		enquiryPageFactory.setSubmitButton();
	}

	@Then("^Verify the alert box displays message 'Enquiry details must be filled out'$")
	public void verify_the_alert_box_displays_message_Enquiry_details_must_be_filled_out() throws Throwable {
		String expectedText = "Enquiry details must be filled out";
		String actualText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(expectedText, actualText);
		driver.close();
	}

	@When("^user enters valid enquiry details$")
	public void user_enters_valid_enquiry_details() throws Throwable {
		enquiryPageFactory.setFirstName("Jhon");
		enquiryPageFactory.setLastName("Thomas");
		enquiryPageFactory.setEmail("jhon@example.com");
		enquiryPageFactory.setMobile("7878787878");
		enquiryPageFactory.setHealthcare("Basic Physican");
		enquiryPageFactory.setMode("Homepathic");
		enquiryPageFactory.setEnquiry("This is an enquiry text");
		enquiryPageFactory.setSubmitButton();
	}

	@Then("^Verify the message 'Thank you for submitting the healthCare Enquiry'$")
	public void verify_the_message_Thank_you_for_submitting_the_healthCare_Enquiry() throws Throwable {
		String expectedText = "Thank you for submitting the HealthCare Enquiry";
		String actualText = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedText, actualText);
	}

	@Then("^Click OK$")
	public void click_OK() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@Then("^Verify the text 'Our Counselor will contact you soon' after submission of form$")
	public void verify_the_text_Our_Counselor_will_contact_you_soon_after_submission_of_form() throws Throwable {
		String expectedText = "Our Counselor will contact you soon.";
		String actualText = driver.findElement(By.tagName("h3")).getText();
		Assert.assertEquals(expectedText, actualText);
	}

	@Then("^Close the browser window$")
	public void close_the_browser_window() throws Throwable {
		driver.quit();
	}


}
