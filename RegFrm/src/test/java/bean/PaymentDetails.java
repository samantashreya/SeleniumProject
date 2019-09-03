package bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetails {

	WebDriver driver;

	//step 1 : identify elements
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement cardholderName;

	@FindBy(name="debit")
	@CacheLookup
	WebElement debitno;

	@FindBy(name="cvv")
	@CacheLookup
	WebElement cvvno;

	@FindBy(name="month")
	@CacheLookup
	WebElement monthname;

	@FindBy(name="year")
	@CacheLookup
	WebElement expiryyear;

	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement paymentbutton;

	public WebDriver getDriver() {
	return driver;
	}

	public void setDriver(WebDriver driver) {
	this.driver = driver;
	}

	public WebElement getCardholderName() {
	return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
	this.cardholderName.sendKeys(cardholderName);
	}

	public WebElement getDebitno() {
	return debitno;
	}

	public void setDebitno(String debitno) {
	this.debitno.sendKeys(debitno);
	}

	public WebElement getCvvno() {
	return cvvno;
	}

	public void setCvvno(String cvvno) {
	this.cvvno.sendKeys(cvvno);
	}

	public WebElement getMonthname() {
	return monthname;
	}

	public void setMonthname(String monthname) {
	this.monthname.sendKeys(monthname);
	}

	public WebElement getExpiryyear() {
	return expiryyear;
	}

	public void setExpiryyear(String expiryyear) {
	this.expiryyear.sendKeys(expiryyear);
	}

	public WebElement getPaymentbutton() {
	return paymentbutton;
	}

	public void setPaymentbutton() {
	this.paymentbutton.click();
	}

	public PaymentDetails(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this); //it configures driver with POM class and with pagefactory

	}
	
}
