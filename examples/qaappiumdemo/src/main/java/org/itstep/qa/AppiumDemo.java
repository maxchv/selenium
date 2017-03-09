package org.itstep.qa;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDemo {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capibilities = new DesiredCapabilities();
        capibilities.setCapability("device", "Android");
        //capibilities.setCapability("deviceName", "emulator-5554"); //update device name
        capibilities.setCapability("deviceName", "N7FQKV4TY9SG75QO");
        capibilities.setCapability("platformVersion", "5.1.1");
        capibilities.setCapability("platformName", "Android");
        capibilities.setCapability("browserName", "browser");


        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capibilities);
        driver.get("http://google.com");
    }
}
