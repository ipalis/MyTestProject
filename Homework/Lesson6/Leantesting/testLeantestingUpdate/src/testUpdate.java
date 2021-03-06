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

public class testUpdate {

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
    public void testUpdate () throws IOException, AWTException {

        startPage home = new startPage(driver);
        logInPage logIn = home.click();
        loggedInPage loggedin = logIn.login("ipalis", "1234567890");
        selectProjectPage profile = loggedin.selectProject("My Project");
        selectBugTruckerPage page = profile.selectBugTrucker();
        updateBugPage update = page.updateBug("Bug#3");
        updatedBugPage bug = update.updatedBug("It's my comment");
        assertTrue(bug.checkResult().equals("added a new comment"));

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\testUpdate\\screenshot.png"));

    }
}