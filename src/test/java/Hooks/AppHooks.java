package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class AppHooks
{
    @Before
    public void openbrowser() throws IOException {
        String browser = UtilityClass.getPFData("browserName"); // replace "browser" with your actual key
        DriverFactory.initializeBrowser(browser); // assuming initializebrowser() needs a browser name
    }

    @After
    public void closebrowser()
    {
        DriverFactory.driver.quit();
    }
}
