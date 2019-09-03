package PaymentDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bean.PaymentDetails;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class PaymentDetailsStepDefinition {
	private WebDriver driver;
	private PaymentDetails details;
	

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shrsaman\\git\\SeleniumProject\\RegFrm\\BDDEssentials\\chromedriver.exe" );	
				driver= new ChromeDriver();
	}
	 @Given("^user is on 'Payment Detail' page$")
	 public void user_is_on_Payment_page() throws Throwable {
	 driver.get("C:\\Users\\shrsaman\\git\\SeleniumProject\\RegFrm\\BDDEssentials\\PaymentDetails.html");
	 details = new PaymentDetails(driver);
	 }
	 
	 @When("^user enters invalid Card Holder Name$")
	 public void user_enters_invalid_Card_Holder_Name() throws Throwable {
	 details.setCardholderName("");
	 details.setPaymentbutton();
	 }

	 @Then("^displays 'Please fill the Card Holder Name'$")
	 public void displays_Please_fill_the_Card_Holder_Name() throws Throwable {
	 String expectedMessage="Please fill the Card holder name";
	 String actualMessage=driver.switchTo().alert().getText();
	 Thread.sleep(2000);
	 Assert.assertEquals(expectedMessage, actualMessage);
	
	 driver.switchTo().alert().accept();
	
	 driver.close();
	 }

	 @When("^user enters invalid Debit Card Number$")
	 public void user_enters_invalid_Debit_Card_Number() throws Throwable {
	 details.setCardholderName("Veeru Yadav");
	 details.setDebitno("");
	 details.setPaymentbutton();
	 }

	 @Then("^displays 'Please fill Debit Card Number'$")
	 public void displays_Please_fill_Debit_Card_Number() throws Throwable {	  
	 String expectedMessage="Please fill the Debit card Number";
	 String actualMessage=driver.switchTo().alert().getText();
	 Thread.sleep(2000);
	 Assert.assertEquals(expectedMessage, actualMessage);
	 driver.switchTo().alert().accept();
	 driver.close();
	 }

	 @When("^user does not enter CVV value$")
	 public void user_does_not_enter_CVV_value() throws Throwable {
	 details.setCardholderName("Veeru Yadav");
	 details.setDebitno("9847744");
	 details.setCvvno("");
	 details.setPaymentbutton();
	 }

	 @Then("^displays 'Please fill CVV Number'$")
	 public void displays_Please_fill_CVV_Number() throws Throwable {
	 String expectedMessage="Please fill the CVV";
	 String actualMessage=driver.switchTo().alert().getText();
	 Thread.sleep(2000);
	 Assert.assertEquals(expectedMessage, actualMessage);
	 driver.switchTo().alert().accept();
	 driver.close();
	 }

	 @When("^user enters invalid Expiration Month$")
	 public void user_enters_invalid_Expiration_Month() throws Throwable {
	 details.setCardholderName("Veeru Yadav");
	 details.setDebitno("9847744");
	 details.setCvvno("123");
	 details.setMonthname("");
	 details.setPaymentbutton();
	 }
	 
	 @Then("^displays 'Please fill Expiration Month'$")
	 public void displays_Please_fill_Expiration_Month() throws Throwable {
	 String expectedMessage="Please fill expiration month";
	 String actualMessage=driver.switchTo().alert().getText();
	 Thread.sleep(2000);
	 Assert.assertEquals(expectedMessage, actualMessage);
	 driver.switchTo().alert().accept();
	 driver.close();
	 }

	 @When("^user enters invalid Expiration Year$")
	 public void user_enters_invalid_Expiration_Year() throws Throwable {
	 details.setCardholderName("Veeru Yadav");
	 details.setDebitno("9847744");
	 details.setCvvno("123");
	 details.setMonthname("04");
	 details.setExpiryyear("");
	 details.setPaymentbutton();
	 }

	 @Then("^displays 'Please fill Expiration Year'$")
	 public void displays_Please_fill_Expiration_Year() throws Throwable {
	 String expectedMessage="Please fill the expiration year";
	 String actualMessage=driver.switchTo().alert().getText();
	 Thread.sleep(2000);
	 Assert.assertEquals(expectedMessage, actualMessage);
	 driver.switchTo().alert().accept();
	 driver.close();
	 }

	 @When("^user enters valid Payment Details$")
	 public void user_enters_valid_Payment_Details() throws Throwable {
	 details.setCardholderName("Veeru Yadav");
	 details.setDebitno("9847744");
	 details.setCvvno("123");
	 details.setMonthname("04");
	 details.setExpiryyear("32");
	 details.setPaymentbutton();
	 }

	 @Then("^displays 'Conference Room Booking successfully done!!!'$")
	 public void Registration_Done_Successfully() throws Throwable {
		 Thread.sleep(2000);
		 driver.close();
		 }

}

	

