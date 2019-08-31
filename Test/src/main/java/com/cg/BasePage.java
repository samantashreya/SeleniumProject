/**
 * Program is configured to close web page automatically after 2 seconds of completion
 * of task to let evaluator see the "Alert Box Message"
 * So, kindly don't disturb the process by manually closing the web pages.
 */

package com.cg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	static WebDriver driver;

	public void startBrowser(String bName) {
			System.setProperty("webdriver.chrome.driver", "C:/BDD043/Test/src/main/java/chromedriver.exe");

			driver = new ChromeDriver();
		
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void stop() {
		driver.quit();
	}

	public static void selectValueFromComboBox(WebElement e, String value) {
		Select se = new Select(e);
		se.selectByValue(value);
	}
}
