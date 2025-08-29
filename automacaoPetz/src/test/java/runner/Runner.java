package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features/PetzTest.feature",
        glue = "runner",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class Runner {
}

