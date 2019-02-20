package tests;

import org.junit.ClassRule;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@teste", glue = { "classpath:steps" }, monochrome = true, dryRun = false, plugin = { "json:target/cucumber.json"})
public class LocalTest {

	@ClassRule
	public static TestRule testRule = new TestRule();
	
}