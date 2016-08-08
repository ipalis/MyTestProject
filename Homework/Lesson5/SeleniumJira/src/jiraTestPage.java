import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.monte.screenrecorder.ScreenRecorder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class jiraTestPage {

    private FirefoxDriver driver;
    private static ScreenRecorder screenRecorder;


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

    @BeforeMethod
    public void startRecord() throws IOException {
        screenRecorder.start();
    }

    @AfterMethod
    public void stopRecord() throws IOException {
        screenRecorder.stop();
    }

    @Test
    public void testProfileUserName () throws IOException, AWTException {

        startPage home = new startPage(driver);
        loggedInPage loggedin = home.login("svv.tes@gmail.com", "1234567890");
        profilePage profile = loggedin.openProfile();
        assertTrue(profile.getUserName().equals("testuser"));


        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\screenshot.png"));


        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        screenRecorder = new ScreenRecorder(gc);

    }



}