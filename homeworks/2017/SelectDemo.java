package org.itstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaptala on 31.01.2017.
 */
public class SelectDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "file:///C:/xampp/htdocs/select.html";
        driver.get(url);

        //testSingleChoise(driver);
        Select addSelect = new Select(driver.findElement(By.id("additives")));
        addSelect.selectByIndex(0);
        Thread.sleep(1000);
        addSelect.selectByIndex(2);
        Thread.sleep(1000);
        addSelect.selectByVisibleText("Bacon");
        Thread.sleep(1000);
        addSelect.deselectByValue("Pepperoni");
        Thread.sleep(1000);

        List<String> expectedOptions = new ArrayList<String>();
        expectedOptions.add("Cheese");
        expectedOptions.add("Bacon");

        List<WebElement> allSelected = addSelect.getAllSelectedOptions();
        for(WebElement selected: allSelected) {
            if(!expectedOptions.contains(selected.getText())) {
                System.err.println("Value " + selected.getText() + " is not expected");
            }
        }
        System.out.println("All test passed");
    }

    private static void testSingleChoise(WebDriver driver) throws InterruptedException {
        WebElement autoWebElement = driver.findElement(By.id("auto"));
        Select autoSelect = new Select(autoWebElement);

        WebElement out1WebElement = driver.findElement(By.id("out1"));
        Thread.sleep(1000);
        autoSelect.selectByIndex(1);

        checkSelectedText(out1WebElement, "value:volvo", "Selected by index not passed");
        Thread.sleep(1000);
        autoSelect.selectByValue("saab");

        checkSelectedText(out1WebElement, "value:Saab", "Selected by value not passed");
        Thread.sleep(1000);
        autoSelect.selectByVisibleText("Audi");

        checkSelectedText(out1WebElement, "value:Audi", "Selected by visible text not passed");
        Thread.sleep(1000);
    }

    private static void checkSelectedText(WebElement out1WebElement, String expected, String errMessage) {
        if(!expected.equals(out1WebElement.getText())) {
            System.err.println(errMessage);
        } else {
            System.out.println("Passed");
        }
    }
}
