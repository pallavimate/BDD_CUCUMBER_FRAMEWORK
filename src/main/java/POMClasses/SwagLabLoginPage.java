package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static LibraryFiles.DriverFactory.driver;

public class SwagLabLoginPage
{
   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   // WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='input_error form_input']")));

    @FindBy(xpath = "//input[@class='input_error form_input']")private WebElement name;
    @FindBy(xpath = "//input[@id='password']")private WebElement pass;
    @FindBy(xpath = "//input[@class='submit-button btn_action']")private WebElement submit;
    @FindBy(xpath = "//div[@class='error-message-container error']")private WebElement error;

    public SwagLabLoginPage(WebDriver driver)
  {
      PageFactory.initElements(driver, this);
  }

  public  void SwagLabPomPageusername(String Unvalue)
  {
      name.sendKeys(Unvalue);
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



