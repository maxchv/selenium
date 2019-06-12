package org.itstep.google;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebElement q;

    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Step("Open page {url}")
    void openPage(String url) {
        webDriver.get(url);
    }

    @Step("Search for {query}")
    void search(String query) {
        q.sendKeys(query);
        q.submit();
    }

    @Attachment
    @Step("Make screen shot of results page")
    public byte[] makeScreenShot() {
        return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
    }

    public static MainPage newPage(WebDriver driver) {
        return PageFactory.initElements(driver, MainPage.class);
    }
}
