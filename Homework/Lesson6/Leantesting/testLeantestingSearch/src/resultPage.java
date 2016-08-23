import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class resultPage {

    private final FirefoxDriver driver;

    public resultPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public Object checkResult(){

        return driver.findElement(By.xpath(".//*[@id='bug-item-1']/div[1]")).getTagName();
    }
}