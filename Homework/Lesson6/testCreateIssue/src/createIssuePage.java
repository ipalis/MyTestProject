import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class createIssuePage {


    private final FirefoxDriver driver;

    public createIssuePage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public createdIssuePage create(String project, String type, String summary, String priority, String environment) {

        driver.findElement(By.id("project-single-select")).click();
        driver.findElement(By.id("project-single-select")).sendKeys(project);
        driver.findElement(By.id("project-single-select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("project-single-select")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("issuetype-single-select")).click();
        driver.findElement(By.id("issuetype-single-select")).sendKeys(type);
        driver.findElement(By.id("issuetype-single-select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("issuetype-single-select")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("summary")).clear();
        driver.findElement(By.id("summary")).sendKeys(summary);

        driver.findElement(By.id("priority-single-select")).click();
        driver.findElement(By.id("priority-single-select")).sendKeys(priority);
        driver.findElement(By.id("priority-single-select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("priority-single-select")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(".//*[@id='environment']")).clear();
        driver.findElement(By.xpath(".//*[@id='environment']")).sendKeys(environment);
        driver.findElement(By.xpath(".//*[@id='create-issue-submit']")).click();

        return new createdIssuePage(driver);
    }
}