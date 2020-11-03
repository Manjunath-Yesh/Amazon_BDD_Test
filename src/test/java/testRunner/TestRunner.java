package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features//",
		glue="stepDefinations",
		dryRun=false,
		monochrome=true,
		//tags= {"@regression"},
		//plugin= {"pretty","html:test-output"}
		plugin = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit-xml/cucumber.xml"}
		)
public class TestRunner {

}
