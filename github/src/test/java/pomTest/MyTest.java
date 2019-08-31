package pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Login;

public class MyTest {
	@Test
	public void validateLogin()
	{
		System.setProperty("webdriver.chrome.driver","C:/BDD043/github/src/test/java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		Login login = new Login(driver);
		login.typeUserName();
		login.typePassword();
		login.typeLoginButton();
		driver.quit();
	}
}
