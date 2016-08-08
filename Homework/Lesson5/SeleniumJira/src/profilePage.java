import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ivan on 31.07.2016.
 */
public class profilePage {


    private FirefoxDriver driver;

    public profilePage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public Object getUserName() {
        return driver.findElement(By.id("up-user-title-name")).getText();

    }
}