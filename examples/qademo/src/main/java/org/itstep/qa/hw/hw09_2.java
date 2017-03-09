package org.itstep.qa.hw;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class hw09_2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Здрасте!!!");
        System.setProperty("webdriver.gecko.driver", "D:\\webdrivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\webdirvers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\shaptala\\Documents\\GitHub\\selenium\\examples\\test_pages\\automation-practice-switch-windows.html");
        WebElement alt = driver.findElement((By.id("colorVar")));
        alt.click();

        (new WebDriverWait(driver, 50))
                .until(new ExpectedCondition<Boolean>() {
                    @Override
                    public Boolean apply(WebDriver d) {
                        WebElement color = d.findElement(By.id("colorVar"));
                        String c1 = color.getCssValue("color");
                        System.out.println(c1);
                        return c1.equals("rgb(255, 255, 255)");
                    }
                });

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("alert('Bizz Buzz');");

    }
}