package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabComplePage
{
    @FindBy(xpath = "//h2[@class='complete-header']")private WebElement CompleteMessage ;
    public SwagLabComplePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public String CompleteMessageSwagLabYourCartPage()
    {
        String ActMsg = CompleteMessage.getText();
        return ActMsg;
    }
}
