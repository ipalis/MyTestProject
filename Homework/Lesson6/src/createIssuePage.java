import org.openqa.jetty.html.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class createIssuePage {


    private final FirefoxDriver driver;
    public String summary;

    public createIssuePage(FirefoxDriver driver) {

        this.driver = driver;
    }

    public createdIssuePage create() {

      /*  driver.findElement(By.xpath(".//*[@id='project-field']")).click();
        driver.findElement(By.xpath("//img[contains(@src='https://jira.atlassian.com/secure/projectavatar?size=xsmall&pid=11961&avatarId=10011')]")).click();
*/
        WebElement mySelectElm = driver.findElement(By.id("project-field"));
        Select mySelect= new Select(mySelectElm);
        List<WebElement> options = mySelect.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("atlassian-cache (CACHE)")) {
                option.click();
            }
        }
/*
        WebElement projectField = driver.findElement(By.id("project-field"));
        Select select = new Select(projectField);
        select.deselectAll();
        select.selectByVisibleText("atlassian-cache (CACHE)");

        WebElement issueTypeField = driver.findElement(By.id("issuetype-suggestions"));
        select = new Select(issueTypeField);
        select.selectByVisibleText("Bug");

        driver.findElement(By.id("project-field")).click();
        driver.findElement(By.cssSelector(".aui-list-item-link.aui-iconised-link")).click();
        driver.findElement(By.id("summary")).clear();
        driver.findElement(By.id("summary")).sendKeys("My Project");
        driver.findElement(By.xpath(".//*[@id='environment']")).clear();
        driver.findElement(By.xpath(".//*[@id='environment']")).sendKeys("Windows 7, Firefox 48.0");
        driver.findElement(By.xpath(".//*[@id='create-issue-submit']")).click();*/




        return new createdIssuePage(driver);
    }



}