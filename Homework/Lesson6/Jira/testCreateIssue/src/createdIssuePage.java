import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createdIssuePage {

    private final FirefoxDriver driver;

    public createdIssuePage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public Object getLink(){


            return driver.findElement(By.xpath(".//*[@id='aui-flag-container']/div/div")).getText();
    }
}
