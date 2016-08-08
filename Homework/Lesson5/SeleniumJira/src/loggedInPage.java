import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ivan on 31.07.2016.
 */
public class loggedInPage {

    private final FirefoxDriver driver;

    public loggedInPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public profilePage openProfile(){

        driver.findElement(By.xpath(".//*[@id='header-details-user-fullname']")).click();
        driver.findElement(By.id("view_profile")).click();


        return new profilePage(driver);
    }
}
