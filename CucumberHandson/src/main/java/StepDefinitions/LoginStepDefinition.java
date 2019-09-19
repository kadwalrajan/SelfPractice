package StepDefinitions;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {
//	WebDriver driver;
//
	@Given("^user is already on Google Search Page$")
	public void user_is_already_on_Google_Search_Page(){
		System.out.println("Scenario1 Given");
	}

	@Given("^user what is the capital of Canada in the search page$")
	public void user_what_is_the_capital_of_Canada_in_the_search_page(){
		System.out.println("Scenario2 Given");
		System.out.println("My new name");
	}

	@Then("^user clicks on the search button$")
	public void user_clicks_on_the_search_button(){
		System.out.println("Scenario2 Then");
	}
}
