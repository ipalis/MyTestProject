import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectBugTruckerPage {
    private final FirefoxDriver driver;

    public selectBugTruckerPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public testSearchResult testSearch(String value){

        driver.findElement(By.id("bug-search")).click();
        driver.findElement(By.id("bug-search")).sendKeys(value);
        driver.findElement(By.id("bug-search")).sendKeys(Keys.ENTER);

        return new testSearchResult(driver);
    }
}