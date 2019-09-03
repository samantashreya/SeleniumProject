package com.CucumberApiExample.ConferenceRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PersonalDetails extends BasePage {
	@FindBy(name = "txtFN")
	WebElement FName;

	@FindBy(name = "txtLN")
	WebElement LName;

	@FindBy(name = "Email")
	WebElement email;

	@FindBy(name = "Phone")
	WebElement phone;

	@FindBy(name = "size")
	WebElement size;

	@FindBy(name = "Address")
	WebElement Add;

	@FindBy(name = "Address2")
	WebElement Add2;

	@FindBy(name = "city")
	WebElement CName;

	@FindBy(name = "state")
	WebElement sName;

	@FindBy(name = "memberStatus")
	WebElement MName;

	@FindBy(name = "memberStatus")
	WebElement MName1;

	@FindBy(name = "btnNext")
	WebElement next;
	public String getFirstName() {
		return this.FName.getAttribute("value");
	}

	public void setFirstName(String txtFN) {
		this.FName.sendKeys(txtFN);
	}

	public String getLastName() {
		return this.LName.getAttribute("value");
	}

	public void setLastName(String txtLN) {
		this.LName.sendKeys(txtLN);
	}

	public String getEmail() {
		return this.email.getAttribute("value");
	}

	public void setEmail(String Email) {
		this.email.sendKeys(Email);
	}

	public String getPhoneNumber() {
		return this.phone.getAttribute("value");
	}

	public void setPhoneNumber(String Phone) {
		this.phone.sendKeys(Phone);
	}

	public String getAddress() {
		return this.Add.getAttribute("value");
	}
	public void setAddress(String Address) {
		this.Add.sendKeys(Address);
	}

	public String getArea() {
		return this.Add2.getAttribute("value");
	}

	public void setArea(String Address2) {
		this.Add2.sendKeys(Address2);
	}
	

	public void clickPeople() {
		Select select = new Select(size);
		select.selectByIndex(2);
	}

	public void clickCity() {
		Select select = new Select(CName);
		select.selectByVisibleText("Pune");
	}

	public void clickState() {
		Select select = new Select(sName);
		select.selectByVisibleText("Maharashtra");
	}

	public void clickMemberStatus() {
		MName.click();
	}

	public void clickNextButton() {
		MName1.click();
	}
	
	
	
	public  void InitialiseElements(WebDriver Driver)
	{
		PageFactory.initElements(Driver, PersonalDetails.this);
	}
}


