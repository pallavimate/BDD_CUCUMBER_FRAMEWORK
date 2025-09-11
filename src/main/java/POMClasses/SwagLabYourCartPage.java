package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabYourCartPage
{
    @FindBy(xpath = "//button[@id='checkout']")private WebElement Checkout ;
    @FindBy(xpath = "//button[text()='Remove']")private WebElement Removebackpack ;

    public SwagLabYourCartPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void  CheckoutSwagLabYourCartPage()
    {
        Checkout.click();
    }
    public void RemovebackpackSwagLabYourCartPage()
    {
        Removebackpack.click();
    }

}
