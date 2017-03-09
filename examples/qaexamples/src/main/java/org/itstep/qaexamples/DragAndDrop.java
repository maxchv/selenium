package org.itstep.qaexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 14.02.2017.
 */
public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setEnableNativeEvents(true);
        WebDriver driver = new ChromeDriver();//new FirefoxDriver(profile);

        String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
        driver.get(URL);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        //dragAndDropActions(driver);
        dragAndDropRobot(driver);
    }

    private static void dragAndDropRobot(WebDriver driver) throws InterruptedException, AWTException {
        Robot r = new Robot();
        for(int i=0; i<9; i++) {
            r.mouseWheel(1);
            r.delay(500);
        }
        r.setAutoDelay(500);
        WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        System.out.println("From.getTagName() = " + From.getTagName());
        WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        System.out.println("To.getTagName() = " + To.getTagName());
        System.out.println("From: " + From.getLocation());
        System.out.println("To: " + To.getLocation());

        r.mouseMove(100, 100);
        r.delay(1000);
        r.keyPress(KeyEvent.VK_F11);

        r.mouseMove(From.getLocation().getX()+1, From.getLocation().getY());

        int x = ((Locatable) From).getCoordinates().inViewPort().getX();
        int y = ((Locatable)From).getCoordinates().inViewPort().getY();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        r.mouseMove(x+1, y+1);
        r.delay(1000);
        r.mousePress(InputEvent.BUTTON1_MASK);
        r.delay(1000);
        x = ((Locatable) To).getCoordinates().inViewPort().getX();
        y = ((Locatable) To).getCoordinates().inViewPort().getY();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        r.mouseMove(x+1, y+1);
        r.mouseRelease(InputEvent.BUTTON1_MASK);

    }

    private static void dragAndDropActions(WebDriver driver) {


        WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

        System.out.println("From.getTagName() = " + From.getTagName());
        WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        System.out.println("To.getTagName() = " + To.getTagName());
        Actions builder = new Actions(driver);

        Action dragAndDrop = builder
                //.clickAndHold(From)
                //.moveToElement(To)
                //.release(To)
                .dragAndDrop(From, To)
                .build();

        dragAndDrop.perform();
    }
}
