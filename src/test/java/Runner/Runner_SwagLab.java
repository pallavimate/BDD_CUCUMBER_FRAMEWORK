package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       // features  ="C:\\Users\\palla\\IdeaProjects\\BDDCucumberFramework\\src\\test\\java\\Feature\\Login_to_saglab.feature",
       // features  ="C:\\Users\\palla\\IdeaProjects\\BDDCucumberFramework\\src\\test\\java\\Feature\\SwaglabProductCount.feature",
        features  ="C:\\Users\\palla\\IdeaProjects\\BDDCucumberFramework\\src\\test\\java\\Feature\\EtE_SwagLabOrderProduct.feature",
        glue ={"Hooks","Steps"},
        plugin = {"pretty","html:Reports\\login.html"}
)
public class Runner_SwagLab extends AbstractTestNGCucumberTests {

}
