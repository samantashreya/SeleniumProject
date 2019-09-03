package com.capgemini.vrs.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class VehicleBean {

	WebDriver driver;

	@FindBy(how = How.NAME, name = "title")
	private WebElement title;

	@FindBy(how = How.NAME, name = "ownername")
	private WebElement ownerName;

	@FindBy(how = How.NAME, name = "gender")
	private List<WebElement> gender;

	@FindBy(how = How.NAME, name = "address")
	private WebElement address;

	@FindBy(how = How.ID, id = "city")
	private WebElement city;

	@FindBy(how = How.NAME, name = "state")
	private WebElement state;

	@FindBy(how = How.NAME, name = "country")
	private WebElement country;

	@FindBy(how = How.NAME, name = "zip")
	private WebElement zip;

	@FindBy(how = How.NAME, name = "vehicletype")
	private List<WebElement> vehicleType;

	@FindBy(how = How.NAME, name = "fueltype")
	private List<WebElement> fuelType;

	@FindBy(how = How.NAME, name = "mfg")
	private WebElement yearOfMfg;

	@FindBy(how = How.NAME, name = "submit")
	private WebElement submitButton;

	public VehicleBean(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public String getTitle() {
		return new Select(this.title).getFirstSelectedOption().getText();
	}

	public void setTitle(String title) {
		Select select = new Select(this.title);
		select.selectByVisibleText(title);
	}

	public String getOwnerName() {
		return ownerName.getAttribute("value");
	}

	public void setOwnerName(String ownerName) {
		this.ownerName.clear();
		this.ownerName.sendKeys(ownerName);
	}

	public String getGender() {

		for (WebElement element : gender) {
			if (element.isSelected()) {
				return element.getAttribute("value");
			}
		}
		return null;
	}

	public void setGender(String gender) {
		if (gender.equals("Male"))
			this.gender.get(0).click();
		else
			this.gender.get(1).click();
	}

	public String getAddress() {
		return this.address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.address.clear();
		this.address.sendKeys(address);
	}

	public String getCity() {
		return this.city.getAttribute("value");
	}

	public void setCity(String city) {
		this.city.clear();
		this.city.sendKeys(city);
	}

	public String getState() {
		return this.state.getAttribute("value");
	}

	public void setState(String state) {
		this.state.clear();
		this.state.sendKeys(state);
	}

	public String getCountry() {
		return new Select(this.country).getFirstSelectedOption().getText();
	}

	public void setCountry(String country) {
		Select select = new Select(this.country);
		select.selectByVisibleText(country);
	}

	public String getZip() {
		return zip.getAttribute("value");
	}

	public void setZip(String zip) {
		this.zip.clear();
		this.zip.sendKeys(zip);
	}

	public String getVehicleType() {
		for (WebElement element : vehicleType) {
			if (element.isSelected()) {
				return element.getAttribute("value");
			}
		}
		return null;
	}

	public void setVehicleType(String vehicleType) {
		if (vehicleType.equals("4wheeler"))
			this.vehicleType.get(0).click();
		else
			this.vehicleType.get(1).click();
	}

	public String getFuelType() {

		for (WebElement element : fuelType) {
			if (element.isSelected()) {
				return element.getAttribute("value");
			}
		}
		return null;
	}

	public void setFuelType(String fuelType) {
		if (fuelType.equals("petrol"))
			this.fuelType.get(0).click();
		else
			this.fuelType.get(1).click();
	}

	public String getYearOfMfg() {
		return new Select(this.yearOfMfg).getFirstSelectedOption().getText();
	}

	public void setYearOfMfg(String yearOfMfg) {
		Select select = new Select(this.yearOfMfg);
		select.selectByVisibleText(yearOfMfg);
	}

	public void clickSubmit() {
		this.submitButton.submit();
	}

	
	
	//for check box
	/*public String getType() {
		return null;
	}

	public void setType(String[] type1) {
		for (String type : type1) {
			if (type1.equals("A"))
				this.type.get(0).click();
			else if (type1.equals("B"))
				this.type.get(1).click();
		}
	}
*/
	
}
