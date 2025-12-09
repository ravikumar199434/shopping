package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "TestcaseDes",
		glue = "stepdefinition",
		dryRun = false,
		tags = "@negative or @positive",
		monochrome = true,
		plugin = {"pretty","html:target/my_report/login.html"}
			
)

public class Runner 
{
	//empty
}
