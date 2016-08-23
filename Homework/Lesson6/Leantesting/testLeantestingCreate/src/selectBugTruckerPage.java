import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class selectBugTruckerPage {
    private final FirefoxDriver driver;

    public selectBugTruckerPage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public newBugCreatePage createNewBug(String bug){

        driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/button")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/button")).sendKeys(bug);
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/button")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/button")).sendKeys(Keys.ENTER);


        return new newBugCreatePage(driver);
    }
}