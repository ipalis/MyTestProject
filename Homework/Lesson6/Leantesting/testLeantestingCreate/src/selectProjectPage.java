import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class selectProjectPage {
    private final FirefoxDriver driver;

    public selectProjectPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public selectBugTruckerPage selectBugTrucker(){

        driver.findElement(By.xpath("html/body/header/nav[2]/ul/li[2]/a/div")).click();


        return new selectBugTruckerPage(driver);
    }
}