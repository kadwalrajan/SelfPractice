package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on Google Search Page$")
	public void user_is_already_on_Google_Search_Page() {
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver", "R:\\Data\\Selenium Practice\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
	}
}
