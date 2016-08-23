import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class existingUpdate {

        private FirefoxDriver driver;

    public existingUpdate(FirefoxDriver driver) {
        this.driver = driver;
    }


    public Object getDescription() {

            return driver.findElement(By.xpath(".//*[@id='aui-flag-container']/div/div")).getText();

        }
    }

