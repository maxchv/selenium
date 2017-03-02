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

    @FindBy(how = How.TAG_NAME, using = "h1")
    @CacheLookup
    public WebElement header;

    @FindBy(name = "q")
    public WebElement q;

    @FindBy(id = "resultStats")
    public WebElement resultStats;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void queryItstep(String query) {
        q.sendKeys(query);
        q.submit();
    }
}
