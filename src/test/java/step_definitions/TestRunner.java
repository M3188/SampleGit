package step_definitions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Signup.feature",
        glue = {"step_definitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json"})
public class TestRunner {
}
