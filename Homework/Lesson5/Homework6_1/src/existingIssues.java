import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class existingIssues {

    private final FirefoxDriver driver;

    public existingIssues(FirefoxDriver driver) {
        this.driver = driver;

    }

    public existingUpdate update(){

        driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div/ol/li[2]")).click();
        driver.findElement(By.xpath(".//*[@id='edit-issue']")).click();
        driver.findElement(By.xpath(".//*[@id='description']")).clear();
        driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Windows 7, Firefox 47.0.1");
        driver.findElement(By.xpath(".//*[@id='description-form']/div[2]/div[2]/button[1]")).click();


        return new existingUpdate(driver);
    }
}
