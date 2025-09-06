package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwagLabHomePage {
    @FindBy(xpath = "//div[@class='app_logo']")private WebElement logo;
    @FindBy(xpath = "//div[@class='inventory_item_name ']")private List<WebElement> allpcount;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")private WebElement productprice;
    @FindBy(xpath = "//div[@class='inventory_item_price']")private List<WebElement> allproductprice;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement AddToCartProduct;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement GoTocart;


    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public String GetSwagLabHomePageLogoText()
    {
        String Actuallogotext = logo.getText();
        return Actuallogotext;
    }
    public int productCount()
    {
        int actprocount = allpcount.size();
        return actprocount;
    }
    public double getpprice()
    {
        String actualproductprice = productprice.getText();
        actualproductprice= actualproductprice.substring(1);
        double actprice = Double.parseDouble(actualproductprice);
        return actprice;
    }
    public double getallproductprice() {
        double acttotalproductprice=0.00;
                for(WebElement s1:allproductprice)
                {
                    String text = s1.getText();
                 text= text.substring(1);
                    double price = Double.parseDouble(text);
                    acttotalproductprice=acttotalproductprice+price;
                    }
                return acttotalproductprice;

    }
    public void AddToCartProductSwagLabHomePage()
    {
        AddToCartProduct.click();

    }
    public void GoToCartSwagLabHomePage()
    {
        GoTocart.click();

    }

}
