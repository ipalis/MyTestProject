import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startPage {

    private final FirefoxDriver driver;

    public startPage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public logInPage click(){

        driver.findElement(By.xpath(".//*[@id='navbar']/ul[2]/li[2]/a")).click();

        return new logInPage(driver);
    }
}