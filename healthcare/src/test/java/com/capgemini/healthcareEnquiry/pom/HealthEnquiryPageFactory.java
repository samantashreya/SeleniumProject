package com.capgemini.healthcareEnquiry.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HealthEnquiryPageFactory {
	WebDriver driver;
	@FindBy(name = "fname")
	@CacheLookup
	WebElement firstName;

	@FindBy(xpath = "//*[@name='lname']")
	@CacheLookup
	WebElement lastName;

	@FindBy(how = How.ID, using = "emails")
	@CacheLookup
	WebElement email;

	@FindBy(name = "mobile")
	@CacheLookup
	WebElement mobile;

	@FindBy(name = "D6")
	@CacheLookup
	WebElement healthcare;

	

	@FindBy(name = "D5")
	@CacheLookup
	WebElement mode;

	@FindBy(how = How.ID, using = "Submit1")
	@CacheLookup
	WebElement submitButton;

	@FindBy(how = How.ID, using = "enqdetails")
	@CacheLookup
	WebElement enquiry;

	

	

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
		
	}
	public WebElement getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
		
	}
	public WebElement getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email.sendKeys(email);
		
	}
	public WebElement getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile.sendKeys(mobile);
	}
	public WebElement getHealthcare() {
		return healthcare;
	}



	public void setHealthcare(String healthcare) {
		Select selectHealthcare = new Select(this.healthcare);
		selectHealthcare.selectByVisibleText(healthcare);
		
	}
	public WebElement getMode() {
		return mode;
	}



	public void setMode(String mode) {
		Select selectMode = new Select(this.mode);
		selectMode.selectByVisibleText(mode);
		
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton() {
		this.submitButton.click();
		
	}
	public WebElement getEnquiry() {
		return enquiry;
	}


	public void setEnquiry(String enquiry) {
		this.enquiry.sendKeys(enquiry);
	}
	public HealthEnquiryPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
