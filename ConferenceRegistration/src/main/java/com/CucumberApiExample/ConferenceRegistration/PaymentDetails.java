package com.CucumberApiExample.ConferenceRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDetails {

	@FindBy(name = "txtFN")
	WebElement cardholder;

	@FindBy(name = "debit")
	WebElement debitnumber;

	@FindBy(name = "debitnum")
	WebElement CVV;

	@FindBy(name = "month")
	WebElement expiry;

	@FindBy(name = "year")
	WebElement expiration;

	@FindBy(name = "btnPayment")
	WebElement Makepayment;

	public PaymentDetails() {
	}

	public String getName() {
		return this.cardholder.getAttribute("value");
	}

	public void setName(String cardholder) {
		this.cardholder.sendKeys(cardholder);
	}

	public String getdebit() {
		return debitnumber.getAttribute("value");
	}

	public void setdebit(String debitnumber) {
		this.debitnumber.sendKeys(debitnumber);
	}

	public String getdebitnum() {
		return CVV.getAttribute("value");
	}

	public void setCvv(String CVV) {
		this.CVV.sendKeys(CVV);
	}

	public String getExpirationMonth() {
		return expiry.getAttribute("value");
	}

	public void setExpirationMonth(String month) {
		this.expiry.sendKeys(month);
	}

	public String getExpirationYear() {
		return this.expiration.getAttribute("value");
	}

	public void setExpiartionYear(String year) {
		this.expiration.sendKeys(year);
	}

	public void clickPayment() {
		Makepayment.click();
	}
}
