package Steps;

import LibraryFiles.DriverFactory;
import POMClasses.*;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class Steps_EtE_SwagLabOrderProduct
{
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
    SwagLabYourCartPage cart=new SwagLabYourCartPage(DriverFactory.driver);
    SwagLabYourInformationPage info=new SwagLabYourInformationPage(DriverFactory.driver);
    SwagLabOverViewPage overview=new SwagLabOverViewPage(DriverFactory.driver);
    SwagLabComplePage Completepage=new SwagLabComplePage(DriverFactory.driver);

    @When("user click on add to cart option for the product sauce labs backpack")
    public void user_click_on_add_to_cart_option_for_the_product_sauce_labs_backpack() {
        home.AddToCartProductSwagLabHomePage();

        }

    @When("Click on add to cart option")
    public void click_on_add_to_cart_option() {
        home.GoToCartSwagLabHomePage();
        }

    @When("User click on Checkout button")
    public void user_click_on_checkout_button() {
        cart.CheckoutSwagLabYourCartPage();
        }

    @When("user enter first name as {string}")
    public void user_enter_first_name_as(String fn) {
       info.FirstNameSwagLabYourInformationPage(fn);
        }

    @When("User enter password as {string}")
    public void user_enter_password_as(String ln) {
        info.LastNameSwagLabYourInformationPage(ln);
        }

    @When("user enter pincode as {int}")
    public void user_enter_pincode_as(Integer pincode) {
        String pincodeString = Integer.toString(pincode);
        info.PincodeSwagLabYourInformationPage(pincodeString);
        }

    @When("user click on continue button")
    public void user_click_on_continue_button() {
        info.ContinueSwagLabYourInformationPage();
       }

    @When("user click on finish button")
    public void user_click_on_finish_button() {
        overview.FinishSwagLabYourCartPage();
       }

    @Then("order place message should be visible {string}")
    public void order_place_message_should_be_visible(String expmsg) {
        String actmsg = Completepage.CompleteMessageSwagLabYourCartPage();
        Assert.assertEquals(expmsg,actmsg);
         }

}
