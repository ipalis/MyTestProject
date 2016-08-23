import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class selectBugTruckerPage {
    private final FirefoxDriver driver;

    public selectBugTruckerPage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public updateBugPage updateBug(String bug){

        driver.findElement(By.xpath(".//*[@id='bug-item-2']/div[1]")).click();
        driver.findElement(By.xpath(".//*[@id='bug-item-2']/div[1]")).sendKeys(bug);
        driver.findElement(By.xpath(".//*[@id='bug-item-2']/div[1]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath(".//*[@id='bug-item-2']/div[1]")).sendKeys(Keys.ENTER);

        return new updateBugPage(driver);
    }
}