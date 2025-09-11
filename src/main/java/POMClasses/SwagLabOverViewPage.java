package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOverViewPage
{
    @FindBy(xpath = "//button[text()='Finish']")private WebElement Finish ;
    public SwagLabOverViewPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void  FinishSwagLabYourCartPage()
    {
        Finish.click();
    }
}
