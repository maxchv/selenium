package org.itstep.qa;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDemo {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.android();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723"), dc);
        driver.get("http://google.com");
    }
}
