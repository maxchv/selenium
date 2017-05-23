package org.itstep;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Created by shaptala on 23.05.2017.
 */
public class Demo {

    private final static String js;
    private final static String jQuery;
    private final static String script = "$(arguments[0]).simulateDragDrop({dropTarget: arguments[1]});";
    static {
        Path jsPath = Paths.get("./src/main/resources/drag_and_drop_helper.js");
        Path jQueryPath = Paths.get("./src/main/resources/jquery-1.11.2.min.js");
        String tmp1 = "";
        String tmp2 = "";

        try {
            tmp1 = Files.readAllLines(jsPath).stream().map(String::trim).collect(Collectors.joining());
            tmp2 = Files.readAllLines(jQueryPath).stream().collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        js = tmp1;
        jQuery = tmp2;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();

            simulateDnD(driver, "http://www.w3schools.com/html/html5_draganddrop.asp", "#drag1", "#div2");
            simulateDnD(driver, "http://the-internet.herokuapp.com/drag_and_drop", "#column-a", "#column-b");
//            simulateDnD(driver, "http://www.seleniumeasy.com/test/drag-and-drop-demo.html", "#todrag > span", "#mydropzone");
            simulateDnD(driver, "http://html5demos.com/drag", "#one", "#bin");
            simulateDnD(driver, "http://html5demos.com/drag", "#two", "#bin");
            simulateDnD(driver, "http://html5demos.com/drag", "#three", "#bin");

            JOptionPane.showMessageDialog(null, "Done");
        } finally {
            driver.quit();
        }
    }

    private static void simulateDnD(WebDriver driver, String url, String from, String to) throws InterruptedException {
        driver.get(url);
        ((JavascriptExecutor) driver).executeScript(jQuery);
        ((JavascriptExecutor) driver).executeScript(js);
        ((JavascriptExecutor) driver).executeScript(script, from, to);
        Thread.sleep(3000);
    }
}
