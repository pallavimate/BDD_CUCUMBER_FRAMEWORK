package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
    @FindBy(xpath = "//input[@id='user-name']")private WebElement name;
    @FindBy(xpath = "//input[@id='password']")private WebElement pass;
    @FindBy(xpath = "//input[@class='submit-button btn_action']")private WebElement submit;
    @FindBy(xpath = "//div[@class='error-message-container error']")private WebElement error;

    public SwagLabLoginPage(WebDriver driver)
  {
      PageFactory.initElements(driver, this);
  }
  public  void SwagLabPomPageusername(String unvalue)
  {
      name.sendKeys(unvalue);
  }
    public  void SwagLabPomPagePassword(String Passvalue)
    {
        pass.sendKeys(Passvalue);
    }
    public  void SubmitSwagLabPomPage()
    {
        submit.click();
    }
    public String SwagLabLoginPageerrormsg()
    {
        String acterrormsg = error.getText();
        return acterrormsg;
    }
}



