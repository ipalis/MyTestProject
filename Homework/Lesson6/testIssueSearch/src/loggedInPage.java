import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loggedInPage {

    private final FirefoxDriver driver;

    public loggedInPage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public searchResultPage searchIssue(String value){

        driver.findElement(By.xpath(".//*[@id='quickSearchInput']")).click();
        driver.findElement(By.xpath(".//*[@id='quickSearchInput']")).sendKeys(value);
        driver.findElement(By.xpath(".//*[@id='quickSearchInput']")).sendKeys(Keys.ENTER);

        return new searchResultPage(driver);
    }
}
