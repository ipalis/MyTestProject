import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loggedInPage {

    private final FirefoxDriver driver;

    public loggedInPage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public existingIssues existing(){

        driver.findElement(By.xpath(".//*[@id='find_link']")).click();
        driver.findElement(By.xpath(".//*[@id='filter_lnk_reported_lnk']")).click();

        return new existingIssues(driver);
    }
}
