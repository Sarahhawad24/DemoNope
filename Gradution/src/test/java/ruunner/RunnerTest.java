package ruunner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features" ,
        glue = "StepsDef"
)

public class RunnerTest extends TestBase {
}
