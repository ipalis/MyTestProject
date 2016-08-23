import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class newBugCreatePage {
    private final FirefoxDriver driver;

    public newBugCreatePage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public newBugPage createBug(String name, String priority, String type, String severity, String reproducibility,
                                String device, String description, String expected, String step1){

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_title']")).clear();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_title']")).sendKeys(name);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_title']")).click();

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_priority_id']")).click();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_priority_id']")).sendKeys(priority);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_priority_id']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_priority_id']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_types_id']")).click();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_types_id']")).sendKeys(type);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_types_id']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_bug_types_id']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_severity']")).click();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_severity']")).sendKeys(severity);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_severity']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_severity']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_reproducibility']")).click();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_reproducibility']")).sendKeys(reproducibility);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_reproducibility']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_reproducibility']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_device_type_id']")).click();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_device_type_id']")).sendKeys(device);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_device_type_id']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_device_type_id']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_description']")).clear();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_description']")).sendKeys(description);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_description']")).click();

        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_expected_results']")).clear();
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_expected_results']")).sendKeys(expected);
        driver.findElement(By.xpath(".//*[@id='ReportBugFormModal_expected_results']")).click();

        driver.findElement(By.xpath(".//*[@id='bug_steps']")).clear();
        driver.findElement(By.xpath(".//*[@id='bug_steps']")).sendKeys(step1);
        driver.findElement(By.xpath(".//*[@id='bug_steps']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath(".//*[@id='bug_steps']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(".//*[@id='form-bug-create']/div[3]/div/div/div[3]/button")).click();


        return new newBugPage(driver);
    }
}