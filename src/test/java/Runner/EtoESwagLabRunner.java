package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features  ="C:\\Users\\palla\\IdeaProjects\\BDDCucumberFramework\\src\\test\\java\\Feature\\EtE_SwagLabOrderProduct.feature",
        glue ={"Hooks","Steps"}
    //    plugin = {"pretty","html:Reports\\login.html"}
)
public class EtoESwagLabRunner extends AbstractTestNGCucumberTests
{

}