package org.itstep;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

class InputTest {

    private WebDriver driver;

    @BeforeAll
    static void setupEnvironment() throws IOException {
        var classLoader = InputTest.class.getClassLoader();
        var properties = new Properties();
        properties.load(classLoader.getResourceAsStream("config.properties"));
        if (properties.containsKey("chromeDriver")) {
            File driverFile = new File(classLoader
                    .getResource(properties.getProperty("chromeDriver")).getFile());
            System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
        }

        File testHtml = new File(classLoader
                .getResource("html/demo.html").getFile());

        System.setProperty("test.html", testHtml.getAbsolutePath());
    }

    @BeforeEach
    void setUpDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void checkBoxTest() throws InterruptedException {
        driver.get(System.getProperty("test.html"));
        Assertions.fail("Not implemented yet");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
