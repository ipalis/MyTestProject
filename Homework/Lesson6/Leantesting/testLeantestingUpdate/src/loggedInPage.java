import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loggedInPage {
    private final FirefoxDriver driver;

    public loggedInPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public selectProjectPage selectProject(String project) {

        driver.findElement(By.id("jump-to-project")).click();
        driver.findElement(By.id("jump-to-project")).sendKeys(project);
        driver.findElement(By.id("jump-to-project")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("jump-to-project")).sendKeys(Keys.ENTER);

        return new selectProjectPage(driver);
    }
}
