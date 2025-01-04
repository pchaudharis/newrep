package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src\\test\\java\\features",
	glue="steps",
	plugin= {
			"pretty",
			"html:target/cucumber/report.html",
			"json:target/cucumber/report.json",
			"json:target/cucumber/report.xml",
			"timeline:target/cucumber"
			
			
	}
	
	
	)
public class testRunner {

	
	
	
}
