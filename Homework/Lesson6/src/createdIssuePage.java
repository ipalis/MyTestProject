import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ivan on 05.08.2016.
 */
public class createdIssuePage {

    private final FirefoxDriver driver;

    public createdIssuePage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public Object checkPage(){
        return driver.findElement(By.id("aui-flag-container")).getText() ;
    }
}
