import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class testCreate {

    private FirefoxDriver driver;


    @Before
    public void startBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://leantesting.com/");
    }


    @After
    public void closeBrowser(){

        driver.close();
    }


    @Test
    public void testSearch () throws IOException, AWTException {

        startPage home = new startPage(driver);
        logInPage logIn = home.click();
        loggedInPage loggedin = logIn.login("ipalis", "1234567890");
        selectProjectPage profile = loggedin.selectProject("My Project");
        selectBugTruckerPage page = profile.selectBugTrucker();
        newBugCreatePage select = page.createNewBug("New bug");
        newBugPage bug = select.createBug("Bug#7", "Low", "Usability", "Major", "Always", "Windows PC", "My description", "My Expected result", "Step1");
        assertTrue(bug.checkResult().equals("Bug#7"));

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\testCreate\\screenshot.png"));

    }
}