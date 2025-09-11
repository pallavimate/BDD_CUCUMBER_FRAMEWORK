package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features  ="C:\\Users\\palla\\IdeaProjects\\BDDCucumberFramework\\src\\test\\java\\Feature\\SwagLabRemoveScenario.feature",
        glue ={"Hooks","Steps"}
)
public class SwagLabRemoveScenarioRunner extends AbstractTestNGCucumberTests
{

}
