import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testSearchResult {
    private final FirefoxDriver driver;

    public testSearchResult(FirefoxDriver driver) {

        this.driver = driver;
    }

        public Object checkResult(){

            return driver.findElement(By.xpath(".//*[@id='bug-item-1']/div[6]/div")).getText();
        }
    }