package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabYourInformationPage
{
    @FindBy(xpath = "//input[@id='first-name']")private WebElement FirstName ;
    @FindBy(xpath = "//input[@id='last-name']")private WebElement LastNmae ;
    @FindBy(xpath = "//input[@id='postal-code']")private WebElement Pincode ;
    @FindBy(xpath = "//input[@id='continue']")private WebElement Continue ;
    public SwagLabYourInformationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void FirstNameSwagLabYourInformationPage (String fn)
    {
        FirstName.sendKeys(fn);
    }
    public void LastNameSwagLabYourInformationPage  (String ln)
    {
        LastNmae.sendKeys(ln);
    }
    public void PincodeSwagLabYourInformationPage  (String pc)
    {
        Pincode.sendKeys(pc);
    }
    public void ContinueSwagLabYourInformationPage ()
    {
        Continue.click();
    }
}
