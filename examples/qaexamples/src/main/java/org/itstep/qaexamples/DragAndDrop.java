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
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 14.02.2017.
 */
public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\webdrivers\\geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setEnableNativeEvents(true);
        WebDriver driver = new FirefoxDriver(profile);//ChromeDriver();

        String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

        driver.get(URL);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

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
