package org.itstep;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Locatable;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class JavaScriptDemo {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://itstep.dp.ua");
        // выполнение произвольного JavaScript
//        ((JavascriptExecutor)driver)
//                //.executeScript("alert('Hello from Java');");
//                .executeScript("window.location='http://google.com'");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
        for(int i=0; i<14; i++) {
            robot.mouseWheel(1);
            robot.delay(500);
        }
        WebElement link = driver.findElement(By.cssSelector("#menu-item-4307 > a"));
        int x = link.getLocation().getX();
        //link.getLocation().getY();
        int y = ((Locatable)link).getCoordinates().inViewPort().getY();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
