import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
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

public class testIssueUpdate {

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
    public  void testUpdate() throws InterruptedException, IOException {

        startPage home = new startPage(driver);
        loggedInPage loggedin = home.login("ivanpalis@gmail.com", "1234567890");
        existingUpdate exist = loggedin.existing("Critical", "Windows 7, Firefox 48.0");
        //xxxx - is number of edited issue
        assertTrue(exist.getDescription().equals("CACHE-xxxx has been updated."));

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\testUpdate\\screenshot.png"));

    }
}


