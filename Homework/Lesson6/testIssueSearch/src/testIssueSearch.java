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

public class testIssueSearch {

    private FirefoxDriver driver;


    @Before
    public void startBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");
    }


    @After
    public void closeBrowser(){

        driver.close();
    }


    @Test
    public void testSearch () throws IOException, AWTException {

        startPage home = new startPage(driver);
        loggedInPage loggedin = home.login("ivanpalis@gmail.com", "1234567890");
        searchResultPage profile = loggedin.searchIssue("CACHE-1309");
        assertTrue(profile.checkResult().equals("CACHE-1309"));

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\testSearch\\screenshot.png"));

    }
}
