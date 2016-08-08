import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Test is as follows
Open startPage http://134.249.184.92:8080/login.jsp
login as user1 /	password 12
Go to profile page
Verify that full name of user is admin1
*/

public class jiraTestPage {

    private FirefoxDriver driver;

    @Before
    public void startBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");
    }
        @After
        public void closeBrowser() {
            driver.close();
        }

            @Test
            public void testProfileUserName () {

                startPage home = new startPage(driver);
                loggedInPage loggedin = home.login("svv.tes@gmail.com", "1234567890");
                profilePage profile = loggedin.openProfile();
                assertTrue(profile.getUserName().equals("testuser"));
            }

        }