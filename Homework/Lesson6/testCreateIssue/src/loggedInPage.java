import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loggedInPage {

    private final FirefoxDriver driver;

    public loggedInPage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public createIssuePage createIssue(){

        driver.findElement(By.xpath(".//*[@id='create_link']")).click();

        return new createIssuePage(driver);
    }
}
