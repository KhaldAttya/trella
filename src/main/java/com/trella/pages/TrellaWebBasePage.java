package com.trella.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class TrellaWebBasePage {
    protected WebDriver driver;
    protected Actions actions;

    public TrellaWebBasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    protected void fluentWaitForElement(WebElement webElement) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15L))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(webElement));
    }

    protected void switchToWindowByTitle(String title) {
        String currentWindow = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            if (driver.switchTo().window(winHandle).getTitle().contains(title)) {
                driver.switchTo().window(winHandle);
                break;
            } else {
                driver.switchTo().window(currentWindow);
            }
        }
    }


}
