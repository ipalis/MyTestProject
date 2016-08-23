import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class logInPage {
    private final FirefoxDriver driver;

    public logInPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public loggedInPage login(String login, String password) {

        driver.findElement(By.id("UserForm_username")).clear();
        driver.findElement(By.id("UserForm_username")).sendKeys(login);
        driver.findElement(By.id("UserForm_password")).clear();
        driver.findElement(By.id("UserForm_password")).sendKeys(password);
        driver.findElement(By.id("login-form")).click();

        return new loggedInPage(driver);
    }
}
