
import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.WebDriver;

public class TestSuite {
//    @Rule
//    public SimpleRule simpleRule = new SimpleRule();

    @Rule
    public MyTestWatcher testWatcher = new MyTestWatcher();

    WebDriver driver;

    @BeforeClass
    public static void setupTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        HtmlLogger.getInstance().startLogger();
    }

    @AfterClass
    public static void endTests() {
        HtmlLogger.getInstance().endLogger();
    }

    @Before
    public void testUp() {
        //driver = new ChromeDriver();
    }

    @After
    public void testDown() {
        //driver.quit();
    }

    @Test
    public void testTitle() {
        System.out.println("TestSuite.testTitle");
        Assert.assertEquals(12.0, 12.1, 0.01);
    }

    @Test
    public void testLogin() throws Exception {
        System.out.println("TestSuite.testLogin");
        Assert.assertTrue("It should be true",false);
    }

    @Test
    public void testRegister() {
        System.out.println("TestSuite.testRegister");
    }

}
