package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnElement(By ElementLocator) {
        //for wait time
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
        ScrollElementView(ElementLocator);
        driver.findElement(ElementLocator).click();

    }

    public void SetElementText(By ElementLocator, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
        ScrollElementView(ElementLocator);
        driver.findElement(ElementLocator).sendKeys(text);


    }

    public String GetText(By ElementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
        ScrollElementView(ElementLocator);
        return
        driver.findElement(ElementLocator).getText();
    }

    public void ClearElement(By ElementLocator) {
        driver.findElement(ElementLocator).clear();

    }

    public void ScrollElementView(By ElementLocator) {
        WebElement element = driver.findElement(ElementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }
}