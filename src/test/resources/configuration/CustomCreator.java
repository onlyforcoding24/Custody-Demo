package kotak.custody.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"kotak.custody.steps","com.testingblaze.actionsfactory.gherkin","com.testingblaze.register"},
        features = {"target/parallel/features/[CUCABLE:FEATURE].feature"},
        plugin = {"json:target/cucumber-report/[CUCABLE:RUNNER].json","com.testingblaze.controller.ReportingLogsPlugin"},
        tags = {"not @wip"},
        monochrome = true,
        strict = true
)
public class CustomCreator {
}
