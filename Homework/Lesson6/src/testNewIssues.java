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

import static org.junit.Assert.assertTrue;

public class testNewIssues {

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
    public void testProfileUserName () throws IOException, AWTException {

        startPage home = new startPage(driver);
        loggedInPage loggedin = home.login("ivanpalis@gmail.com", "1234567890");
        createIssuePage profile = loggedin.createIssue();
        createdIssuePage check = profile.create();
        assertTrue(check.checkPage().equals("Issue CACHE-1209 - My Project has been successfully created."));


        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\screenshot.png"));

    }
}


