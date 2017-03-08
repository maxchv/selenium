package org.itstep.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Sample page
 */
public class HomePage extends Page {

    @FindBy(name = "q")
    public WebElement q;

    @FindBy(id="resultStats")
    public WebElement resultStats;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String query(String text) {
        q.sendKeys(text);
        q.submit();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
        return resultStats.getText();
    }

}
