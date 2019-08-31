package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver;
By username = By.id("user_login");
By password = By.xpath(".//*[@id='user_pass']");
By loginButton = By.name("wp-submit");
public Login(WebDriver driver) {
	this.driver=driver;
}
public void typeUserName()
{
	driver.findElement(username).sendKeys("admin");
}
public void typePassword()
{
	driver.findElement(password).sendKeys("demo123");
}
public void typeLoginButton()
{
	driver.findElement(loginButton).click();
}

}
