import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class updatedBugPage {
    private final FirefoxDriver driver;

    public updatedBugPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public String checkResult() {
        return driver.findElement(By.xpath(".//*[@id='listview-activity']/div[1]/div[1]/div/div/div/ul/li[3]/a")).getText();
    }
}