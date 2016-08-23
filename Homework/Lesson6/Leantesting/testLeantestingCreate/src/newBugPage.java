import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newBugPage {
    private final FirefoxDriver driver;

    public newBugPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public String checkResult() {
        return driver.findElement(By.xpath(".//*[@id='Seamless_ReportBugForm_title']/span")).getText();
    }
}