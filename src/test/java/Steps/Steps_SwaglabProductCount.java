package Steps;

import LibraryFiles.DriverFactory;
import POMClasses.SwagLabHomePage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class Steps_SwaglabProductCount {

    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);

    @Then("User can see {int} products")
    public void user_can_see_products(Integer expcount) {
        int actcount=home.productCount();
        Assert.assertEquals(expcount,actcount);
        }

    @Then("Price of SaucelabBackPack should be {double}")
    public void price_of_saucelab_back_pack_should_be(Double expproductprice) {
        Double actproductprice=home.getpprice();
                Assert.assertEquals(expproductprice,actproductprice);
         }

    @Then("Price of All Product should be {double}")
    public void price_of_all_product_should_be(Double exptotalProductPrice) {
        double acttotalProductPrice = home.getallproductprice();
        Assert.assertEquals(exptotalProductPrice,acttotalProductPrice);
    }


}