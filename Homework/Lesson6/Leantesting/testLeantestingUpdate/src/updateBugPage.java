import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class updateBugPage {
    private final FirefoxDriver driver;

    public updateBugPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public updatedBugPage updatedBug(String comment){

        driver.findElement(By.id("Comment_text")).clear();
        driver.findElement(By.id("Comment_text")).sendKeys(comment);
        driver.findElement(By.xpath(".//*[@id='form-comment-create']/div/div/div[2]/div/button")).click();

        driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div[9]/div/div/button")).click();



        return new updatedBugPage(driver);
    }
}