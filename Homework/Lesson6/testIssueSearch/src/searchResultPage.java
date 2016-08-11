import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class searchResultPage {

    private final FirefoxDriver driver;

    public searchResultPage(FirefoxDriver driver) {

        this.driver = driver;
    }
    public Object checkResult(){
        return driver.findElement(By.xpath(".//*[@id='key-val']")).getText();
    }
}
