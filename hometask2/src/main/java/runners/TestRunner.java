package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					features = "src\\test\\resources\\features",
					glue = {"\\steps"},
					plugin = {"pretty","html:target\\reports\\cucumber-report.html"},
					monochrome = true,
					publish = true
				)


public class TestRunner extends AbstractTestNGCucumberTests {

}
