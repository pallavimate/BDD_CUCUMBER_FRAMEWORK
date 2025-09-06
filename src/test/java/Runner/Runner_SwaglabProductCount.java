package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features  ="C:\\Users\\palla\\IdeaProjects\\BDDCucumberFramework\\src\\test\\java\\Feature\\SwaglabProductCount.feature",
            glue ={"Hooks","Steps"},
            plugin = {"pretty","html:Reports\\login.html"}
    )
    public class Runner_SwaglabProductCount extends AbstractTestNGCucumberTests {

    }


