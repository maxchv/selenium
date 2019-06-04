import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class GoogleTest {

    private static WebDriver webDriver;

    @BeforeClass
    public static void init() {

        Path path = Paths.get(System.getProperty("user.dir"), "drivers", "chromedriver.exe");
        System.out.println(path.toString());
        System.setProperty("webdriver.chrome.driver",path.toString());

        webDriver = new ChromeDriver();

    }


    @AfterClass
    public static void destroy() {
        webDriver.quit();
        webDriver = null;
    }

    @Test
    public void googleTitleTes() {
        webDriver.get("https://www.google.com/");
        String actualTitle = webDriver.getTitle();
        String expectedTitle = "Google";
        assertEquals(expectedTitle,actualTitle);
    }
}
