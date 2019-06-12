package org.itstep.google;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Issue;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMainPage {
    WebDriver webDriver;

    @BeforeAll
    static void setUpEnv() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\max\\Desktop\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void setUp() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("window-size=1200x600");
        this.webDriver = new ChromeDriver();
    }

    @Test
    @Issue("ISSUE-1")
    void searchByGoogle() {
        MainPage page = MainPage.newPage(webDriver);
        page.openPage("http://google.com");
        page.search("selenium");
        page.makeScreenShot();
        Assertions.assertEquals("selenium - Поиск в Google", webDriver.getTitle());
    }

    @AfterEach
    void tearDown() {
        if(webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}
