import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;

import java.util.concurrent.TimeUnit;


public class loggedInPage {

    private FirefoxDriver driver;
    private Keyboard webDriver;

    public loggedInPage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public existingUpdate existing(String priority, String environment) throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='find_link']")).click();
        driver.findElement(By.xpath(".//*[@id='filter_lnk_reported_lnk']")).click();

        //this you should give xPath to edited issue
        driver.findElement(By.xpath("Your xPath")).click();


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('edit-issue').click();");

        driver.findElement(By.id("priority-single-select")).sendKeys(priority);
        driver.findElement(By.id("priority-single-select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("priority-single-select")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("priority-single-select")).click();

        driver.findElement(By.xpath(".//*[@id='environment']")).clear();
        driver.findElement(By.xpath(".//*[@id='environment']")).sendKeys(environment);

               driver.findElement(By.xpath(".//*[@id='edit-issue-submit']")).click();

        return new existingUpdate(driver);
    }
}
