package org.itstep;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by shaptala on 07.03.2017.
 */
public class RemoteWebDriverDemo {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        //desiredCapabilities.setCapability("browserName", "firefox");
        //desiredCapabilities.setBrowserName("firefox");
        //desiredCapabilities.setPlatform(Platform.WINDOWS);
        for(int i=0; i<10; i++) {
            new Thread() {
                public void run() {
                    System.out.println("Thread: " + Thread.currentThread().getId());
                    URL remoteAddress = null;
                    try {
                        remoteAddress = new URL("http://127.0.0.1:4444/wd/hub");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                    DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome(); //new DesiredCapabilities();

                    WebDriver driver = new RemoteWebDriver(remoteAddress, desiredCapabilities);
                    driver.get("http://google.com");
                    WebElement q = driver.findElement(By.name("q"));
                    q.sendKeys("selenium");
                    q.submit();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    driver.quit();
                }
            }.start();
        }

    }
}
