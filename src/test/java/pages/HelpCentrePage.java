package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.Locators;

public class HelpCentrePage {

    WebDriver driver;
    WebDriverWait wait;

    public HelpCentrePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickHelpCenter() {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(Locators.helpCenterBtn));
        btn.click();
    }

    public void selectService(String serviceName) {
        // right now using absolute XPath, can improve by text if available
        WebElement service = wait.until(ExpectedConditions.elementToBeClickable(Locators.serviceOption));
        service.click();
    }

    public void selectIssue(String issueName) {
        WebElement issue = wait.until(ExpectedConditions.elementToBeClickable(Locators.issueOption));
        issue.click();
    }

    public void closeHelpCenterPanel() {
        WebElement close = wait.until(ExpectedConditions.elementToBeClickable(Locators.closeBtn));
        close.click();
    }
}
