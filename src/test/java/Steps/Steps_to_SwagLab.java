package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import POMClasses.SwagLabHomePage;
import POMClasses.SwagLabLoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;
import java.io.IOException;

public class Steps_to_SwagLab
{
    SwagLabLoginPage s=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage h=new SwagLabHomePage((DriverFactory.driver));


    @Given("User is on Login Page")
    public void user_is_on_login_page() throws IOException {
        String url = UtilityClass.getPFData("URL");
        DriverFactory.driver.get(url);
         }

    @When("User entered Username as {string}")
    public void user_entered_username_as(String unv) {
        s.SwagLabPomPageusername(unv);
        }

    @When("User entered Password As {string}")
    public void user_entered_password_as(String pwdv) {
        s.SwagLabPomPagePassword(pwdv);
        }

    @When("Click on Login Button")
    public void click_on_login_button() {
        s.SubmitSwagLabPomPage();
        }

    @Then("wait for {int} seconds")
    public void wait_for_seconds(Integer timeInSec)throws InterruptedException {
        Thread.sleep(timeInSec*1000);
    }
    @Then("HomePage will be Visible with logo text {string}")
    public void home_page_will_be_visible_with_logo_text(String ExpectedLogoText) {
        String ActualLogoText=h.GetSwagLabHomePageLogoText();
        Assert.assertEquals(ExpectedLogoText, ActualLogoText,"Actual and expected logo text are different");

    }
    @Given("error msg will displayed msg {string}")
    public void error_msg_will_displayed_msg(String experroemsg)
    {
        String acterrormsg=s.SwagLabLoginPageerrormsg();
        Assert.assertEquals(experroemsg,acterrormsg);
       }


}
