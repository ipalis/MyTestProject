import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class existingUpdate {

        private FirefoxDriver driver;


    public existingUpdate(FirefoxDriver driver) {

        this.driver = this.driver;
    }

    public Object getDescription() {
            return driver.findElement(By.xpath(".//*[@id='descriptionmodule']/div[2]")).getText();

        }
    }

