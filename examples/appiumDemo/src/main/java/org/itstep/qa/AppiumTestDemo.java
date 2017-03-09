package org.itstep.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class AppiumTestDemo {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("device", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "5.1.1");

        desiredCapabilities.setCapability("browserName", "browser"); // chrome

        WebDriver driver = new RemoteWebDriver(url, desiredCapabilities);

        driver.get("http://google.com");
        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("test mobile application using selenium webdriver");
        q.submit();
        try {
            Files.write(Paths.get("google.html"),
                    Arrays.asList(driver.getPageSource().split("\\n")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
