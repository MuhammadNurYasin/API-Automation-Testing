package task;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:cucumber-report.html", "json:cucumber-json.json"},
        features = "classpath:features/bddtask"

)
public class taskRunner {}
