package com.CucumberApiExample.ConferenceRegistration;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasePage {
	public static RemoteWebDriver Driver;

	public void StartBrowser(String BrowserName) {
		switch (BrowserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
			Driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\path\\geckodriver.exe");
			Driver = new FirefoxDriver();

		}

	}

	public void openURL(String URL) {

		Driver.get(URL);

	}

	public String GetPageTitle() {
		String PageTitle = Driver.getTitle();
		return PageTitle;
	}

	public void Stop() {
		Driver.quit();
	}

	
}
