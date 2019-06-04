import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class GoogleTest {

    public static final String LOCALE_FILE = "file:///D:/%D0%93%D0%9A/QA%20%D0%BE%D1%81%D0%B5%D0%BD%D1%8C%202018/Auto%20Test/Lesson06/simple-html.html";
    private static ChromeDriver chromeDriver;

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();

        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void destroy() {
        chromeDriver.quit();

        chromeDriver = null;
    }

    @Test
    public void searchTest() {
        chromeDriver.get("http://google.com");
        Assert.assertEquals("Google", chromeDriver.getTitle());
    }

    @Test
    public void searchHelloWorldTest() throws InterruptedException {
        chromeDriver.get("http://google.com");
        WebElement searchEntry = chromeDriver.findElement(By.cssSelector("input.gLFyf"));
        System.out.println(searchEntry.getClass().getSimpleName());
        Thread.sleep(5000);
        searchEntry.sendKeys("hello world");
        searchEntry.submit();
        Thread.sleep(5000);
        Assert.assertEquals("hello world - Поиск в Google", chromeDriver.getTitle());
    }

    @Test
    public void simpleTest() throws InterruptedException {
        chromeDriver.get(LOCALE_FILE);
        Thread.sleep(2000);
//        Assert.assertEquals("Document",chromeDriver.getTitle());
        WebElement header = chromeDriver.findElement(By.id("header"));
        String actual = header.getText();
        String expected = "Header Div";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void classNameTest() {
        chromeDriver.get(LOCALE_FILE);
        List<WebElement> fistWords = chromeDriver.findElements(By.className("paragraph-start"));

        for (WebElement item : fistWords) {
            System.out.println(item.getText());
        }
    }

    @Test
    public void classNameSecondTest() {
        chromeDriver.get(LOCALE_FILE);
        List<WebElement> fistWords = chromeDriver.findElements(By.cssSelector(".paragraph-start"));

        for (WebElement item : fistWords) {
            System.out.println(item.getText());
        }
    }

    @Test
    public void linkTextTest() {
        chromeDriver.get(LOCALE_FILE);
        List<WebElement> links = chromeDriver.findElements(By.partialLinkText("Link"));
        for (WebElement link : links) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();
        }

    }

    @Test
    public void tagNameTest() {
        chromeDriver.get(LOCALE_FILE);

        List<WebElement> divs = chromeDriver.findElements(By.tagName("div"));
        for (WebElement div : divs) {
            System.out.println(div.getText());
        }
    }

    @Test
    public void xpathTest() {
        // . - текущий элемент
        // .. - родительский элемент

        //  / - внутрь элемента
        // // - неоприделенное количество элементов, вложенных
        // [@attribute-name] - указание атрибута

        chromeDriver.get("http://google.com");
        WebElement searchEntry = chromeDriver.findElement(By.cssSelector("input.gLFyf"));

        searchEntry.sendKeys("xml");
        searchEntry.submit();

        List<WebElement> googleLinks = chromeDriver.findElements(By.xpath("//div[@id='hdtb-msb']/div[1]//a"));

        Assert.assertEquals(googleLinks.size(), 9);
    }


    @Test
    public void linkTextXpathTest() {
        chromeDriver.get(LOCALE_FILE);
//        List<WebElement> links = chromeDriver.findElements(By.xpath("./html/body/*/ol//a | ./html/body/div/div/ol//a"));

        List<WebElement> firstLinks = chromeDriver.findElements(By.xpath("./html/body/*/ol//a"));
        List<WebElement> secondLinks = chromeDriver.findElements(By.xpath("./html/body/div/div/ol//a"));


//        PolicyUtils.Collections.combine(firstLinks,)
        for (WebElement link : firstLinks) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();
        }

        for (WebElement link : secondLinks) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();
        }

        System.out.println(firstLinks.size() + " "+ secondLinks.size());
        Assert.assertTrue(firstLinks.size() == 6 && secondLinks.size() == 6);
    }

}
