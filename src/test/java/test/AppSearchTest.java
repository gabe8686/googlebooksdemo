package test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(
		glue = "step_definitions",
		monochrome = true,
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber/AppSearchTest.json"},
		tags = { " @search", "~@ignore"
		}

)
public class AppSearchTest {

}