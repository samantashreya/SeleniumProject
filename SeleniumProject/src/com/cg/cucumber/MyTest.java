package com.cg.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/BDD043/SeleniumProject/src/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		WebElement element = driver.findElement(By.name("q"));
		Thread.sleep(5000);
		element.sendKeys("java");
		element.submit();
		Thread.sleep(4000);
		driver.quit();
	}

}
