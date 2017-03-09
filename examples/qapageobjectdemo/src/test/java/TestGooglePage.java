import org.itstep.qa.GooglePage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shaptala on 02.03.2017.
 */
public class TestGooglePage {

    static GooglePage page;
    static WebDriver driver;

    @BeforeClass
    public static void testUp () {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        page = PageFactory.initElements(driver, GooglePage.class);
    }

    @AfterClass
    public static void testDown() {
        driver.quit();
    }

    @Test
    public void testQuery() {
        page.setBaseUrl("http://google.com");
        String expected = "Результатов: примерно";
        String actual = page.query("selenium");
        Assert.assertTrue("Ошибка!!!",
                actual.contains(expected));
    }
}
