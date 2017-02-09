package org.itstep.qaexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 08.02.2017.
 */
public class Main {
    public static void  main(String ...args) {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/User/Documents/GitHub/selenium/examples/actions.html");

        WebElement one = driver.findElement(By.cssSelector("ol>li:first-child"));
        WebElement three = driver.findElement(By.cssSelector("ol>li:nth-child(3)"));
        WebElement five = driver.findElement(By.xpath("//li[5]"));

        Actions builder = new Actions(driver);
        builder.keyDown(Keys.CONTROL)
                //.moveToElement(one, 1, 1)
                .moveByOffset(one.getLocation().getX() + 1, one.getLocation().getY() + 1)
                .click()
                //.click(one)
                .click(three)
                .click(five)
                .keyUp(Keys.CONTROL);
        //one.click();
        //builder.perform();
        Action compositeAction = builder.build();
        compositeAction.perform();
    }
}
