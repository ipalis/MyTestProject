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

public class testExistingIssues {

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
    public  void testIssueUpdate(){

        startPage home = new startPage(driver);
        loggedInPage loggedin = home.login("ivanpalis@gmail.com", "1234567890");
        existingIssues exist = loggedin.existing();
        existingUpdate updateIssue = exist.update();
        //assertTrue(updateIssue.getDescription.equals("Windows 7, Firefox 47.0.1"));

    }
}


