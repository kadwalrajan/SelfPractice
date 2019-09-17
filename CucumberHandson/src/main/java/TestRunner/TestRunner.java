package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "R:\\Data\\Selenium Practice\\SelfPractice\\CucumberHandson\\src\\test\\java\\Features\\login.feature",
		glue = { "StepDefinitions" } // the path of the step definition files
// format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate different types of reporting
)

public class TestRunner {

}