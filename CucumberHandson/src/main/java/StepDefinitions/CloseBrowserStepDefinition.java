package StepDefinitions;

import cucumber.api.java.en.Then;

public class CloseBrowserStepDefinition {

	
	@Then("^Close the Browser$")
	public void close_the_Browser(){
		System.out.println("Close the browser");
	}
	
}
