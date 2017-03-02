package org.itstep;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by User on 02.03.2017.
 */
public class UsingSeleniumGrid {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities desiredCapabilites = DesiredCapabilities.firefox();
        //desiredCapabilites.setBrowserName("firefox");
        desiredCapabilites.setJavascriptEnabled(true);
        desiredCapabilites.setPlatform(Platform.WIN8_1);
        WebDriver remoteWebDriver =
                new RemoteWebDriver(new URL("http://10.1.1.103:4444/wd/hub"),
                                    desiredCapabilites);
        remoteWebDriver.get("http://google.com");
        WebElement q = remoteWebDriver.findElement(By.name("q"));
        q.sendKeys("itstep");
        q.submit();

    }
}
