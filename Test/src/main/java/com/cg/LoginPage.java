/**
 * Program is configured to close web page automatically after 2 seconds of completion
 * of task to let evaluator see the "Alert Box Message"
 * So, kindly don't disturb the process by manually closing the web pages.
 */

package com.cg;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {
	@FindBy(name = "userid")
	WebElement id;

	@FindBy(name = "passid")
	WebElement pass;

	@FindBy(name = "username")
	WebElement name;

	@FindBy(name = "address")
	WebElement address;

	@FindBy(name = "country")
	WebElement country;

	@FindBy(name = "zip")
	WebElement zip;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(css = "input[value='Male']")
	WebElement gender_male;

	@FindBy(css = "input[value='Female']")
	WebElement gender_female;

	@FindBy(css = "input[value='noen']")
	WebElement lang_noen;

	@FindBy(css = "input[value='en']")
	WebElement lang_en;

	@FindBy(name = "submit")
	WebElement submit_btn;
	
	@FindBy(name="desc")
	WebElement about;
	
	//Setters for Web Elements of Page
	
	public void setAbout(String about)
	{
		this.about.sendKeys(about);
	}

	public void setUserId(String id) {
		this.id.sendKeys(id);
	}

	public void setPass(String pass) {

		this.pass.sendKeys(pass);
	}

	public void setName(String name) {
		this.name.sendKeys(name);
	}

	public void setAddress(String addr) {
		this.address.sendKeys(addr);
	}

	public void setCountry(String coun) {
		coun = coun.toLowerCase();
		switch (coun) {
		case "australia":
			selectValueFromComboBox(country, "AF");
			break;
		case "canada":
			selectValueFromComboBox(country, "AL");
			break;
		case "india":
			selectValueFromComboBox(country, "DZ");
			break;
		case "russia":
			selectValueFromComboBox(country, "AS");
			break;
		case "usa":
			selectValueFromComboBox(country, "AD");
			break;
		}
	}
	
	public void setEmail(String email)
	{
		this.email.sendKeys(email);
	}
	
	public void setZip(String zip)
	{
		this.zip.sendKeys(zip);
	}

	public void setGender(String sex)
	{
		sex = sex.toLowerCase();
		if(sex.equals("male"))
			this.gender_male.click();
		if(sex.equals("female"))
			this.gender_female.click();
	}
	
	public void setLanguage(String lang)
	{
		lang = lang.toLowerCase();
		if(lang.equals("non english"))
		{
			this.lang_en.click();
			this.lang_noen.click();
		}
		
	}
	
	public void clickSubmit()
	{
		this.submit_btn.click();
	}
	
	// Initializing Driver
	public void initializeElements() {
		PageFactory.initElements(driver, this); // starts finding the annotated elements from html page
	}
	
	//Alert box message check function
	public void checkAlert(String str)
	{
		Alert al = driver.switchTo().alert();
		String alertText = al.getText();
		assertEquals(alertText, str);
	}

	public String getTitle() { //AlertText.contains("expected_text")
		return driver.getTitle();
	}

	public void close() {
		driver.quit();
	}

}
